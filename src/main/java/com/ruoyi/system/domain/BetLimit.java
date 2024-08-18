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
 * 投注限额对象 t_bet_limit
 *
 * @author ruoyi
 * @date 2024-08-18
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BetLimit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    @ApiModelProperty(example = "id")
    private Long id;

    /** code */
    @Excel(name = "code")
    @ApiModelProperty(example = "code")
    private String code;

    /** 名称 */
    @Excel(name = "名称")
    @ApiModelProperty(example = "名称")
    private String name;

    /** 最小投注 */
    @Excel(name = "最小投注")
    @ApiModelProperty(example = "最小投注")
    private BigDecimal minBetAmount;

    /** 最大投注 */
    @Excel(name = "最大投注")
    @ApiModelProperty(example = "最大投注")
    private BigDecimal maxBetAmount;

    /** 最小投注结果 */
    @Excel(name = "最小投注结果")
    @ApiModelProperty(example = "最小投注结果")
    private Long minBetCount;

    /** 最大投注结果 */
    @Excel(name = "最大投注结果")
    @ApiModelProperty(example = "最大投注结果")
    private Long maxBetCount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;


}
