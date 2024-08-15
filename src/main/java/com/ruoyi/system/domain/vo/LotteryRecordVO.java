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
public class LotteryRecordVO implements Serializable {

    private static final long serialVersionUID = 1688808505098563443L;

    @ApiModelProperty(example = "id")
    private Long id;

    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    @ApiModelProperty(example = "开奖时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date lotteryTime;

    @ApiModelProperty(example = "年份")
    private Integer year;

    @ApiModelProperty(example = "期数")
    private Integer period;

    @ApiModelProperty(example = "期号")
    private String issueNo;

    @ApiModelProperty(example = "下一期开奖期号")
    private String nextIssueNo;

    @ApiModelProperty(value = "数字")
    private List<LotterySingleNumberInfo> numberList;

    @ApiModelProperty(example = "开奖视频地址")
    private String videoUrl;

}
