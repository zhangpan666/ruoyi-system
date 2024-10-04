package com.ruoyi.system.pojo;


import com.alibaba.fastjson.annotation.JSONField;
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
public class BetRecordStatVO implements Serializable {

    @JSONField(format = DateUtils.DATE_FORMAT)
    @ApiModelProperty(value = "日期")
    private Date betDate;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(value = "注单笔数")
    private int totalCount;

    @ApiModelProperty(value = "投注人数")
    private int totalBetUserCount;

    @ApiModelProperty(value = "下注金额")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "有效下注金额")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "游戏输赢")
    private BigDecimal winLoseAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "玩法名称")
    private String playTypeName;

    @ApiModelProperty(value = "玩法code")
    private Byte playTypeCode;

    @ApiModelProperty(value = "玩法描述")
    private String description;

}
