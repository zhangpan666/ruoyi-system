package com.ruoyi.system.domain;

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
 * 爆奖任务对象 t_lottery_prize_task
 *
 * @author ruoyi
 * @date 2025-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryPrizeTask
{
    private static final long serialVersionUID = 1L;

    /** id */
    @Excel(name = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 执行类型，1-立即执行，2-定时执行 */
    @Excel(name = "执行类型", readConverterExp = "1=立即执行,2=定时执行")
    private Byte execType;

    /** 执行时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "执行时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date execTime;

    /** cron表达式 */
    @Excel(name = "cron表达式")
    private String cron;

    /** 目标用户类型，1-所有用户，2-指定用户，3-盈利用户，4-亏损用户，5-打码量较高用户 */
    @Excel(name = "目标用户类型", readConverterExp = "1=所有用户,2=指定用户,3=盈利用户,4=亏损用户,5=打码量较高用户")
    private Byte targetUserType;

    /** 指定用户id */
    @Excel(name = "指定用户id")
    private String targetUserIds;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date targetBeginTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date targetEndTime;

    /** 打码量前多少名 */
    @Excel(name = "打码量前多少名")
    private Integer totalBetAmountRank;

    /** 最大爆奖金额 */
    @Excel(name = "最大爆奖金额")
    private Integer maxPrizeAmount;

    /** 最小爆奖金额 */
    @Excel(name = "最小爆奖金额")
    private Integer minPrizeAmount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    private Byte status;

    /** 执行状态，0-待执行，1-执行中，2-执行完成，3-执行失败 */
    @Excel(name = "执行状态", readConverterExp = "0=待执行,1=执行中,2=执行完成,3=执行失败")
    private Byte execStatus;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "创建时间")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(example = "备注")
    @Excel(name = "备注")
    private String remark;

}
