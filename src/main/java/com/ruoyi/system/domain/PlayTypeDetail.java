package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 玩法明细对象 t_play_type_detail
 *
 * @author ruoyi
 * @date 2024-11-14
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PlayTypeDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** 玩法code */
    @Excel(name = "玩法code")
    private Byte playTypeCode;

    /** 类型，1-号码，2-号段，3-大小，4-单双，5-家野，6-尾数大小，7-波色，8-龙虎，9-生肖，10-尾数，11-合数 */
    @Excel(name = "类型，1-号码，2-号段，3-大小，4-单双，5-家野，6-尾数大小，7-波色，8-龙虎，9-生肖，10-尾数，11-合数")
    private Byte type;

    /** code */
    @Excel(name = "code")
    private String code;

    /** 限额code */
    @Excel(name = "限额code")
    private String betLimitCode;

    /** 玩法名称 */
    @Excel(name = "玩法名称")
    private String value;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Byte playTypeItem;

    /** 限额类型 */
    @Excel(name = "限额类型")
    private Byte betLimitAmountType;

    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

    /** 状态，1-有效，0-无效 */
    @Excel(name = "状态，1-有效，0-无效")
    private Byte status;

    /** 是否可选，1-是，0-否 */
    @Excel(name = "是否可选，1-是，0-否")
    private Byte availableOption;

}
