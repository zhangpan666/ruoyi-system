package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.dto.BetStatQueryParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.system.domain.Lottery;
import com.ruoyi.system.domain.vo.BetStatByLotteryVO;
import com.ruoyi.system.domain.vo.BetStatOverviewVO;
import com.ruoyi.system.domain.vo.BetStatTopUserVO;
import com.ruoyi.system.domain.vo.BetStatTopUsersDualVO;
import com.ruoyi.system.domain.vo.BetStatTrendVO;
import com.ruoyi.system.mapper.BetStatMapper;
import com.ruoyi.system.service.IBetStatService;
import com.ruoyi.system.service.ILotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BetStatServiceImpl implements IBetStatService {

    @Autowired
    private BetStatMapper betStatMapper;

    @Autowired
    private ILotteryService lotteryService;

    /** 给 byLottery 结果统一回填 lotteryName（避开 sharding-jdbc 的 JOIN 缺陷） */
    private void fillLotteryNames(List<BetStatByLotteryVO> list) {
        if (list == null || list.isEmpty()) return;
        Map<Long, String> nameMap = lotteryService.selectLotteryList(new Lottery()).stream()
                .collect(Collectors.toMap(Lottery::getId, Lottery::getName, (a, b) -> a));
        list.forEach(v -> v.setLotteryName(nameMap.get(v.getLotteryId())));
    }

    /** 拉全量 (lottery_id, user_id/issue_no) 在 Java 端 Set 去重计数 */
    private void fillLotteryUserAndIssueCounts(List<BetStatByLotteryVO> list, BetStatQueryParam param) {
        if (list == null || list.isEmpty()) return;

        // 按彩种聚合 distinct user_id
        Map<Long, Set<Long>> userSetByLottery = new HashMap<>();
        for (Map<String, Object> row : betStatMapper.selectAllLotteryUserPairs(param)) {
            Object lid = row.get("lotteryId"), uid = row.get("userId");
            if (lid == null || uid == null) continue;
            userSetByLottery
                    .computeIfAbsent(((Number) lid).longValue(), k -> new HashSet<>())
                    .add(((Number) uid).longValue());
        }

        // 按彩种聚合 distinct issue_no
        Map<Long, Set<String>> issueSetByLottery = new HashMap<>();
        for (Map<String, Object> row : betStatMapper.selectAllLotteryIssuePairs(param)) {
            Object lid = row.get("lotteryId"), iss = row.get("issueNo");
            if (lid == null || iss == null) continue;
            issueSetByLottery
                    .computeIfAbsent(((Number) lid).longValue(), k -> new HashSet<>())
                    .add(String.valueOf(iss));
        }

        list.forEach(v -> {
            v.setUserCount((long) userSetByLottery.getOrDefault(v.getLotteryId(), new HashSet<>()).size());
            v.setIssueCount((long) issueSetByLottery.getOrDefault(v.getLotteryId(), new HashSet<>()).size());
        });
    }

    @Override
    public BetStatOverviewVO overview(BetStatQueryParam param) {
        BetStatOverviewVO vo = betStatMapper.overview(param);
        if (vo == null) vo = new BetStatOverviewVO();
        // 拉全量 user_id 在 Java 端 Set 去重（绕开 sharding-jdbc 跨分表 DISTINCT 合并 bug）
        List<Long> userIds = betStatMapper.selectAllUserIds(param);
        Set<Long> distinctUsers = userIds == null ? new HashSet<>() : new HashSet<>(userIds);
        vo.setTotalUserCount((long) distinctUsers.size());
        fillRates(vo);
        return vo;
    }

    @Override
    public List<BetStatByLotteryVO> byLottery(BetStatQueryParam param) {
        List<BetStatByLotteryVO> list = betStatMapper.byLottery(param);
        if (list != null) {
            list.forEach(this::fillRates);
            fillLotteryNames(list);
            fillLotteryUserAndIssueCounts(list, param);
        }
        return list;
    }

    @Override
    public List<BetStatTrendVO> trend(BetStatQueryParam param) {
        if ("issue".equalsIgnoreCase(param.getTrendGroupBy())) {
            return betStatMapper.trendByIssue(param);
        }
        return betStatMapper.trendByDay(param);
    }

    @Override
    public List<BetStatByLotteryVO> topLotteries(BetStatQueryParam param, String order) {
        List<BetStatByLotteryVO> list = betStatMapper.topLotteries(param, order);
        if (list != null) {
            list.forEach(this::fillRates);
            fillLotteryNames(list);
            fillLotteryUserAndIssueCounts(list, param);
        }
        return list;
    }

    @Override
    public List<BetStatTopUserVO> topUsers(BetStatQueryParam param, String order) {
        return betStatMapper.topUsers(param, order);
    }

    /**
     * 单事务双查询：MySQL InnoDB 默认 REPEATABLE READ，保证两次 SELECT 看到同一快照，
     * 杜绝"同一个用户同时出现在赢/输两个表"的脏数据。
     */
    @Override
    @Transactional(readOnly = true)
    public BetStatTopUsersDualVO topUsersDual(BetStatQueryParam param,
                                              int lossPageNum, int lossPageSize,
                                              int winPageNum, int winPageSize) {
        // 大额赢用户：winLose ASC（最负在前）
        PageHelper.startPage(lossPageNum, lossPageSize);
        List<BetStatTopUserVO> lossList = betStatMapper.topUsers(param, "ASC");
        PageInfo<BetStatTopUserVO> lossInfo = new PageInfo<>(lossList);

        // 大额输用户：winLose DESC（最正在前）
        PageHelper.startPage(winPageNum, winPageSize);
        List<BetStatTopUserVO> winList = betStatMapper.topUsers(param, "DESC");
        PageInfo<BetStatTopUserVO> winInfo = new PageInfo<>(winList);

        return new BetStatTopUsersDualVO()
                .setLossList(lossList)
                .setLossTotal(lossInfo.getTotal())
                .setWinList(winList)
                .setWinTotal(winInfo.getTotal());
    }

    /** 派生指标统一在 service 算，不在 SQL 里搞 */
    private void fillRates(BetStatOverviewVO vo) {
        BigDecimal bet = nz(vo.getTotalBetAmount());
        if (bet.compareTo(BigDecimal.ZERO) > 0) {
            vo.setWinLoseRate(nz(vo.getTotalWinLose())
                    .multiply(BigDecimal.valueOf(100))
                    .divide(bet, 2, RoundingMode.HALF_UP));
            vo.setPayoutRate(nz(vo.getTotalWinAmount())
                    .multiply(BigDecimal.valueOf(100))
                    .divide(bet, 2, RoundingMode.HALF_UP));
            if (vo.getTotalUserCount() != null && vo.getTotalUserCount() > 0) {
                vo.setAvgBetPerUser(bet.divide(
                        BigDecimal.valueOf(vo.getTotalUserCount()), 2, RoundingMode.HALF_UP));
            }
        }
    }

    private void fillRates(BetStatByLotteryVO vo) {
        BigDecimal bet = nz(vo.getTotalBetAmount());
        if (bet.compareTo(BigDecimal.ZERO) > 0) {
            vo.setWinLoseRate(nz(vo.getTotalWinLose())
                    .multiply(BigDecimal.valueOf(100))
                    .divide(bet, 2, RoundingMode.HALF_UP));
            vo.setPayoutRate(nz(vo.getTotalWinAmount())
                    .multiply(BigDecimal.valueOf(100))
                    .divide(bet, 2, RoundingMode.HALF_UP));
        }
    }

    private BigDecimal nz(BigDecimal v) {
        return v == null ? BigDecimal.ZERO : v;
    }
}
