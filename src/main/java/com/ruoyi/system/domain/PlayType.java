package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 玩法管理对象 t_play_type
 * 
 * @author ruoyi
 * @date 2024-09-19
 */
public class PlayType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** code */
    @Excel(name = "code")
    private Integer code;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    private String name;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

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
    public void setLotteryId(Long lotteryId) 
    {
        this.lotteryId = lotteryId;
    }

    public Long getLotteryId() 
    {
        return lotteryId;
    }
    public void setCode(Integer code) 
    {
        this.code = code;
    }

    public Integer getCode() 
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
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
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
            .append("lotteryId", getLotteryId())
            .append("code", getCode())
            .append("name", getName())
            .append("description", getDescription())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
