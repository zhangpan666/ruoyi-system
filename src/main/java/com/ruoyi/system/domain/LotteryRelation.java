package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 码表对象 t_lottery_relation
 *
 * @author ruoyi
 * @date 2024-08-14
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryRelation extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(example = "id")
    private Long id;

    /**
     * 数字
     */
    @Excel(name = "数字")
    @ApiModelProperty(example = "数字")
    private String number;

    /**
     * 颜色(1红色，2-蓝色，3-绿色)
     */
    @Excel(name = "颜色", readConverterExp = "1-红色,2-蓝色,3-绿色")
    @ApiModelProperty(example = "颜色(1红色，2-蓝色，3-绿色)")
    private Byte color;

    /**
     * 五行(金木水火土)
     */
    @Excel(name = "五行(金木水火土)")
    @ApiModelProperty(example = "五行")
    private String wx;

    /**
     * 生肖(鼠牛虎兔...)
     */
    @Excel(name = "生肖(鼠牛虎兔...)")
    @ApiModelProperty(example = "生肖")
    private String sx;

    /**
     * 年份
     */
    @Excel(name = "年份")
    @ApiModelProperty(example = "年份")
    private Integer year;

}
