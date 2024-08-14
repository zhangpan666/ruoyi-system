package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 码表对象 t_lottery_relation
 * 
 * @author ruoyi
 * @date 2024-08-14
 */
public class LotteryRelation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 数字 */
    @Excel(name = "数字")
    private String number;

    /** 颜色(1红色，2-蓝色，3-绿色) */
    @Excel(name = "颜色(1红色，2-蓝色，3-绿色)")
    private Integer color;

    /** 五行(金木水火土) */
    @Excel(name = "五行(金木水火土)")
    private String wx;

    /** 生肖(鼠牛虎兔...) */
    @Excel(name = "生肖(鼠牛虎兔...)")
    private String sx;

    /** 年份 */
    @Excel(name = "年份")
    private Integer year;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setColor(Integer color) 
    {
        this.color = color;
    }

    public Integer getColor() 
    {
        return color;
    }
    public void setWx(String wx) 
    {
        this.wx = wx;
    }

    public String getWx() 
    {
        return wx;
    }
    public void setSx(String sx) 
    {
        this.sx = sx;
    }

    public String getSx() 
    {
        return sx;
    }
    public void setYear(Integer year) 
    {
        this.year = year;
    }

    public Integer getYear() 
    {
        return year;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("number", getNumber())
            .append("color", getColor())
            .append("wx", getWx())
            .append("sx", getSx())
            .append("year", getYear())
            .toString();
    }
}
