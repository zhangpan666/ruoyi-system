package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.Lottery;
import com.ruoyi.system.domain.LotteryRelation;
import com.ruoyi.system.domain.vo.LotteryBetDataVO;
import com.ruoyi.system.domain.vo.RealTimeOrderVO;
import com.ruoyi.system.pojo.BetRecordDateStatVO;
import com.ruoyi.system.pojo.BetRecordStatVO;
import com.ruoyi.system.service.ILotteryRelationService;
import com.ruoyi.system.service.ILotteryService;
import org.jsoup.helper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BetRecordMapper;
import com.ruoyi.system.domain.BetRecord;
import com.ruoyi.system.service.IBetRecordService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 投注记录Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-11
 */
@Service
@Transactional
public class BetRecordServiceImpl implements IBetRecordService {
    @Autowired
    private BetRecordMapper betRecordMapper;

    @Autowired
    private ILotteryService lotteryService;

    @Autowired
    private ILotteryRelationService lotteryRelationService;

    /**
     * 查询投注记录
     *
     * @param id 投注记录主键
     * @return 投注记录
     */
    @Override
    public BetRecord selectBetRecordById(Long id) {
        return betRecordMapper.selectBetRecordById(id);
    }

    /**
     * 查询投注记录列表
     *
     * @param betRecord 投注记录
     * @return 投注记录
     */
    @Override
    public List<BetRecord> selectBetRecordList(BetRecord betRecord) {
        return betRecordMapper.selectBetRecordList(betRecord);
    }

    /**
     * 新增投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    @Override
    public int insertBetRecord(BetRecord betRecord) {
        betRecord.setCreateTime(DateUtils.getNowDate());
        return betRecordMapper.insertBetRecord(betRecord);
    }

    /**
     * 修改投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    @Override
    public int updateBetRecord(BetRecord betRecord) {
        betRecord.setUpdateTime(DateUtils.getNowDate());
        return betRecordMapper.updateBetRecord(betRecord);
    }

    /**
     * 批量删除投注记录
     *
     * @param ids 需要删除的投注记录主键
     * @return 结果
     */
    @Override
    public int deleteBetRecordByIds(Long[] ids) {
        return betRecordMapper.deleteBetRecordByIds(ids);
    }

    /**
     * 删除投注记录信息
     *
     * @param id 投注记录主键
     * @return 结果
     */
    @Override
    public int deleteBetRecordById(Long id) {
        return betRecordMapper.deleteBetRecordById(id);
    }

    @Override
    public BetRecordStatVO statBetRecord(BetRecord betRecord) {
        return betRecordMapper.statBetRecord(betRecord);
    }

    @Override
    public List<BetRecordStatVO> statBetRecordAndGroupByUserId(BetRecord betRecord) {
        return betRecordMapper.statBetRecordAndGroupByUserId(betRecord);
    }


    @Override
    public List<BetRecordDateStatVO> statBetRecordAndGroupByDate(BetRecord betRecord) {
        return betRecordMapper.statBetRecordAndGroupByDate(betRecord);
    }

    @Override
    public List<BetRecordStatVO> statBetRecordAndGroupByLotteryId(BetRecord betRecord) {
        return betRecordMapper.statBetRecordAndGroupByLotteryId(betRecord);
    }


    @Override
    public List<BetRecordStatVO> statBetRecordAndGroupByPlayTypeCode(BetRecord betRecord) {
        return betRecordMapper.statBetRecordAndGroupByPlayTypeCode(betRecord);
    }

    @Override
    public List<BetRecordStatVO> statBetRecordAndGroupByPlayTypeDetailCode(BetRecord betRecord) {
        return betRecordMapper.statBetRecordAndGroupByPlayTypeDetailCode(betRecord);
    }

    @Override
    public List<LotteryBetDataVO> statLotteryDataList(BetRecord betRecord) {
        if (betRecord.getPlayTypeCode() == null) {
            return betRecordMapper.getPlayTypeList(betRecord);
        }
        return betRecordMapper.statLotteryDataList(betRecord);
    }

