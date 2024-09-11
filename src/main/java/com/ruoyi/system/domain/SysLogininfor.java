package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

/**
 * 系统访问记录表 sys_logininfor
 *
 * @author ruoyi
 */
public class SysLogininfor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "序号", cellType = ColumnType.NUMERIC)
    @ApiModelProperty(example = "ID")
    private Long infoId;

    /** 用户账号 */
    @Excel(name = "用户账号")
    @ApiModelProperty(example = "用户账号")
    private String userName;

    /** 登录状态 0成功 1失败 */
    @Excel(name = "登录状态", readConverterExp = "0=成功,1=失败")
    @ApiModelProperty(example = "登录状态 0成功 1失败")
    private String status;

    /** 登录IP地址 */
    @Excel(name = "登录地址")
    @ApiModelProperty(example = "登录IP地址")
    private String ipaddr;

    /** 登录地点 */
    @Excel(name = "登录地点")
    @ApiModelProperty(example = "登录地点")
    private String loginLocation;

    /** 浏览器类型 */
    @Excel(name = "浏览器")
    @ApiModelProperty(example = "浏览器类型")
    private String browser;

    /** 操作系统 */
    @Excel(name = "操作系统")
    @ApiModelProperty(example = "操作系统")
    private String os;

    /** 提示消息 */
    @Excel(name = "提示消息")
    @ApiModelProperty(example = "提示消息")
    private String msg;

    /** 访问时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "访问时间")
    private Date loginTime;

    @Excel(name = "平台ID", type = Excel.Type.EXPORT)
    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    @Excel(name = "平台名称", type = Excel.Type.EXPORT)
    @ApiModelProperty(example = "平台名称")
    private String platformName;

    public Long getInfoId()
    {
        return infoId;
    }

    public void setInfoId(Long infoId)
    {
        this.infoId = infoId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
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

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Date getLoginTime()
    {
        return loginTime;
    }

    public void setLoginTime(Date loginTime)
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
