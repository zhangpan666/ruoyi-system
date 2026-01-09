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
 * 爆奖记录对象 t_lottery_prize_record
 *
 * @author ruoyi
 * @date 2025-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryPrizeRecord
{
    private static final long serialVersionUID = 1L;

    /** id */
    @Excel(name = "ID")
    @ApiModelProperty(value = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /**
     * 彩种名称
     */
    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    /** 金额 */
    @Excel(name = "金额")
    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    /** 目标用户ID */
    @Excel(name = "目标用户ID")
    @ApiModelProperty(value = "目标用户ID")
    private Long userId;

    @Excel(name = "平台ID")
    @ApiModelProperty(value = "平台ID")
    private Long platformId;

    @Excel(name = "平台名称")
    @ApiModelProperty(value = "平台名称")
    private String platformName;

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

    private Date beginTime;

    private Date endTime;

}
