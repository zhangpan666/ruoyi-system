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
 * 投注限额对象 t_bet_limit_amount
 *
 * @author ruoyi
 * @date 2024-08-22
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BetLimitAmount
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    @ApiModelProperty(value = "id")
    private Long id;

    /** 平台id，0-默认 */
    @Excel(name = "平台id，0-默认")
    @ApiModelProperty(value = "平台id，1-默认")
    private Long platformId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /** 限额类型 */
    @Excel(name = "限额类型")
    @ApiModelProperty(value = "限额类型")
    private Byte type;

    /** 单注下限 */
    @Excel(name = "单注下限")
    @ApiModelProperty(value = "单注下限")
    private BigDecimal singleTimeBetMinAmount;

    /** 单注上限 */
    @Excel(name = "单注上限")
    @ApiModelProperty(value = "单注上限")
    private BigDecimal singleTimeBetMaxAmount;

    /** 单期限额 */
    @Excel(name = "单期限额")
    @ApiModelProperty(value = "单期限额")
    private BigDecimal singlePeriodBetMaxAmount;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @Excel(name = "限额类型")
    @ApiModelProperty(value = "限额类型")
    private String betLimitAmountName;

    @Excel(name = "平台名称")
    @ApiModelProperty(example = "平台名称")
    private String platformName;

    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    /** 备注 */
    @Excel(name = "备注")
    @ApiModelProperty(value = "备注")
    private String remark;

}
