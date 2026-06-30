package com.ruoyi.system.service;

import com.ruoyi.system.domain.dto.BetStatQueryParam;
import com.ruoyi.system.domain.vo.BetStatByLotteryVO;
import com.ruoyi.system.domain.vo.BetStatOverviewVO;
import com.ruoyi.system.domain.vo.BetStatTopUserVO;
import com.ruoyi.system.domain.vo.BetStatTopUsersDualVO;
import com.ruoyi.system.domain.vo.BetStatTrendVO;

import java.util.List;

/**
 * 投注统计 Service
 */
public interface IBetStatService {

    BetStatOverviewVO overview(BetStatQueryParam param);

    List<BetStatByLotteryVO> byLottery(BetStatQueryParam param);

    List<BetStatTrendVO> trend(BetStatQueryParam param);

    List<BetStatByLotteryVO> topLotteries(BetStatQueryParam param, String order);

    List<BetStatTopUserVO> topUsers(BetStatQueryParam param, String order);

    BetStatTopUsersDualVO topUsersDual(BetStatQueryParam param,
                                       int lossPageNum, int lossPageSize,
                                       int winPageNum, int winPageSize);
}
