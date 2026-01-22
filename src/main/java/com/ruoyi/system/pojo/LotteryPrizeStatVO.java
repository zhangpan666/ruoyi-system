package com.ruoyi.system.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.light.core.utils.DateUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class LotteryPrizeStatVO implements Serializable {

    @ApiModelProperty(value = "日期")
    @JSONField(format = DateUtils.DATE_FORMAT)
    private Date statDate;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(value = "总爆奖次数")
    private int totalPrizeCount;

    @ApiModelProperty(value = "总爆奖人次")
    private int totalPrizePeopleCount;

    @ApiModelProperty(value = "总爆奖金额")
    private BigDecimal totalPrizeAmount;

}
