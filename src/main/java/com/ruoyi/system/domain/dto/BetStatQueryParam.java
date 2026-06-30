package com.ruoyi.system.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 投注统计 - 查询参数
 *
 * 日期范围 (beginTime/endTime) 与 期号范围 (issueNoFrom/issueNoTo) 互斥，二选一。
 */
@ApiModel(description = "投注统计查询参数")
@Data
@Accessors(chain = true)
public class BetStatQueryParam {

    @ApiModelProperty(value = "开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    @ApiModelProperty(value = "结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @ApiModelProperty(value = "起始期号")
    private String issueNoFrom;

    @ApiModelProperty(value = "截止期号")
    private String issueNoTo;

    @ApiModelProperty(value = "彩种ID（可选）")
    private Long lotteryId;

    @ApiModelProperty(value = "平台ID（可选）")
    private Long platformId;

    @ApiModelProperty(value = "是否包含未结算注单（按预计盈亏算），默认 true")
    private Boolean includeUnsettled = true;

    @ApiModelProperty(value = "是否包含虚拟注单，默认 false")
    private Boolean includeAuto = false;

    @ApiModelProperty(value = "是否包含测试注单，默认 false")
    private Boolean includeTest = false;

    @ApiModelProperty(value = "趋势聚合维度：day-按日, issue-按期。默认 day")
    private String trendGroupBy = "day";

    @ApiModelProperty(value = "Top 取数：默认 5/10 由接口决定")
    private Integer topN;
}
