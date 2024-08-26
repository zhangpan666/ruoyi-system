package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 彩种对象 t_lottery
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Lottery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @ApiModelProperty(example = "id")
    private Long id;

    /** 彩种名称 */
    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String name;

    /** 彩种code */
    @Excel(name = "彩种code")
    @ApiModelProperty(example = "彩种code")
    private String code;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

    /** 开奖状态，0-下注，1-封盘，2-开奖中 */
    @Excel(name = "开奖状态，0-下注，1-封盘，2-开奖中")
    @ApiModelProperty(example = "开奖状态，0-下注，1-封盘，2-开奖中")
    private Byte openStatus;

    /** 排序 */
    @Excel(name = "排序")
    @ApiModelProperty(example = "排序")
    private Integer sort;

    /** 描述 */
    @Excel(name = "描述")
    @ApiModelProperty(example = "描述")
    private String description;

    /** 游戏规则 */
    @Excel(name = "游戏规则")
    @ApiModelProperty(example = "游戏规则")
    private String rule;

    /** 开奖周期，单位：分钟 */
    @Excel(name = "开奖周期，单位：分钟")
    @ApiModelProperty(example = "开奖周期，单位：分钟")
    private Integer cycle;

    /** 封盘时间，单位：秒 */
    @Excel(name = "封盘时间，单位：秒")
    @ApiModelProperty(example = "封盘时间，单位：秒")
    private Integer close;

    /** 杀率 */
    @Excel(name = "杀率")
    @ApiModelProperty(example = "杀率")
    private BigDecimal killRate;

    /** 下一期封盘时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下一期封盘时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(example = "下一期封盘时间")
    private Date nextCloseTime;

    /** 下一期开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下一期开奖时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(example = "下一期开奖时间")
    private Date nextLotteryTime;

    /** 下一期开奖年份 */
    @Excel(name = "下一期开奖年份")
    @ApiModelProperty(example = "下一期开奖年份")
    private Integer nextLotteryYear;

    /** 下一期开奖期号 */
    @Excel(name = "下一期开奖期号")
    @ApiModelProperty(example = "下一期开奖期号")
    private String nextIssueNo;

    @ApiModelProperty(example = "icon")
    private String icon;

    @ApiModelProperty(example = "宽度")
    private Integer width;

    @ApiModelProperty(example = "高度")
    private Integer height;

}
