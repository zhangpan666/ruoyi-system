package com.ruoyi.system.pojo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class LotteryPrizeStatDTO implements Serializable {

    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(value = "日期")
    private Date statDate;

    @ApiModelProperty(value = "总爆奖次数")
    private int totalPrizeCount;

    @ApiModelProperty(value = "总爆奖人次")
    private int totalPrizePeopleCount;

    @ApiModelProperty(value = "总爆奖金额")
    private BigDecimal totalPrizeAmount;

}
