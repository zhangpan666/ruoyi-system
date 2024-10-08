package com.ruoyi.system.domain.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class BetRecordStatVO implements Serializable {

    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(example = "注单笔数")
    private int totalCount;

    @ApiModelProperty(example = "金额")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @ApiModelProperty(example = "输赢")
    private BigDecimal winLoseAmount = BigDecimal.ZERO;

}
