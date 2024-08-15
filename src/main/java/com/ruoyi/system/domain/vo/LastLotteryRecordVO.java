package com.ruoyi.system.domain.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.light.core.utils.DateUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@ApiModel(description = "开奖记录")
@Data
@Accessors(chain = true)
public class LastLotteryRecordVO implements Serializable {

    private static final long serialVersionUID = 1688808505098563443L;

    @ApiModelProperty(example = "视频地址")
    private String videoUrl;

    @ApiModelProperty(example = "id")
    private Long id;

    @ApiModelProperty(example = "开奖时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date lotteryTime;

    @ApiModelProperty(example = "下一期封盘时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date nextCloseTime;

    @ApiModelProperty(example = "下次开奖时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date nextLotteryTime;

    @ApiModelProperty(example = "年份")
    private Integer year;

    @ApiModelProperty(example = "期号")
    private String issueNo;

    @ApiModelProperty(value = "数字")
    private List<LotterySingleNumberInfo> numberList;

    @ApiModelProperty(example = "1-显示视频，0-不显示视频")
    private Byte display = 0;

    @ApiModelProperty(example = "下一期开奖年份")
    private Integer nextLotteryYear;

    @ApiModelProperty(example = "下一期开奖期号")
    private String nextLotteryIssueNo;

    @ApiModelProperty(example = "封盘倒计时，单位毫秒")
    private long closeCount;

    @ApiModelProperty(example = "开奖倒计时，单位毫秒")
    private long openCount;

    @ApiModelProperty(example = "开奖状态，0-下注，1-封盘，2-开奖中")
    private Byte openStatus;


}
