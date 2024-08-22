package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 投注限额对象 t_bet_limit_amount
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
public class BetLimitAmount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 平台id，0-默认 */
    @Excel(name = "平台id，0-默认")
    private Long platformId;

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
            .append("platformId", getPlatformId())
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
