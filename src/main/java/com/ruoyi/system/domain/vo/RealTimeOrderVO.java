package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Alan   2025/7/24 14:34
 */
@ApiModel(description = "及时注单数据")
@Data
@Accessors(chain = true)
public class RealTimeOrderVO {

    /**
     * 号码
     */
    @ApiModelProperty(example = "号码")
    private String number;

    /**
     * 生肖
     */
    @ApiModelProperty(example = "生肖")
    private String sx;

    /**
     * 颜色
     */
    @ApiModelProperty(example = "颜色")
    private String colour;

    @ApiModelProperty(example = "颜色(1红色，2-蓝色，3-绿色)")
    private String color;

    @ApiModelProperty(example = "类型")
    private String type;

    @ApiModelProperty(example = "尾数")
    private String mantissa;

    /**
     * 用户数
     */
    @ApiModelProperty(example = "用户数")
    private String userCount = "0";

    /**
     * 注单数
     */
    @ApiModelProperty(example = "注单数")
    public String orderCount = "0";

    /**
     * 投注金额
     */
    @ApiModelProperty(example = "投注金额")
    private String totalBetAmount = "0.00";

    /**
     * 可赢金额
     */
    @ApiModelProperty(example = "可赢金额")
    private String totalWinAmount = "0.00";
}
