package com.ruoyi.system.domain.dto;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class BetRecordStatDTO implements Serializable {

    private Long lotteryId;

    private BigDecimal totalBetAmount;

    private BigDecimal totalLotteryJackpotContributeAmount;

    private BigDecimal totalGlobalJackpotContributeAmount;


}
