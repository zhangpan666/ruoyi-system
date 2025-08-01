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
 * 平台玩法大类对象 t_platform_play_type
 *
 * @author ruoyi
 * @date 2025-06-11
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PlatformPlayType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @ApiModelProperty(value = "ID")
    private Long id;

    /** 平台id，0-默认 */
    @Excel(name = "平台id，0-默认")
    @ApiModelProperty(value = "平台ID")
    private Long platformId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /** code */
    @Excel(name = "code")
    @ApiModelProperty(value = "code")
    private Byte code;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(value = "状态，1-有效，0-无效")
    private Byte status;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    @ApiModelProperty(value = "玩法名称")
    private String playTypeName;

    @Excel(name = "平台名称")
    @ApiModelProperty(example = "平台名称")
    private String platformName;

    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

}
