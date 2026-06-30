package com.ruoyi.system.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Collections;
import java.util.List;

/**
 * 大额赢用户 + 大额输用户 一次性返回，单事务保证两组数据来自同一快照。
 */
@ApiModel(description = "Top 用户双向排行")
@Data
@Accessors(chain = true)
public class BetStatTopUsersDualVO {

    @ApiModelProperty(value = "大额赢用户列表（平台输给的，winLose ASC）")
    private List<BetStatTopUserVO> lossList = Collections.emptyList();

    @ApiModelProperty(value = "大额赢用户总数")
    private long lossTotal = 0L;

    @ApiModelProperty(value = "大额输用户列表（平台赢的，winLose DESC）")
    private List<BetStatTopUserVO> winList = Collections.emptyList();

    @ApiModelProperty(value = "大额输用户总数")
    private long winTotal = 0L;
}
