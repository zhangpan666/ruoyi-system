package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class LoginInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 平台id */
    @Excel(name = "平台id")
    private Long platformId;

    /** 平台用户id */
    @Excel(name = "平台用户id")
    private Long platformUserId;

    /** 客户端类型 */
    @Excel(name = "客户端类型")
    private Integer clientType;

    /** 登录ip */
    @Excel(name = "登录ip")
    private String ip;

    /** 设备ID */
    @Excel(name = "设备ID")
    private String deviceId;

    /** token */
    @Excel(name = "token")
    private String token;

    /** 状态 */
    @Excel(name = "状态")
    private Byte status;

    /** 过期时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "过期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

}
