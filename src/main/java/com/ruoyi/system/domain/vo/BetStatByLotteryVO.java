package com.ruoyi.system.domain.vo;

import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@ApiModel(description = "投注统计 - 按彩种明细")
@Data
@Accessors(chain = true)
public class BetStatByLotteryVO {

    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    @Excel(name = "期数")
    @ApiModelProperty(value = "期数(去重)")
    private Long issueCount = 0L;

    @Excel(name = "总下注金额")
    @ApiModelProperty(value = "总下注金额")
    private BigDecimal totalBetAmount = BigDecimal.ZERO;

    @Excel(name = "总有效投注")
    @ApiModelProperty(value = "总有效投注")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;

    @Excel(name = "注单数")
    @ApiModelProperty(value = "注单数")
    private Long orderCount = 0L;

    @Excel(name = "用户数")
    @ApiModelProperty(value = "用户数(去重)")
    private Long userCount = 0L;

    @Excel(name = "总可中奖")
    @ApiModelProperty(value = "总可中奖金额")
    private BigDecimal totalCanWinAmount = BigDecimal.ZERO;

    @Excel(name = "总派彩")
    @ApiModelProperty(value = "总派彩金额")
    private BigDecimal totalWinAmount = BigDecimal.ZERO;

    @Excel(name = "总盈亏")
    @ApiModelProperty(value = "总盈亏")
    private BigDecimal totalWinLose = BigDecimal.ZERO;

    @Excel(name = "盈亏率%")
    @ApiModelProperty(value = "盈亏率%")
    private BigDecimal winLoseRate = BigDecimal.ZERO;

    @Excel(name = "中奖率%")
    @ApiModelProperty(value = "中奖率%")
    private BigDecimal payoutRate = BigDecimal.ZERO;
}
