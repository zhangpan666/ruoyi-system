package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Alan   2025/7/21 22:04
 */
@ApiModel(description = "及时注单数据")
@Data
@Accessors(chain = true)
public class LotteryBetDataVO implements Serializable {


    @ApiModelProperty(example = "彩种ID")
    private String lotteryId;

    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    @ApiModelProperty(example = "玩法名称")
    private String playTypeName;

    @ApiModelProperty(example = "玩法编码")
    private String playTypeCode;

    @ApiModelProperty(example = "玩法明细编码")
    private String playTypeDetailCode;

    @ApiModelProperty(example = "玩法值")
    private String value;

    @ApiModelProperty(example = "玩法描述")
    private String description;

    @ApiModelProperty(example = "注单笔数")
    private String totalCount = "0";

    @ApiModelProperty(example = "总下注金额")
    private String totalBetAmount = "0.00";

    @ApiModelProperty(example = "可赢金额")
    private String canWinAmount = "0.00";

}
