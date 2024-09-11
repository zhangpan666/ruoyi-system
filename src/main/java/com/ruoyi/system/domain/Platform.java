package com.ruoyi.system.domain;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 t_platform
 *
 * @author ruoyi
 * @date 2024-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_platform")
public class Platform extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @TableId(value = "id",type = IdType.AUTO)
    @Excel(name = "平台ID")
    @ApiModelProperty(example = "平台ID")
    private Long id;

    /** 平台名称 */
    @Excel(name = "平台名称")
    @TableField("name")
    @ApiModelProperty(example = "平台名称")
    private String name;

    /** md5Key */
    @TableField("md5_key")
    private String md5Key;


    /** 秘钥 */
    @TableField("secret_key")
    private String secretKey;
    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    @TableField("status")
    @ApiModelProperty(example = "状态，1-有效，0-无效")
    private Byte status;

    /** 信用额度 */
    @Excel(name = "信用额度")
    @TableField("credit_limit")
    private BigDecimal creditLimit;

    /** 已用额度 */
    @Excel(name = "已用额度")
    @TableField("used_credit_limit")
    private BigDecimal usedCreditLimit;

}
