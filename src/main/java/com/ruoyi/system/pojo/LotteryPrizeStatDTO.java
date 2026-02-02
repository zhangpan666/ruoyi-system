package com.ruoyi.system.pojo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class LotteryPrizeStatDTO implements Serializable {

    private Long lotteryId;

    private String lotteryName;

    private Date statDate;

    private int totalPrizeCount;

    private int totalPrizePeopleCount;

    private BigDecimal totalPrizeAmount;

}
