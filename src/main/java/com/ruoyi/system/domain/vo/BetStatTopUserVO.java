package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@ApiModel(description = "投注统计 - Top 用户")
@Data
@Accessors(chain = true)
public class BetStatTopUserVO {

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "平台名称")
    private String platformName;

    @ApiModelProperty(value = "平台用户ID")
    private Long platformUserId;

    @ApiModelProperty(value = "总下注金额")
    private BigDecimal totalBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "总盈亏（>0 平台赢，<0 平台输）")
    private BigDecimal totalWinLose = BigDecimal.ZERO;

    @ApiModelProperty(value = "注单数")
    private Long orderCount = 0L;
}
