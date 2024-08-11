package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Long id;

    /** 彩种名称 */
    @Excel(name = "彩种名称")
    private String name;

    /** 彩种code */
    @Excel(name = "彩种code")
    private String code;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    private Integer status;

    /** 开奖状态，0-下注，1-封盘，2-开奖中 */
    @Excel(name = "开奖状态，0-下注，1-封盘，2-开奖中")
    private Integer openStatus;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 游戏规则 */
    @Excel(name = "游戏规则")
    private String rule;

    /** 开奖周期，单位：分钟 */
    @Excel(name = "开奖周期，单位：分钟")
    private Long cycle;

    /** 封盘时间，单位：秒 */
    @Excel(name = "封盘时间，单位：秒")
    private Long close;

    /** 杀率 */
    @Excel(name = "杀率")
    private BigDecimal killRate;

    /** 下一期封盘时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下一期封盘时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextCloseTime;

    /** 下一期开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下一期开奖时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextLotteryTime;

    /** 下一期开奖年份 */
    @Excel(name = "下一期开奖年份")
    private Long nextLotteryYear;

    /** 下一期开奖期数 */
    @Excel(name = "下一期开奖期数")
    private Long nextLotteryPeriod;

    /** 下一期开奖期号 */
    @Excel(name = "下一期开奖期号")
    private String nextIssueNo;

    private String icon;

    private Integer width;

    private Integer height;


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("code", getCode())
            .append("status", getStatus())
            .append("openStatus", getOpenStatus())
            .append("sort", getSort())
            .append("remark", getRemark())
            .append("description", getDescription())
            .append("rule", getRule())
            .append("cycle", getCycle())
            .append("close", getClose())
            .append("killRate", getKillRate())
            .append("nextCloseTime", getNextCloseTime())
            .append("nextLotteryTime", getNextLotteryTime())
            .append("nextLotteryYear", getNextLotteryYear())
            .append("nextLotteryPeriod", getNextLotteryPeriod())
            .append("nextIssueNo", getNextIssueNo())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
