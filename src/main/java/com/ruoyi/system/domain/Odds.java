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
 * 赔率设置对象 t_odds
 *
 * @author ruoyi
 * @date 2024-08-26
 */


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Odds extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty(example = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    /** code */
    @Excel(name = "code")
    @ApiModelProperty(example = "code")
    private String code;

    /** 第一赔率 */
    @Excel(name = "第一赔率")
    @ApiModelProperty(example = "第一赔率")
    private BigDecimal odds;

    /** 第二赔率 */
    @Excel(name = "第二赔率")
    @ApiModelProperty(example = "第二赔率")
    private BigDecimal additionalOdds;

    /** 第三赔率 */
    @Excel(name = "第三赔率")
    @ApiModelProperty(example = "第三赔率")
    private BigDecimal additionalOdds1;

    /** 排序 */
    @Excel(name = "排序")
    @ApiModelProperty(example = "排序")
    private Integer sort;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

    /** code */
    @Excel(name = "description")
    @ApiModelProperty(example = "描述")
    private String description;

    private Byte playTypeCode;

    private Integer playTypeItem;

    private String value;



}
