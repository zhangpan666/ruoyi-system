package com.ruoyi.system.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 玩法管理对象 t_play_type
 *
 * @author ruoyi
 * @date 2024-09-19
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PlayType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty(value = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /** code */
    @Excel(name = "code")
    @ApiModelProperty(value = "code")
    private Byte code;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    @ApiModelProperty(value = "玩法名称")
    private String name;

    /** 描述 */
    @Excel(name = "描述")
    @ApiModelProperty(value = "描述")
    private String description;

    /** 排序 */
    @Excel(name = "排序")
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(value = "状态，1-有效，0-无效")
    private Byte status;


}
