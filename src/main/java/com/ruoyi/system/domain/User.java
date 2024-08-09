package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 会员对象 t_user
 * 
 * @author ruoyi
 * @date 2024-08-09
 */
public class User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 平台id */
    @Excel(name = "平台id")
    private Long platformId;

    /** 平台用户id */
    @Excel(name = "平台用户id")
    private Long platformUserId;

    /** 昵称 */
    @Excel(name = "昵称")
    private String nickname;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 性别(0:未知;1:男;2:女) */
    @Excel(name = "性别(0:未知;1:男;2:女)")
    private Integer sex;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String mobile;

    /** 类型 */
    @Excel(name = "类型")
    private Integer type;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 最近登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    /** IP地址 */
    @Excel(name = "IP地址")
    private String registerIp;

    /** 注册地 */
    @Excel(name = "注册地")
    private String registerLocation;

    /** 手机的唯一设备ID */
    @Excel(name = "手机的唯一设备ID")
    private String deviceId;

    /** 手机型号 */
    @Excel(name = "手机型号")
    private String model;

    /** 安卓推送标识 */
    @Excel(name = "安卓推送标识")
    private String pushId;

    /** 0-安卓，1-iOS */
    @Excel(name = "0-安卓，1-iOS")
    private Integer osType;

    /** 注册来源 */
    @Excel(name = "注册来源")
    private String registerFrom;

    /** 是否绑定手机，1-是，0-否 */
    @Excel(name = "是否绑定手机，1-是，0-否")
    private Integer bindMobile;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String realName;

    /** 是否有相同的IP地址：1有；0:无 */
    @Excel(name = "是否有相同的IP地址：1有；0:无")
    private Integer sameIp;

    /** 登录IP地址 */
    @Excel(name = "登录IP地址")
    private String loginIp;

    /** 登录地 */
    @Excel(name = "登录地")
    private String loginLocation;

    /** 用户组ID */
    @Excel(name = "用户组ID")
    private Long userGroupId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlatformId(Long platformId) 
    {
        this.platformId = platformId;
    }

    public Long getPlatformId() 
    {
        return platformId;
    }
    public void setPlatformUserId(Long platformUserId) 
    {
        this.platformUserId = platformUserId;
    }

    public Long getPlatformUserId() 
    {
        return platformUserId;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setSex(Integer sex) 
    {
        this.sex = sex;
    }

    public Integer getSex() 
    {
        return sex;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setLastLoginTime(Date lastLoginTime) 
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime() 
    {
        return lastLoginTime;
    }
    public void setRegisterIp(String registerIp) 
    {
        this.registerIp = registerIp;
    }

    public String getRegisterIp() 
    {
        return registerIp;
    }
    public void setRegisterLocation(String registerLocation) 
    {
        this.registerLocation = registerLocation;
    }

    public String getRegisterLocation() 
    {
        return registerLocation;
    }
    public void setDeviceId(String deviceId) 
    {
        this.deviceId = deviceId;
    }

    public String getDeviceId() 
    {
        return deviceId;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setPushId(String pushId) 
    {
        this.pushId = pushId;
    }

    public String getPushId() 
    {
        return pushId;
    }
    public void setOsType(Integer osType) 
    {
        this.osType = osType;
    }

    public Integer getOsType() 
    {
        return osType;
    }
    public void setRegisterFrom(String registerFrom) 
    {
        this.registerFrom = registerFrom;
    }

    public String getRegisterFrom() 
    {
        return registerFrom;
    }
    public void setBindMobile(Integer bindMobile) 
    {
        this.bindMobile = bindMobile;
    }

    public Integer getBindMobile() 
    {
        return bindMobile;
    }
    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }
    public void setSameIp(Integer sameIp) 
    {
        this.sameIp = sameIp;
    }

    public Integer getSameIp() 
    {
        return sameIp;
    }
    public void setLoginIp(String loginIp) 
    {
        this.loginIp = loginIp;
    }

    public String getLoginIp() 
    {
        return loginIp;
    }
    public void setLoginLocation(String loginLocation) 
    {
        this.loginLocation = loginLocation;
    }

    public String getLoginLocation() 
    {
        return loginLocation;
    }
    public void setUserGroupId(Long userGroupId) 
    {
        this.userGroupId = userGroupId;
    }

    public Long getUserGroupId() 
    {
        return userGroupId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("platformId", getPlatformId())
            .append("platformUserId", getPlatformUserId())
            .append("nickname", getNickname())
            .append("username", getUsername())
            .append("sex", getSex())
            .append("password", getPassword())
            .append("mobile", getMobile())
            .append("type", getType())
            .append("status", getStatus())
            .append("lastLoginTime", getLastLoginTime())
            .append("registerIp", getRegisterIp())
            .append("registerLocation", getRegisterLocation())
            .append("deviceId", getDeviceId())
            .append("model", getModel())
            .append("pushId", getPushId())
            .append("osType", getOsType())
            .append("registerFrom", getRegisterFrom())
            .append("bindMobile", getBindMobile())
            .append("realName", getRealName())
            .append("sameIp", getSameIp())
            .append("loginIp", getLoginIp())
            .append("loginLocation", getLoginLocation())
            .append("userGroupId", getUserGroupId())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
