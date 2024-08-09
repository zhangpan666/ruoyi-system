package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Long id;

    /** 彩种ID */
    @Excel(name = "彩种ID")
    private Long lotteryId;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 期数 */
    @Excel(name = "期数")
    private Long period;

    /** 期号 */
    @Excel(name = "期号")
    private String issueNo;

    /** 开奖日期 */
    @Excel(name = "开奖日期")
    private Long dateline;

    /** $column.columnComment */
    private String date;

    /** 开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "开奖时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date lotteryTime;

    /** 生肖 */
    @Excel(name = "生肖")
    private String sx;

    /** 五行 */
    @Excel(name = "五行")
    private String wx;

    /** 数字 */
    @Excel(name = "数字")
    private String numbers;

    /** 状态(1-有效，0-无效) */
    @Excel(name = "状态(1-有效，0-无效)")
    private Integer status;

    /** 开奖视频回放地址 */
    @Excel(name = "开奖视频回放地址")
    private String lotteryVideoPath;

    /** 开奖回放视频上传状态，0-未上传，1-已上传 */
    @Excel(name = "开奖回放视频上传状态，0-未上传，1-已上传")
    private Integer lotteryVideoStatus;

    /** 注单结算状态，0-待结算，1-结算中，2-结算完成 */
    @Excel(name = "注单结算状态，0-待结算，1-结算中，2-结算完成")
    private Integer betRecordCountStatus;

    /** 开奖状态，0-开奖中，1-开奖完成 */
    @Excel(name = "开奖状态，0-开奖中，1-开奖完成")
    private Integer lotteryStatus;

    @Excel(name = "彩种")
    private String lotteryName;

}
