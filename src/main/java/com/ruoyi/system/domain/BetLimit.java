package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 投注限制对象 t_bet_limit
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
public class BetLimit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** code */
    @Excel(name = "code")
    private String code;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 最小投注结果 */
    @Excel(name = "最小投注结果")
    private Long minBetCount;

    /** 最大投注结果 */
    @Excel(name = "最大投注结果")
    private Long maxBetCount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setMinBetCount(Long minBetCount) 
    {
        this.minBetCount = minBetCount;
    }

    public Long getMinBetCount() 
    {
        return minBetCount;
    }
    public void setMaxBetCount(Long maxBetCount) 
    {
        this.maxBetCount = maxBetCount;
    }

    public Long getMaxBetCount() 
    {
        return maxBetCount;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("minBetCount", getMinBetCount())
            .append("maxBetCount", getMaxBetCount())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
