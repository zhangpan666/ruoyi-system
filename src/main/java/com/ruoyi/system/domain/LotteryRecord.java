package com.ruoyi.system.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.system.domain.vo.LotterySingleNumberInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 开奖记录对象 t_lottery_record
 *
 * @author ruoyi
 * @date 2024-08-09
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotteryRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "id")
    @ApiModelProperty(example = "ID")
    private Long id;

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

    /** 生肖 */
    @Excel(name = "生肖")
    @ApiModelProperty(example = "生肖")
    private String sx;

    /** 五行 */
    @Excel(name = "五行")
    @ApiModelProperty(example = "五行")
    private String wx;

    /** 数字 */
    @Excel(name = "数字")
    @ApiModelProperty(example = "数字")
    private String numbers;

    /** 状态(1-有效，0-无效) */
    @Excel(name = "状态", readConverterExp = "1=有效,0=无效")
    @ApiModelProperty(example = "状态(1-有效，0-无效)")
    private Byte status;

    /** 开奖视频回放地址 */
    @Excel(name = "开奖视频回放地址")
    @ApiModelProperty(example = "开奖视频回放地址")
    private String lotteryVideoPath;

    /** 开奖回放视频上传状态，0-未上传，1-已上传 */
    @Excel(name = "开奖回放视频上传状态", readConverterExp = "0=未上传,1=已上传")
    @ApiModelProperty(example = "开奖回放视频上传状态，0-未上传，1-已上传")
    private Byte lotteryVideoStatus;

    /** 注单结算状态，0-待结算，1-结算中，2-结算完成 */
    @Excel(name = "注单结算状态", readConverterExp = "0=待结算,1=结算中,2=结算完成")
    @ApiModelProperty(example = "注单结算状态，0-待结算，1-结算中，2-结算完成")
    private Byte betRecordCountStatus;

    /** 开奖状态，0-开奖中，1-开奖完成 */
    @Excel(name = "开奖状态", readConverterExp = "0=开奖中,1=开奖完成")
    @ApiModelProperty(example = "开奖状态，0-开奖中，1-开奖完成")
    private Byte lotteryStatus;

    private List<LotterySingleNumberInfo> numberList;

    @ApiModelProperty(example = "总和")
    private Integer sum;

    @ApiModelProperty(example = "特码单双")
    private String teMaDanShuang;

    @ApiModelProperty(example = "特码大小")
    private String teMaDaXiao;

    @ApiModelProperty(example = "合数单双")
    private String heShuDanShuang;

    @ApiModelProperty(example = "总分单双")
    private String zongFenDanShuang;

    @ApiModelProperty(example = "总分大小")
    private String zongFenDaXiao;

    @ApiModelProperty(example = "波色")
    private String bs;

}
