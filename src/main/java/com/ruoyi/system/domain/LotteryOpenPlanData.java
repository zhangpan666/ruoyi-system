package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.system.domain.vo.LotterySingleNumberInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * 开奖记录对象 t_lottery_record
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(description = "控奖数据")
public class LotteryOpenPlanData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    @Excel(name = "ID")
    @ApiModelProperty(example = "ID")
    private Long id;

    /**
     * 类型，1-六合彩，2-动物彩
     */
    @Excel(name = "类型", readConverterExp = "1=六合彩,2=动物彩")
    @ApiModelProperty(example = "类型，1-六合彩，2-动物彩")
    private Byte type;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    @ApiModelProperty(example = "彩种ID")
    private Long lotteryId;

    @Excel(name = "彩种名称")
    @ApiModelProperty(example = "彩种名称")
    private String lotteryName;

    /** 年份 */
    @Excel(name = "年份")
    @ApiModelProperty(example = "年份")
    private Integer year;

    /** 期号 */
    @Excel(name = "期号")
    @ApiModelProperty(example = "期号")
    private String issueNo;

    /** 开奖日期 */
    @Excel(name = "开奖日期")
    @ApiModelProperty(example = "开奖日期")
    private String date;

    /** 开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开奖时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(example = "开奖时间")
    private Date lotteryTime;

    /** 开奖号码类型，1-预设，2-随机，3-控奖，4-官方，5-有下注随机 */
    @Excel(name = "开奖号码类型", readConverterExp = "1=预设,2=随机,3=控奖,4=官方,5=有下注随机")
    @ApiModelProperty(example = "开奖号码类型，1-预设，2-随机，3-控奖，4-官方，5-有下注随机")
    private Byte lotteryNumberType;

    /** 目标杀率 */
    @Excel(name = "目标杀率")
    @ApiModelProperty(example = "目标杀率")
    private String targetKillRate;

    /** 实际杀率 */
    @Excel(name = "实际杀率")
    @ApiModelProperty(example = "实际杀率")
    private String realKillRate;

}
