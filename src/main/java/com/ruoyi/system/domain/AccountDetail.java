package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账户明细对象 t_account_detail
 *
 * @author ruoyi
 * @date 2024-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AccountDetail
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @Excel(name = "ID")
    @ApiModelProperty(example = "id")
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    @ApiModelProperty(example = "用户ID")
    private Long userId;

    /** 关联ID */
    @Excel(name = "关联ID")
    @ApiModelProperty(example = "关联ID")
    private Long relatedId;

    /** 订单号 */
    @Excel(name = "订单号")
    @ApiModelProperty(example = "订单号")
    private String orderNo;

    /** 商户订单号 */
    @Excel(name = "商户订单号")
    @ApiModelProperty(example = "商户订单号")
    private String mchOrderNo;

    /** 收支类型(-1：支出，1：收入，0：非收支记录) */
    @ApiModelProperty(example = "收支类型(-1：支出，1：收入，0：非收支记录)")
    @Excel(name = "收支类型", readConverterExp = "-1-支出,1-收入,0-非收支记录")
    private Byte paymentType;

    /** 金额 */
    @Excel(name = "金额")
    @ApiModelProperty(example = "金额")
    private BigDecimal amount;

    /** 当前余额 */
    @Excel(name = "当前余额")
    @ApiModelProperty(example = "当前余额")
    private BigDecimal availableBalance;

    /** 0-退款，1-额度转入，2-额度转出，3-投注，4-派彩，5-冻结 */
    @Excel(name = "状态", readConverterExp = "0-退款,1-额度转入,2-额度转出,3-投注，4-派彩,5-冻结,6-解冻,7-撤单")
    @ApiModelProperty(example = "id")
    private Byte tradeType;

    /** 状态(1-到账，2-冻结,3-取消) */
    @Excel(name = "状态(1-到账，2-冻结,3-取消)")
    @ApiModelProperty(example = "状态(1-到账，2-冻结,3-取消)")
    private Byte status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 57, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 57, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    private Date updateTime;

    /** 备注 */
    @ApiModelProperty(example = "备注")
    private String remark;

    private Date beginTime;

    private Date endTime;

    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    @ApiModelProperty(example = "平台用户ID")
    private Long platformUserId;


}
