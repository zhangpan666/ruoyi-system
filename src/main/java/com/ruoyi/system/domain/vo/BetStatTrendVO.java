package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@ApiModel(description = "投注统计 - 趋势点")
@Data
@Accessors(chain = true)
public class BetStatTrendVO {

    @ApiModelProperty(value = "X 轴坐标（日期 yyyy-MM-dd 或 期号）")
    private String label;

    @ApiModelProperty(value = "总下注")
    private BigDecimal totalBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总盈亏")
    private BigDecimal totalWinLose = BigDecimal.ZERO;

    @ApiModelProperty(value = "注单数")
    private Long orderCount = 0L;
}
