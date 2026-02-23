package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 会员对象 t_user
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Excel(name = "ID")
    @ApiModelProperty(value = "ID")
    private Long id;

    /**
     * 平台id
     */
    @Excel(name = "平台ID")
    @ApiModelProperty(value = "平台ID")
    private Long platformId;

    /**
     * 平台名称
     */
    @Excel(name = "平台名称", type = Excel.Type.EXPORT)
    @ApiModelProperty(value = "平台名称")
    private String platformName;

    /**
     * 平台用户id
     */
    @Excel(name = "平台用户ID")
    @ApiModelProperty(value = "平台用户ID")
    private Long platformUserId;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    @ApiModelProperty(value = "昵称")
    private String nickname;


    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;


    /**
     * 类型
     */
    @Excel(name = "类型", readConverterExp = "1=真实用户,2=虚拟用户,3=测试用户")
    @ApiModelProperty(example = "类型，1-真实用户,2-虚拟用户")
    private Byte type;


    /**
     * 性别(0:未知;1:男;2:女)
     */
    private Byte sex;

    /**
     * 状态
     */
    @Excel(name = "状态", readConverterExp = "1=正常,0=停用")
    @ApiModelProperty(value = "状态，1=正常,0=停用")
    private Byte status;


    @ApiModelProperty(value = "在线状态，1=在线,0=离线")
    private Byte onlineStatus;

    /**
     * 最近登录时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "最近登录时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "最近登录时间")
    private Date lastLoginTime;

    /**
     * IP地址
     */
    @Excel(name = "IP地址")
    @ApiModelProperty(value = "IP地址")
    private String registerIp;

    /**
     * 注册地
     */
    @Excel(name = "注册地")
    @ApiModelProperty(value = "注册地")
    private String registerLocation;

    /**
     * 是否有相同的IP地址：1有；0:无
     */
    private Byte sameIp;

    /**
     * 登录IP地址
     */
    @Excel(name = "登录IP地址")
    @ApiModelProperty(value = "登录IP地址")
    private String loginIp;

    /**
     * 登录地
     */
    @Excel(name = "登录地")
    @ApiModelProperty(value = "登录地")
    private String loginLocation;

    /** 可用余额 */
    @Excel(name = "可用余额")
    @ApiModelProperty(value = "可用余额")
    private BigDecimal availableBalance;

    /** 最近中奖时间 */
    @Excel(name = "最近中奖时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "最近中奖时间")
    private Date lastPrizeTime;

    /** 最近投注时间 */
    @Excel(name = "最近投注时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "最近投注时间")
    private Date lastBetTime;

    /** 最近投注疯狂系列时间 */
    @Excel(name = "最近投注疯狂系列时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "最近投注疯狂系列时间")
    private Date lastBetCrazySeriesTime;

    /** 备注 */
    @Excel(name = "备注")
    @ApiModelProperty(example = "备注")
    private String remark;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    private Date updateTime;

    private Date beginTime;

    private Date endTime;

    private List<Long> idList;

}
