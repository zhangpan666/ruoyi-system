package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 当前在线会话
 *
 * @author ruoyi
 */
public class SysUserOnline
{
    /** 会话编号 */
    @ApiModelProperty(example = "会话编号")
    private String tokenId;

    /** 部门名称 */
    @ApiModelProperty(example = "平台名称")
    private String deptName;

    /** 用户名称 */
    @ApiModelProperty(example = "用户名称")
    private String userName;

    /** 登录IP地址 */
    @ApiModelProperty(example = "登录IP地址")
    private String ipaddr;

    /** 登录地址 */
    @ApiModelProperty(example = "登录地址")
    private String loginLocation;

    /** 浏览器类型 */
    @ApiModelProperty(example = "浏览器类型")
    private String browser;

    /** 操作系统 */
    @ApiModelProperty(example = "操作系统")
    private String os;

    /** 登录时间 */
    @ApiModelProperty(example = "登录时间")
    private Long loginTime;

    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    @ApiModelProperty(example = "平台名称")
    private String platformName;

    public String getTokenId()
    {
        return tokenId;
    }

    public void setTokenId(String tokenId)
    {
        this.tokenId = tokenId;
    }

    public String getDeptName()
    {
        return deptName;
    }

    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getIpaddr()
    {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr)
    {
        this.ipaddr = ipaddr;
    }

    public String getLoginLocation()
    {
        return loginLocation;
    }

    public void setLoginLocation(String loginLocation)
    {
        this.loginLocation = loginLocation;
    }

    public String getBrowser()
    {
        return browser;
    }

    public void setBrowser(String browser)
    {
        this.browser = browser;
    }

    public String getOs()
    {
        return os;
    }

    public void setOs(String os)
    {
        this.os = os;
    }

    public Long getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(Long loginTime)
    {
        this.loginTime = loginTime;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
