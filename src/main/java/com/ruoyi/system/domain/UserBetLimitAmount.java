package com.ruoyi.system.domain;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户投注限额对象 t_user_bet_limit_amount
 *
 * @author ruoyi
 * @date 2024-08-22
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserBetLimitAmount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty(example = "id")
    private String id;

    /** 用户ID */
    @Excel(name = "用户ID")
    @ApiModelProperty(example = "用户ID")
    private Long userId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    /** 限额类型 */
    @Excel(name = "限额类型")
    @ApiModelProperty(example = "限额类型")
    private Byte type;

    /** 单注下限 */
    @Excel(name = "单注下限")
    @ApiModelProperty(example = "单注下限")
    private BigDecimal singleTimeBetMinAmount;

    /** 单注上限 */
    @Excel(name = "单注上限")
    @ApiModelProperty(example = "单注上限")
    private BigDecimal singleTimeBetMaxAmount;

    /** 单期限额 */
    @Excel(name = "单期限额")
    @ApiModelProperty(example = "单期限额")
    private BigDecimal singlePeriodBetMaxAmount;

    @Excel(name = "限额类型")
    @ApiModelProperty(example = "限额类型")
    private String betLimitAmountName;



}
