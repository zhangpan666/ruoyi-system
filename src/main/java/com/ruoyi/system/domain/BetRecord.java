package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 投注记录对象 t_bet_record
 *
 * @author ruoyi
 * @date 2024-08-11
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BetRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 投注金额 */
    @Excel(name = "投注金额")
    private BigDecimal betAmount;

    /** 可赢金额 */
    @Excel(name = "可赢金额")
    private BigDecimal canWinAmount;

    /** 下注内容 */
    @Excel(name = "下注内容")
    private String betContent;

    /** 下注内容 */
    @Excel(name = "下注内容")
    private String displayBetContent;

    /** 赔率 */
    @Excel(name = "赔率")
    private BigDecimal betOdds;

    /** 附加赔率 */
    @Excel(name = "附加赔率")
    private BigDecimal betAdditionalOdds;

    /** 平台id */
    @Excel(name = "平台id")
    private Long platformId;

    /** 平台用户id */
    @Excel(name = "平台用户id")
    private Long platformUserId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 期号 */
    @Excel(name = "期号")
    private String issueNo;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    private String playTypeName;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    private String displayPlayTypeName;

    /** 输赢状态，1-赢，0-输，2-打和 */
    @Excel(name = "输赢状态，1-赢，0-输，2-打和")
    private Integer win;

    /** 输赢金额 */
    @Excel(name = "输赢金额")
    private BigDecimal winLoseAmount;

    /** 玩法code */
    @Excel(name = "玩法code")
    private Integer playTypeCode;

    /** 玩法明细code */
    @Excel(name = "玩法明细code")
    private String playTypeDetailCode;

    /** 注单编号 */
    @Excel(name = "注单编号")
    private String betNo;

    /** 注单状态，0-待结算，1-结算成功，2-结算失败，3-已撤单 */
    @Excel(name = "注单状态，0-待结算，1-结算成功，2-结算失败，3-已撤单")
    private Byte status;

    /** 撤单类型，1-个人撤单，2-系统撤单，3-系统管理员撤单 */
    @Excel(name = "撤单类型，1-个人撤单，2-系统撤单，3-系统管理员撤单")
    private Byte cancelType;

    /** 下注时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下注时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date betTime;

    /** 结算时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结算时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date countTime;

    @Excel(name = "彩种")
    private String lotteryName;

    private Byte timeType;

    private Date beginTime;

    private Date endTime;

}