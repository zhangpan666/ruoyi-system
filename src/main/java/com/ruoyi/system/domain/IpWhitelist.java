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
 * 白名单对象 t_ip_whitelist
 *
 * @author ruoyi
 * @date 2024-08-15
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IpWhitelist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty(example = "id")
    private Long id;

    /** 平台ID，0-系统 */
    @Excel(name = "平台ID，0-系统")
    @ApiModelProperty(example = "平台ID，0-系统")
    private Long platformId;

    /** 状态，1-后台管理，2-接口 */
    @Excel(name = "状态，1-后台管理，2-接口")
    @ApiModelProperty(example = "状态，1-后台管理，2-接口")
    private Byte type;

    /** IP */
    @Excel(name = "IP")
    @ApiModelProperty(example = "ip")
    private String ip;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

    @ApiModelProperty(example = "平台名称")
    private String platformName;

    private Long[] ids;

}