    @Override
    public List<RealTimeOrderVO> realTimeOrder(Long id, String issueNo, Long userId, Byte type) {
        Lottery lottery = lotteryService.selectLotteryById(id);
        BetRecord betRecordParam = new BetRecord()
                .setLotteryId(id)
                .setIssueNo(StringUtil.isBlank(issueNo) ? lottery.getNextIssueNo() : issueNo)
                .setUserId(userId);
        List<RealTimeOrderVO> realTimeOrderList = Collections.emptyList();
        if (type == 1) {
            betRecordParam.setPlayTypeCode(type);
            List<LotteryRelation> lotteryRelations = lotteryRelationService.selectLotteryRelationList(new LotteryRelation().setYear(lottery.getNextLotteryYear()));
            Map<String, LotteryRelation> relationMap = lotteryRelations.stream()
                    .collect(Collectors.toMap(LotteryRelation::getNumber, lr -> lr));
            realTimeOrderList = betRecordMapper.realTimeOrderByNumber(betRecordParam);
            fill01to49(realTimeOrderList, relationMap);
        } else if (type == 2) {
            realTimeOrderList = betRecordMapper.realTimeOrderByType(betRecordParam);
            patchDXSSTypes(realTimeOrderList);
        } else if (type == 3) {
            realTimeOrderList = betRecordMapper.realTimeOrderByMantissa(betRecordParam);
            realTimeOrderList.removeIf(vo -> vo.getMantissa() == null);
            // 统计已有mantissa
            Set<String> existing = realTimeOrderList.stream()
                    .map(RealTimeOrderVO::getMantissa)
                    .collect(Collectors.toSet());
            for (RealTimeOrderVO realTimeOrderVO : realTimeOrderList) {
                String mantissa = realTimeOrderVO.getMantissa();
                realTimeOrderVO.setNumber(TAIL_MAP.get(mantissa));
            }
            // 补全缺失mantissa
            for (String mantissa : mantissaSet) {
                if (!existing.contains(mantissa)) {
                    RealTimeOrderVO vo = new RealTimeOrderVO();
                    vo.setMantissa(mantissa);
                    vo.setNumber(TAIL_MAP.get(mantissa));
                    realTimeOrderList.add(vo);
                }
            }
        } else if (type == 6) {
            realTimeOrderList = betRecordMapper.realTimeOrderByColour(betRecordParam);
            realTimeOrderList.removeIf(vo -> vo.getColour() == null);
            // 提取已有分类名
            Set<String> existingColours = new HashSet<>();
            for (RealTimeOrderVO r : realTimeOrderList) {
                existingColours.add(r.getColour());
            }
            // 遍历完整分类，若不存在则补一条默认记录
            for (String fullKey : COLOUR_MAP.keySet()) {
                if (!existingColours.contains(fullKey)) {
                    RealTimeOrderVO realTimeOrderVO = new RealTimeOrderVO();
                    realTimeOrderVO.setColour(fullKey);
                    realTimeOrderVO.setColor(getColorCode(realTimeOrderVO.getColour()));
                    realTimeOrderVO.setNumber(COLOUR_MAP.get(fullKey));
                    realTimeOrderList.add(realTimeOrderVO);
                }
            }
        } else if (type == 9) {
            Map<String, String> sx = getSx(lottery);
            realTimeOrderList = betRecordMapper.realTimeOrderByPtyx(betRecordParam);
            checkAndSyncSxList(realTimeOrderList, sx);
        } else if (type == 10) {
            Map<String, String> sx = getSx(lottery);
            realTimeOrderList = betRecordMapper.realTimeOrderBySx(betRecordParam);
            checkAndSyncSxList(realTimeOrderList, sx);
        }
        return realTimeOrderList;
    }

    private void checkAndSyncSxList(List<RealTimeOrderVO> realTimeOrderList, Map<String, String> fullSxMap) {
        // 1. 处理空列表
        if (realTimeOrderList == null) {
            realTimeOrderList = new ArrayList<>();
        }
        // 1.1 移除列表中的null元素和sx为null的元素
        realTimeOrderList.removeIf(vo -> vo == null || vo.getSx() == null);
        // 2. 构建已有生肖的Map（便于快速查找）
        Map<String, RealTimeOrderVO> existingSxMap = new HashMap<>();
        for (RealTimeOrderVO vo : realTimeOrderList) {
            if (vo != null && vo.getSx() != null) {
                existingSxMap.put(vo.getSx(), vo);
            }
        }
        // 3. 遍历完整生肖，同步number并补全缺失项
        for (Map.Entry<String, String> entry : fullSxMap.entrySet()) {
            String sx = entry.getKey();
            String targetNumber = entry.getValue();
            if (existingSxMap.containsKey(sx)) {
                // 若生肖已存在，更新其number字段
                RealTimeOrderVO existingVO = existingSxMap.get(sx);
                existingVO.setNumber(targetNumber);
            } else {
                // 若生肖缺失，创建新对象并设置number
                RealTimeOrderVO missingVO = new RealTimeOrderVO();
                missingVO.setSx(sx);
                missingVO.setNumber(targetNumber);
                realTimeOrderList.add(missingVO);
            }
        }
        // 4. 按完整生肖顺序排序
        List<String> sortedSx = new ArrayList<>(fullSxMap.keySet());
        // 判断是否存在有效数据（totalBetAmount > 0.00）
        boolean hasValidData = realTimeOrderList.stream()
                .anyMatch(vo -> vo != null
                        && vo.getTotalBetAmount() != null
                        // 字符串转BigDecimal后比较
                        && new BigDecimal(vo.getTotalBetAmount()).compareTo(BigDecimal.ZERO) > 0);
        if (hasValidData) {
            // 有有效数据：按totalBetAmount降序排序
            realTimeOrderList.sort((vo1, vo2) -> {
                // 处理null和空字符串，默认转为0.00
                String amountStr1 = (vo1.getTotalBetAmount() == null || vo1.getTotalBetAmount().trim().isEmpty())
                        ? "0.00" : vo1.getTotalBetAmount();
                String amountStr2 = (vo2.getTotalBetAmount() == null || vo2.getTotalBetAmount().trim().isEmpty())
                        ? "0.00" : vo2.getTotalBetAmount();
                // 转换为BigDecimal进行数值比较
                BigDecimal amount1 = new BigDecimal(amountStr1);
                BigDecimal amount2 = new BigDecimal(amountStr2);
                // 降序排列（金额大的在前）
                return amount2.compareTo(amount1);
            });
        } else {
            // 无有效数据：按生肖固定顺序排序
            realTimeOrderList.sort(Comparator.comparingInt(vo -> sortedSx.indexOf(vo.getSx())));
        }
    }

