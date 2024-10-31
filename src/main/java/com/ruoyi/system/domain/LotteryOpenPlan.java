package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 开奖计划对象 t_lottery_open_plan
 *
 * @author ruoyi
 * @date 2024-10-29
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryOpenPlan
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    @ApiModelProperty(value = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    /** 期号 */
    @Excel(name = "期号")
    @ApiModelProperty(value = "期号")
    private String issueNo;

    /** 预设开奖 */
    @Excel(name = "预设开奖")
    @ApiModelProperty(value = "预设开奖")
    private String presetNumbers;

    /** 自动开奖 */
    @Excel(name = "自动开奖")
    @ApiModelProperty(value = "自动开奖")
    private String autoNumbers;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

}
