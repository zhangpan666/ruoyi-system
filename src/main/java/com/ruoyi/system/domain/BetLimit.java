package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 投注限制对象 t_bet_limit
 *
 * @author ruoyi
 * @date 2024-08-22
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BetLimit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
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

    /** 最小投注结果 */
    @Excel(name = "最小投注结果")
    @ApiModelProperty(example = "最小投注结果")
    private Integer minBetCount;

    /** 最大投注结果 */
    @Excel(name = "最大投注结果")
    @ApiModelProperty(example = "最大投注结果")
    private Integer maxBetCount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

}
