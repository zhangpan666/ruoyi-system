package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.dto.BetStatQueryParam;
import com.ruoyi.system.domain.vo.BetStatByLotteryVO;
import com.ruoyi.system.domain.vo.BetStatOverviewVO;
import com.ruoyi.system.domain.vo.BetStatTopUserVO;
import com.ruoyi.system.domain.vo.BetStatTrendVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 投注统计 Mapper
 */
public interface BetStatMapper {

    BetStatOverviewVO overview(@Param("param") BetStatQueryParam param);

    List<BetStatByLotteryVO> byLottery(@Param("param") BetStatQueryParam param);

    List<BetStatTrendVO> trendByDay(@Param("param") BetStatQueryParam param);

    List<BetStatTrendVO> trendByIssue(@Param("param") BetStatQueryParam param);

    /** order: ASC=亏损排序 (winLose 最小)；DESC=盈利排序 (winLose 最大)。分页由 PageHelper 处理 */
    List<BetStatByLotteryVO> topLotteries(@Param("param") BetStatQueryParam param, @Param("order") String order);

    /** order: ASC=平台输排序 (winLose 最小=用户赢钱多)；DESC=平台赢排序 (winLose 最大=用户输钱多) */
    List<BetStatTopUserVO> topUsers(@Param("param") BetStatQueryParam param, @Param("order") String order);

    /** 全量 user_id（含重复），Java 用 Set 去重——绕开 sharding-jdbc 的 DISTINCT 跨分表 bug */
    List<Long> selectAllUserIds(@Param("param") BetStatQueryParam param);

    /** 全量 (lottery_id, user_id) 对，Java 端 group by lotteryId + Set 去重 */
    List<Map<String, Object>> selectAllLotteryUserPairs(@Param("param") BetStatQueryParam param);

    /** 全量 (lottery_id, issue_no) 对，Java 端 group by lotteryId + Set 去重 */
    List<Map<String, Object>> selectAllLotteryIssuePairs(@Param("param") BetStatQueryParam param);
}
