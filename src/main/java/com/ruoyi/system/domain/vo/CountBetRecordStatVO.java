package com.ruoyi.system.domain.vo;


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
public class CountBetRecordStatVO implements Serializable {

    @JSONField(format = DateUtils.DATE_FORMAT)
    @ApiModelProperty(example = "日期")
    private Date betDate;

    @ApiModelProperty(example = "星期")
    private String week;

    @ApiModelProperty(example = "注单笔数")
    private int totalCount;

    @ApiModelProperty(example = "金额")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @ApiModelProperty(example = "输赢")
    private BigDecimal winLoseAmount = BigDecimal.ZERO;

}
