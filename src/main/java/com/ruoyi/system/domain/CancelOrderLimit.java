package com.ruoyi.system.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 撤单限制对象 t_cancel_order_limit
 *
 * @author ruoyi
 * @date 2024-08-28
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CancelOrderLimit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty(example = "id")
    private Long id;

    /** 平台id，0-默认 */
    @Excel(name = "平台id，0-默认")
    @ApiModelProperty(example = "平台id，0-默认")
    private Long platformId;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    /** 封盘类型，1-封盘前，2-下注后 */
    @Excel(name = "封盘类型，1-封盘前，2-下注后")
    @ApiModelProperty(example = "封盘类型，1-封盘前，2-下注后")
    private Byte type;

    /** 时间控制 */
    @Excel(name = "时间控制")
    @ApiModelProperty(example = "时间控制")
    private Integer timeout;

    /** 单期允许最大撤单注数 */
    @Excel(name = "单期允许最大撤单注数")
    @ApiModelProperty(example = "单期允许最大撤单注数")
    private Long singlePeriodAllowMaxCancelCount;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

}
