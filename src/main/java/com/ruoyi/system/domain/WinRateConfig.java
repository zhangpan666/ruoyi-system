package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 赢率配置对象 t_win_rate_config
 *
 * @author ruoyi
 * @date 2024-10-28
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WinRateConfig
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "ID")
    @ApiModelProperty(value = "ID")
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(value = "ID")
    private Long lotteryId;

    @Excel(name = "彩种名称")
    @ApiModelProperty(value = "彩种名称")
    private String lotteryName;

    /** 1-全部控制，2-单个控制 */
    @Excel(name = "1-全部控制，2-单个控制")
    @ApiModelProperty(value = "1-全部控制，2-单个控制")
    private Byte type;

    /** 被单控会员的会员ID */
    @Excel(name = "被单控会员的会员ID")
    @ApiModelProperty(value = "被单控会员的会员ID")
    private String relatedUserIds;

    /** 返奖率 */
    @Excel(name = "返奖率")
    @ApiModelProperty(value = "返奖率")
    private String moneyReturnRate;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @ApiModelProperty(value = "状态，1-有效，0-无效")
    private Byte status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "创建时间")
    private Date createTime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "更新时间")
    private Date updateTime;

    /** 备注 */
    @ApiModelProperty(example = "备注")
    private String remark;

}
