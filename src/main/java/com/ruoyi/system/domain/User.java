package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 会员对象 t_user
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Excel(name = "用户id")
    @ApiModelProperty(example = "用户ID")
    private Long id;

    /**
     * 平台id
     */
    @Excel(name = "平台id")
    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    /**
     * 平台用户id
     */
    @Excel(name = "平台用户id")
    @ApiModelProperty(example = "平台用户ID")
    private Long platformUserId;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    @ApiModelProperty(example = "昵称")
    private String nickname;

    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;

    /**
     * 性别(0:未知;1:男;2:女)
     */
    private Integer sex;

    /**
     * 状态
     */
    @Excel(name = "状态", readConverterExp = "1=正常,0=停用")
    @ApiModelProperty(example = "状态，1=正常,0=停用")
    private Integer status;

    /**
     * 最近登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "最近登录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "最近登录时间")
    private Date lastLoginTime;

    /**
     * IP地址
     */
    @Excel(name = "IP地址")
    @ApiModelProperty(example = "IP地址")
    private String registerIp;

    /**
     * 注册地
     */
    @Excel(name = "注册地")
    @ApiModelProperty(example = "注册地")
    private String registerLocation;

    /**
     * 是否有相同的IP地址：1有；0:无
     */
    @Excel(name = "是否有相同的IP地址：1有；0:无")
    private Integer sameIp;

    /**
     * 登录IP地址
     */
    @Excel(name = "登录IP地址")
    @ApiModelProperty(example = "登录IP地址")
    private String loginIp;

    /**
     * 登录地
     */
    @Excel(name = "登录地")
    @ApiModelProperty(example = "登录地")
    private String loginLocation;

    /**
     * 平台名称
     */
    @Excel(name = "平台名称", type = Excel.Type.EXPORT)
    @ApiModelProperty(example = "平台名称")
    private String platformName;

}
