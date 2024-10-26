package com.ruoyi.system.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.light.core.utils.DateUtils;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.system.domain.vo.LotterySingleNumberInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    @Excel(name = "id")
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "id，字符串类型")
    private String idStr;

    /** 用户ID */
    @Excel(name = "用户ID")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /** 投注金额 */
    @Excel(name = "投注金额")
    @ApiModelProperty(value = "投注金额")
    private BigDecimal betAmount;

    /** 有效投注金额 */
    @Excel(name = "有效投注金额")
    @ApiModelProperty(value = "有效投注金额")
    private BigDecimal validBetAmount;


    /** 可赢金额 */
    @Excel(name = "可赢金额")
    @ApiModelProperty(value = "可赢金额")
    private BigDecimal canWinAmount;

    /** 下注内容 */
    @Excel(name = "下注内容")
    @ApiModelProperty(value = "下注内容")
    private String betContent;

    /** 下注内容 */
    @Excel(name = "展示下注内容")
    @ApiModelProperty(value = "下注内容")
    private String displayBetContent;

    /** 赔率 */
    @Excel(name = "赔率")
    @ApiModelProperty(value = "赔率")
    private BigDecimal betOdds;

    /** 附加赔率 */
    @Excel(name = "附加赔率")
    @ApiModelProperty(value = "附加赔率")
    private BigDecimal betAdditionalOdds;

    /** 平台id */
    @Excel(name = "平台id")
    @ApiModelProperty(value = "平台id")
    private Long platformId;

    /** 平台用户id */
    @Excel(name = "平台用户id")
    @ApiModelProperty(value = "平台用户id")
    private Long platformUserId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "彩种ID")
    private Long lotteryId;

    /** 期号 */
    @Excel(name = "期号")
    @ApiModelProperty(value = "期号")
    private String issueNo;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    @ApiModelProperty(value = "玩法名称")
    private String playTypeName;

    /** 输赢状态，1-赢，0-输，2-打和 */
    @Excel(name = "输赢状态", readConverterExp = "1=赢,0=输,2=打和")
    @ApiModelProperty(value = "输赢状态，1-赢，0-输，2-打和")
    private Byte win;

    /** 派彩金额 */
    @Excel(name = "派彩金额")
    @ApiModelProperty(value = "派彩金额")
    private BigDecimal winAmount;

    /** 输赢金额 */
    @Excel(name = "输赢金额")
    @ApiModelProperty(value = "输赢金额")
    private BigDecimal winLoseAmount;

    /** 玩法code */
    @Excel(name = "玩法code")
    @ApiModelProperty(value = "玩法code")
    private Byte playTypeCode;

    /** 玩法明细code */
    @Excel(name = "玩法明细code")
    @ApiModelProperty(value = "玩法明细code")
    private String playTypeDetailCode;

    /** 注单编号 */
    @Excel(name = "注单编号")
    @ApiModelProperty(value = "注单编号")
    private String betNo;

    /** 注单状态，0-待结算，1-结算成功，2-结算失败，3-已撤单 */
    @Excel(name = "注单状态", readConverterExp = "0=待结算,1=结算成功,2=结算失败,3=已撤单")
    @ApiModelProperty(value = "注单状态，0-待结算，1-结算成功，2-结算失败，3-已撤单")
    private Byte status;

    /** 撤单类型，1-个人撤单，2-系统撤单，3-系统管理员撤单 */
    @Excel(name = "撤单类型", readConverterExp = "1=个人撤单,2=系统撤单,3=管理员撤单")
    @ApiModelProperty(value = "撤单类型，1-个人撤单，2-系统撤单，3-系统管理员撤单")
    private Byte cancelType;

    /** 下注时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "下注时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "下注时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date betTime;

    /** 结算时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结算时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "结算时间")
    @JSONField(format = DateUtils.DATE_TIME_FORMAT)
    private Date countTime;

    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    @Excel(name = "单注投注金额")
    @ApiModelProperty(value = "单注投注金额")
    private BigDecimal singleTimeBetAmount;

    @Excel(name = "注数")
    @ApiModelProperty(value = "注数")
    private Integer singleTimeCount;


    private Byte timeType;

    private Byte type;

    private Byte reportType;

    private Date beginTime;

    private Date endTime;

    private List<LotterySingleNumberInfo> numberList;

}
