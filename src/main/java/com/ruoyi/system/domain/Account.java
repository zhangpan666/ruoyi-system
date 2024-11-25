package com.ruoyi.system.domain;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账户对象 t_account
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Account extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @Excel(name = "账户ID")
    @ApiModelProperty(example = "账户ID")
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    @ApiModelProperty(example = "用户ID")
    private Long userId;

    @Excel(name = "平台ID")
    @ApiModelProperty(example = "平台ID")
    private Long platformId;

    @Excel(name = "平台名称")
    @ApiModelProperty(example = "平台名称")
    private String platformName;

    @Excel(name = "平台用户ID")
    @ApiModelProperty(example = "平台用户ID")
    private Long platformUserId;

    /** 总收入 */
    @Excel(name = "总收入")
    @ApiModelProperty(example = "总收入")
    private BigDecimal balanceIncomeAmount;

    /** 总支出 */
    @Excel(name = "总支出")
    @ApiModelProperty(example = "总支出")
    private BigDecimal balanceExpenseAmount;

    /** 可用余额 */
    @Excel(name = "可用余额")
    @ApiModelProperty(example = "可用余额")
    private BigDecimal availableBalance;

    /** 冻结余额 */
    @Excel(name = "冻结余额")
    @ApiModelProperty(example = "冻结余额")
    private BigDecimal freezeBalanceAmount;

    /** 总投注金额 */
    @Excel(name = "总投注金额")
    @ApiModelProperty(example = "总投注金额")
    private BigDecimal totalBetAmount;

    /** 总输赢金额 */
    @Excel(name = "总输赢金额")
    @ApiModelProperty(example = "总输赢金额")
    private BigDecimal totalWinLoseAmount;

    /** 账户状态，1-正常，0-冻结 */
    @Excel(name = "账户状态，1-正常，0-冻结")
    @ApiModelProperty(example = "账户状态，1-正常，0-冻结")
    private Byte status;

}
