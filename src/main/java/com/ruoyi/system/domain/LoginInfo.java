package com.ruoyi.system.domain;

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
 * 登录日志对象 t_login_info
 *
 * @author ruoyi
 * @date 2024-08-29
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LoginInfo
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @Excel(name = "ID")
    @ApiModelProperty(example = "ID")
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    @ApiModelProperty(example = "用户ID")
    private Long userId;

    /** 平台id */
    @Excel(name = "平台ID")
    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    /** 平台用户id */
    @Excel(name = "平台用户ID")
    @ApiModelProperty(example = "平台用户ID")
    private Long platformUserId;

    /** 客户端类型 */
    @Excel(name = "客户端类型")
    @ApiModelProperty(example = "客户端类型")
    private Byte clientType;

    /** 登录ip */
    @Excel(name = "登录IP")
    @ApiModelProperty(example = "登录IP")
    private String ip;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String deviceId;

    /** token */
    @Excel(name = "token")
    @ApiModelProperty(example = "token")
    private String token;

    /** 状态 */
    @Excel(name = "状态")
    @ApiModelProperty(example = "状态")
    private Byte status;

    @Excel(name = "登录时间", width = 50, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "登录时间")
    private Date createTime;

    @Excel(name = "更新时间", width = 50, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    private Date updateTime;

    /** 过期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "过期时间", width = 50, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "过期时间")
    private Date expireTime;

    private Date beginTime;

    private Date endTime;

}
