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
    @ApiModelProperty(example = "日期")
    private Date betDate;

    @ApiModelProperty(example = "用户ID")
    private Long userId;

    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(example = "注单笔数")
    private int totalCount;

    @ApiModelProperty(example = "投注人数")
    private int totalUserCount;

    @ApiModelProperty(example = "下注金额")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    @ApiModelProperty(example = "有效下注金额")
    private BigDecimal totalValidBetAmount = BigDecimal.ZERO;

    @ApiModelProperty(example = "游戏输赢")
    private BigDecimal winLoseAmount = BigDecimal.ZERO;

    @ApiModelProperty(example = "玩法名称")
    private String playTypeName;

    @ApiModelProperty(example = "玩法code")
    private Byte playTypeCode;

    @ApiModelProperty(example = "玩法描述")
    private String description;

}
