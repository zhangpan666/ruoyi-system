package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 玩法明细对象 t_play_type_detail
 * 
 * @author ruoyi
 * @date 2024-11-14
 */
public class PlayTypeDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 玩法code */
    @Excel(name = "玩法code")
    private Integer playTypeCode;

    /** 类型，1-号码，2-号段，3-大小，4-单双，5-家野，6-尾数大小，7-波色，8-龙虎，9-生肖，10-尾数，11-合数 */
    @Excel(name = "类型，1-号码，2-号段，3-大小，4-单双，5-家野，6-尾数大小，7-波色，8-龙虎，9-生肖，10-尾数，11-合数")
    private Integer type;

    /** code */
    @Excel(name = "code")
    private String code;

    /** 限额code */
    @Excel(name = "限额code")
    private String betLimitCode;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    private String value;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer playTypeItem;

    /** 限额类型 */
    @Excel(name = "限额类型")
    private Integer betLimitAmountType;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    private Integer status;

    /** 是否可选，1-是，0-否 */
    @Excel(name = "是否可选，1-是，0-否")
    private Integer availableOption;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlayTypeCode(Integer playTypeCode) 
    {
        this.playTypeCode = playTypeCode;
    }

    public Integer getPlayTypeCode() 
    {
        return playTypeCode;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setBetLimitCode(String betLimitCode) 
    {
        this.betLimitCode = betLimitCode;
    }

    public String getBetLimitCode() 
    {
        return betLimitCode;
    }
    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getValue() 
    {
        return value;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setPlayTypeItem(Integer playTypeItem) 
    {
        this.playTypeItem = playTypeItem;
    }

    public Integer getPlayTypeItem() 
    {
        return playTypeItem;
    }
    public void setBetLimitAmountType(Integer betLimitAmountType) 
    {
        this.betLimitAmountType = betLimitAmountType;
    }

    public Integer getBetLimitAmountType() 
    {
        return betLimitAmountType;
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
    public void setAvailableOption(Integer availableOption) 
    {
        this.availableOption = availableOption;
    }

    public Integer getAvailableOption() 
    {
        return availableOption;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("playTypeCode", getPlayTypeCode())
            .append("type", getType())
            .append("code", getCode())
            .append("betLimitCode", getBetLimitCode())
            .append("value", getValue())
            .append("description", getDescription())
            .append("playTypeItem", getPlayTypeItem())
            .append("betLimitAmountType", getBetLimitAmountType())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("availableOption", getAvailableOption())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
