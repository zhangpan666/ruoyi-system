package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 爆奖配置对象 t_lottery_prize_config
 *
 * @author ruoyi
 * @date 2025-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryPrizeConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @Excel(name = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 提取比例 */
    @Excel(name = "提取比例")
    private String extractionRatio;

    /** 总金额 */
    @Excel(name = "总金额")
    private BigDecimal totalAmount;

    /** 触发金额 */
    @Excel(name = "触发金额")
    private BigDecimal triggerAmount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态", readConverterExp = "1=有效,0=无效")
    private Byte status;

    /** 最近爆奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "最近爆奖时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lastTriggerTime;

    /** 最近爆奖金额 */
    @Excel(name = "最近爆奖金额")
    private BigDecimal lastPrizeAmount;

    /** 目标用户类型，1-所有用户，2-指定用户，3-盈利用户，4-亏损用户，5-打码量较高用户 */
    @Excel(name = "目标用户类型", readConverterExp = "1=所有用户,2=指定用户,3=盈利用户,4=亏损用户,5=打码量较高用户")
    private Long targetUserType;

    /** 指定用户id */
    @Excel(name = "指定用户id")
    private String targetUserIds;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date targetBeginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date targetEndTime;

    /** 打码量前多少名 */
    @Excel(name = "打码量前多少名")
    private Integer totalBetAmountRank;


}
