package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 即时注单明细 - 输赢统计聚合
 */
@ApiModel(description = "即时注单明细输赢统计")
@Data
@Accessors(chain = true)
public class RealTimeOrderDetailStatVO {

    @ApiModelProperty(value = "总下注金额")
    private BigDecimal totalBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总可赢金额")
    private BigDecimal totalCanWinAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "输赢 = 总下注金额 - 总可赢金额（若该项开出时平台盈亏）")
    private BigDecimal winLose = BigDecimal.ZERO;

    @ApiModelProperty(value = "注单数")
    private Long orderCount = 0L;

    @ApiModelProperty(value = "用户数")
    private Long userCount = 0L;

    @ApiModelProperty(value = "本期最长连下期数")
    private Integer maxConsecutivePeriods = 0;

    @ApiModelProperty(value = "最长连下对应用户ID")
    private Long maxConsecutiveUserId;
}
