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
 * 投注限额对象 t_bet_limit_amount
 *
 * @author ruoyi
 * @date 2024-08-22
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BetLimitAmount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
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

    @Excel(name = "限额类型")
    @ApiModelProperty(value = "限额类型")
    private String betLimitAmountName;


}
