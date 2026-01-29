package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 爆奖每日汇总对象 t_lottery_prize_stat_day
 * 
 * @author ruoyi
 * @date 2026-01-29
 */
public class LotteryPrizeStatDay extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statDate;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 投注金额 */
    @Excel(name = "投注金额")
    private BigDecimal totalBetAmount;

    /** 爆奖次数 */
    @Excel(name = "爆奖次数")
    private Long totalPrizeCount;

    /** 爆奖人数 */
    @Excel(name = "爆奖人数")
    private Long totalPrizePeopleCount;

    /** 爆奖金额 */
    @Excel(name = "爆奖金额")
    private BigDecimal totalPrizeAmount;

    /** 奖池提取金额 */
    @Excel(name = "奖池提取金额")
    private BigDecimal totalJackpotExtractionAmount;

    /** 奖池余额 */
    @Excel(name = "奖池余额")
    private BigDecimal jackpotBalance;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStatDate(Date statDate) 
    {
        this.statDate = statDate;
    }

    public Date getStatDate() 
    {
        return statDate;
    }
    public void setLotteryId(Long lotteryId) 
    {
        this.lotteryId = lotteryId;
    }

    public Long getLotteryId() 
    {
        return lotteryId;
    }
    public void setTotalBetAmount(BigDecimal totalBetAmount) 
    {
        this.totalBetAmount = totalBetAmount;
    }

    public BigDecimal getTotalBetAmount() 
    {
        return totalBetAmount;
    }
    public void setTotalPrizeCount(Long totalPrizeCount) 
    {
        this.totalPrizeCount = totalPrizeCount;
    }

    public Long getTotalPrizeCount() 
    {
        return totalPrizeCount;
    }
    public void setTotalPrizePeopleCount(Long totalPrizePeopleCount) 
    {
        this.totalPrizePeopleCount = totalPrizePeopleCount;
    }

    public Long getTotalPrizePeopleCount() 
    {
        return totalPrizePeopleCount;
    }
    public void setTotalPrizeAmount(BigDecimal totalPrizeAmount) 
    {
        this.totalPrizeAmount = totalPrizeAmount;
    }

    public BigDecimal getTotalPrizeAmount() 
    {
        return totalPrizeAmount;
    }
    public void setTotalJackpotExtractionAmount(BigDecimal totalJackpotExtractionAmount) 
    {
        this.totalJackpotExtractionAmount = totalJackpotExtractionAmount;
    }

    public BigDecimal getTotalJackpotExtractionAmount() 
    {
        return totalJackpotExtractionAmount;
    }
    public void setJackpotBalance(BigDecimal jackpotBalance) 
    {
        this.jackpotBalance = jackpotBalance;
    }

    public BigDecimal getJackpotBalance() 
    {
        return jackpotBalance;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("statDate", getStatDate())
            .append("lotteryId", getLotteryId())
            .append("totalBetAmount", getTotalBetAmount())
            .append("totalPrizeCount", getTotalPrizeCount())
            .append("totalPrizePeopleCount", getTotalPrizePeopleCount())
            .append("totalPrizeAmount", getTotalPrizeAmount())
            .append("totalJackpotExtractionAmount", getTotalJackpotExtractionAmount())
            .append("jackpotBalance", getJackpotBalance())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
