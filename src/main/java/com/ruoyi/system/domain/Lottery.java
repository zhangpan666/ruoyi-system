package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

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
    @ApiModelProperty(value = "id")
    private Long id;

    /** 彩种名称 */
    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String name;

    /** 彩种code */
    @Excel(name = "彩种code")
    @ApiModelProperty(value = "彩种code")
    private String code;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态", readConverterExp = "1=有效,0=无效")
    @ApiModelProperty(value = "状态，1-有效，0-无效")
    private Byte status;

    /** 开奖状态，0-下注，1-封盘，2-开奖中 */
    @Excel(name = "开奖状态", readConverterExp = "0=下注中,1=封盘中,2=开奖中")
    @ApiModelProperty(value = "开奖状态，0-下注，1-封盘，2-开奖中")
    private Byte openStatus;

    /** 排序 */
    @Excel(name = "排序")
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /** 描述 */
    private String description;

    /** 游戏规则 */
    private String rule;

    /** 开奖周期，单位：分钟 */
    @Excel(name = "开奖周期，单位：分钟")
    @ApiModelProperty(value = "开奖周期，单位：分钟")
    private Integer lotteryPeriod;

    /** 封盘时间，单位：秒 */
    @Excel(name = "封盘周期，单位：秒")
    @ApiModelProperty(value = "封盘时间，单位：秒")
    private Integer closePeriod;

    /** 下一期封盘时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "下一期封盘时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "下一期封盘时间")
    private Date nextCloseTime;

    /** 下一期开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "下一期开奖时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "下一期开奖时间")
    private Date nextLotteryTime;

    /** 下一期开奖年份 */
    @Excel(name = "下一期开奖年份")
    @ApiModelProperty(value = "下一期开奖年份")
    private Integer nextLotteryYear;

    /** 下一期开奖期号 */
    @Excel(name = "下一期开奖期号")
    @ApiModelProperty(value = "下一期开奖期号")
    private String nextIssueNo;

    @ApiModelProperty(value = "icon")
    private String icon;

    @ApiModelProperty(value = "宽度")
    private Integer width;

    @ApiModelProperty(value = "高度")
    private Integer height;

    /**
     * 开奖直播地址
     */
    @ApiModelProperty(value = "开奖直播地址")
    private String lotteryLiveAddress;

    @ApiModelProperty(value = "封盘倒计时，单位毫秒")
    private long closeCount;

    @ApiModelProperty(value = "开奖倒计时，单位毫秒")
    private long openCount;

    @ApiModelProperty(value = "注单数")
    private int totalBetCount;


}
