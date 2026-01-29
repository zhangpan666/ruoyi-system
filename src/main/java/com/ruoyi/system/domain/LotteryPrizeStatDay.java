package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 爆奖每日汇总对象 t_lottery_prize_stat_day
 *
 * @author ruoyi
 * @date 2026-01-29
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryPrizeStatDay
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "日期")
    private Date statDate;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /**
     * 彩种名称
     */
    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    /** 投注金额 */
    @Excel(name = "投注金额")
    @ApiModelProperty(value = "投注金额")
    private BigDecimal totalBetAmount;

    /** 爆奖次数 */
    @Excel(name = "爆奖次数")
    @ApiModelProperty(value = "爆奖次数")
    private Integer totalPrizeCount;

    /** 爆奖人数 */
    @Excel(name = "爆奖人数")
    @ApiModelProperty(value = "爆奖人数")
    private Integer totalPrizePeopleCount;

    /** 爆奖金额 */
    @Excel(name = "爆奖金额")
    @ApiModelProperty(value = "爆奖金额")
    private BigDecimal totalPrizeAmount;

    /** 奖池提取金额 */
    @Excel(name = "奖池提取金额")
    @ApiModelProperty(value = "奖池提取金额")
    private BigDecimal totalJackpotExtractionAmount;

    /** 奖池余额 */
    @Excel(name = "奖池余额")
    @ApiModelProperty(value = "奖池余额")
    private BigDecimal jackpotBalance;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "创建时间")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
