package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@ApiModel(description = "投注统计 - 全平台合计")
@Data
@Accessors(chain = true)
public class BetStatOverviewVO {

    @ApiModelProperty(value = "总下注金额")
    private BigDecimal totalBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总有效投注金额")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总注单数")
    private Long totalOrderCount = 0L;

    @ApiModelProperty(value = "总用户数(去重)")
    private Long totalUserCount = 0L;

    @ApiModelProperty(value = "总可中奖金额")
    private BigDecimal totalCanWinAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总派彩金额(仅已结算)")
    private BigDecimal totalWinAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总盈亏（已结算=bet-win，未结算=bet-canWin）")
    private BigDecimal totalWinLose = BigDecimal.ZERO;

    @ApiModelProperty(value = "盈亏率% = totalWinLose / totalBetAmount * 100")
    private BigDecimal winLoseRate = BigDecimal.ZERO;

    @ApiModelProperty(value = "中奖率% = totalWinAmount / totalBetAmount * 100")
    private BigDecimal payoutRate = BigDecimal.ZERO;

    @ApiModelProperty(value = "人均下注金额")
    private BigDecimal avgBetPerUser = BigDecimal.ZERO;
}
