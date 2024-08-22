package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户投注限额对象 t_user_bet_limit_amount
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
public class UserBetLimitAmount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 限额类型 */
    @Excel(name = "限额类型")
    private Integer type;

    /** 单注下限 */
    @Excel(name = "单注下限")
    private BigDecimal singleTimeBetMinAmount;

    /** 单注上限 */
    @Excel(name = "单注上限")
    private BigDecimal singleTimeBetMaxAmount;

    /** 单期限额 */
    @Excel(name = "单期限额")
    private BigDecimal singlePeriodBetMaxAmount;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setLotteryId(Long lotteryId) 
    {
        this.lotteryId = lotteryId;
    }

    public Long getLotteryId() 
    {
        return lotteryId;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setSingleTimeBetMinAmount(BigDecimal singleTimeBetMinAmount) 
    {
        this.singleTimeBetMinAmount = singleTimeBetMinAmount;
    }

    public BigDecimal getSingleTimeBetMinAmount() 
    {
        return singleTimeBetMinAmount;
    }
    public void setSingleTimeBetMaxAmount(BigDecimal singleTimeBetMaxAmount) 
    {
        this.singleTimeBetMaxAmount = singleTimeBetMaxAmount;
    }

    public BigDecimal getSingleTimeBetMaxAmount() 
    {
        return singleTimeBetMaxAmount;
    }
    public void setSinglePeriodBetMaxAmount(BigDecimal singlePeriodBetMaxAmount) 
    {
        this.singlePeriodBetMaxAmount = singlePeriodBetMaxAmount;
    }

    public BigDecimal getSinglePeriodBetMaxAmount() 
    {
        return singlePeriodBetMaxAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("lotteryId", getLotteryId())
            .append("type", getType())
            .append("singleTimeBetMinAmount", getSingleTimeBetMinAmount())
            .append("singleTimeBetMaxAmount", getSingleTimeBetMaxAmount())
            .append("singlePeriodBetMaxAmount", getSinglePeriodBetMaxAmount())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
