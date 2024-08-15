package com.ruoyi.system.domain.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.light.core.utils.DateUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class LotteryVO implements Serializable {

    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(example = "彩种名称")
    private String name;

    @ApiModelProperty(example = "彩种code")
    private String code;

    @ApiModelProperty(example = "排序")
    private Integer sort;

    @ApiModelProperty(example = "图标")
    private String icon;

    @ApiModelProperty(example = "宽度")
    private Integer width;

    @ApiModelProperty(example = "高度")
    private Integer height;

    @ApiModelProperty(example = "下一期封盘时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date nextCloseTime;

    @ApiModelProperty(example = "下一期开奖时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date nextLotteryTime;

    @ApiModelProperty(example = "下一期开奖年份")
    private Integer nextLotteryYear;

    @ApiModelProperty(example = "下一期开奖期号")
    private String nextIssueNo;

    @ApiModelProperty(example = "封盘倒计时，单位毫秒")
    private long closeCount;

    @ApiModelProperty(example = "开奖倒计时，单位毫秒")
    private long openCount;

    @ApiModelProperty(example = "开奖状态，0-下注，1-封盘，2-开奖中")
    private Byte openStatus;

}
