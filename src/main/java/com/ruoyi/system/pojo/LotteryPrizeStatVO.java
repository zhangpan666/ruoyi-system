package com.ruoyi.system.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.light.core.utils.DateUtils;
import com.ruoyi.common.annotation.Excel;
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statDate;

    @ApiModelProperty(value = "总爆奖次数")
    @Excel(name = "总爆奖次数")
    private int totalPrizeCount;

    @ApiModelProperty(value = "总爆奖人次")
    @Excel(name = "总爆奖人次")
    private int totalPrizePeopleCount;

    @ApiModelProperty(value = "总爆奖金额")
    @Excel(name = "总爆奖金额")
    private BigDecimal totalPrizeAmount;

}