    private Map<String, String> getSx(Lottery lottery) {
        List<RealTimeOrderVO> ptyxList = lotteryRelationService.selectSxList(lottery.getNextLotteryYear());
        return ptyxList.stream()
                // 过滤掉null元素或sx为null的元素
                .filter(vo -> vo != null && vo.getSx() != null)
                // 以sx为键，number为值（若有重复sx，保留最后一个）
                .collect(Collectors.toMap(
                        RealTimeOrderVO::getSx,    // key：提取sx
                        RealTimeOrderVO::getNumber, // value：提取number
                        (existingValue, newValue) -> newValue // 遇到重复key时的处理：保留新值
                ));
    }

    public static void fill01to49(List<RealTimeOrderVO> list, Map<String, LotteryRelation> relationMap) {
        // 1. 颜色映射
        Map<Byte, String> colorMap = new HashMap<>();
        colorMap.put((byte)1, "红色");
        colorMap.put((byte)2, "蓝色");
        colorMap.put((byte)3, "绿色");

        // 原有号码映射，便于复用
        Map<String, RealTimeOrderVO> voMap = list.stream()
                .filter(vo -> vo.getNumber() != null)
                .peek(vo -> {
                    LotteryRelation rel = relationMap.get(vo.getNumber());
                    vo.setSx(rel.getSx());
                    vo.setColor(String.valueOf(rel.getColor()));
                    vo.setColour(colorMap.getOrDefault(rel.getColor(), ""));
                    vo.setMantissa(vo.getNumber().substring(vo.getNumber().length() - 1));
                })
                .collect(Collectors.toMap(RealTimeOrderVO::getNumber, Function.identity(), (a, b) -> a));

        // 生成 01–49 全量，并复用或新建 VO
        List<RealTimeOrderVO> fullList = IntStream.rangeClosed(1, 49)
                .mapToObj(i -> String.format("%02d", i))
                .map(num -> voMap.computeIfAbsent(num, n -> {
                    LotteryRelation rel = relationMap.get(n);
                    RealTimeOrderVO v = new RealTimeOrderVO();
                    v.setNumber(n);
                    v.setType(getDaXiaoDanShuangType(n));
                    v.setSx(rel.getSx());
                    v.setColor(String.valueOf(rel.getColor()));
                    v.setColour(colorMap.getOrDefault(rel.getColor(), ""));
                    v.setMantissa(n.substring(n.length() - 1));
                    return v;
                })).sorted(Comparator
                        .comparing(RealTimeOrderVO::getTotalBetAmount,
                                Comparator.nullsLast(Comparator.naturalOrder()))
                        .reversed()).collect(Collectors.toList());
        // 替换原列表
        list.clear();
        list.addAll(fullList);
    }


    public static String getColorCode(String text) {
        if (text == null) {
            return "0";
        }
        if (text.contains("红")) {
            return "1";
        } else if (text.contains("蓝")) {
            return "2";
        } else if (text.contains("绿")) {
            return "3";
        }
        return "0";
    }


