package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 即时注单明细（按行下钻）
 */
@ApiModel(description = "即时注单明细")
@Data
@Accessors(chain = true)
public class RealTimeOrderDetailVO {

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "平台用户ID")
    private Long platformUserId;

    @ApiModelProperty(value = "投注金额")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "下注内容")
    private String displayBetContent;

    @ApiModelProperty(value = "可赢金额")
    private BigDecimal canWinAmount;

    @ApiModelProperty(value = "连下期数：以当前期为锚点向前连续投注的期数（含本期，首次 gap 即停）")
    private Integer consecutivePeriods = 1;
}