    /**
     * 根据号码字符串生成 "大/小/和" + "/" + "单/双/和"
     *
     * @param num 号码（"01"-"49"）
     * @return 例："大/单"、"小/双"、"和/和"
     */
    public static String getDaXiaoDanShuangType(String num) {
        if (num == null || num.isEmpty()) {
            return null;
        }
        int n;
        try {
            n = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return null;
        }
        String daXiao;
        String danShuang;
        if (n == 49) {
            daXiao = "和";
            danShuang = "和";
        } else {
            daXiao = n >= 25 ? "大" : "小";
            danShuang = n % 2 == 0 ? "双" : "单";
        }
        return daXiao + "/" + danShuang;
    }

    public static void patchDXSSTypes(List<RealTimeOrderVO> realTimeOrderList) {
        realTimeOrderList.removeIf(vo -> vo.getType() == null);
        Set<String> existingTypes = realTimeOrderList.stream()
                .map(RealTimeOrderVO::getType)
                .collect(Collectors.toSet());
        for (Map.Entry<String, String> entry : DXSSTypeMap.entrySet()) {
            String type = entry.getKey();
            if (!existingTypes.contains(type)) {
                RealTimeOrderVO vo = new RealTimeOrderVO();
                vo.setType(type);
                vo.setNumber(entry.getValue());
                realTimeOrderList.add(vo);
            }
        }
    }

    // 所有应该存在的分类（如 CASE WHEN 中列出的）
    private static final Map<String, String> COLOUR_MAP = new LinkedHashMap<>();

    static {
        COLOUR_MAP.put("红波", "01,02,07,08,12,13,18,19,23,24,29,30,34,35,40,45,46");
        COLOUR_MAP.put("红单", "01,07,13,19,23,29,35,45");
        COLOUR_MAP.put("红双", "02,08,12,18,24,30,34,40,46");
        COLOUR_MAP.put("红大", "29,30,34,35,40,45,46");
        COLOUR_MAP.put("红小", "01,02,07,08,12,13,18,19,23,24");
        COLOUR_MAP.put("红大单", "29,35,45");
        COLOUR_MAP.put("红大双", "30,34,40,46");
        COLOUR_MAP.put("红小单", "01,07,13,19,23");
        COLOUR_MAP.put("红小双", "02,08,12,18,24");

        COLOUR_MAP.put("蓝波", "03,04,09,10,14,15,20,25,26,31,36,37,41,42,47,48");
        COLOUR_MAP.put("蓝单", "03,09,15,25,31,37,41,47");
        COLOUR_MAP.put("蓝双", "04,10,14,20,26,36,42,48");
        COLOUR_MAP.put("蓝大", "25,26,31,36,37,41,42,47,48");
        COLOUR_MAP.put("蓝小", "03,04,09,10,14,15,20");
        COLOUR_MAP.put("蓝大单", "25,31,37,41,47");
        COLOUR_MAP.put("蓝大双", "26,36,42,48");
        COLOUR_MAP.put("蓝小单", "03,09,15");
        COLOUR_MAP.put("蓝小双", "04,10,14,20");

        COLOUR_MAP.put("绿波", "05,06,11,16,17,21,22,27,28,32,33,38,39,43,44,49");
        COLOUR_MAP.put("绿单", "05,11,17,21,27,33,39,43");
        COLOUR_MAP.put("绿双", "06,16,22,28,32,38,44");
        COLOUR_MAP.put("绿大", "27,28,32,33,38,39,43,44");
        COLOUR_MAP.put("绿小", "05,06,11,16,17,21,22");
        COLOUR_MAP.put("绿大单", "27,33,39,43");
        COLOUR_MAP.put("绿大双", "28,32,38,44");
        COLOUR_MAP.put("绿小单", "05,11,17,21");
        COLOUR_MAP.put("绿小双", "06,16,22");
    }

    private static final Map<String, String> DXSSTypeMap = new LinkedHashMap<>();

    static {
        DXSSTypeMap.put("大", "25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48");
        DXSSTypeMap.put("小", "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        DXSSTypeMap.put("单", "01,03,05,07,09,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47");
        DXSSTypeMap.put("双", "02,04,06,08,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48");
        DXSSTypeMap.put("和", "49");
    }

    // 定义尾数0~9
    List<String> mantissaSet = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
    private static final Map<String, String> TAIL_MAP = new LinkedHashMap<>();

    static {
        TAIL_MAP.put("0", "10,20,30,40");
        TAIL_MAP.put("1", "01,11,21,31,41");
        TAIL_MAP.put("2", "02,12,22,32,42");
        TAIL_MAP.put("3", "03,13,23,33,43");
        TAIL_MAP.put("4", "04,14,24,34,44");
        TAIL_MAP.put("5", "05,15,25,35,45");
        TAIL_MAP.put("6", "06,16,26,36,46");
        TAIL_MAP.put("7", "07,17,27,37,47");
        TAIL_MAP.put("8", "08,18,28,38,48");
        TAIL_MAP.put("9", "09,19,29,39,49");
    }
}
