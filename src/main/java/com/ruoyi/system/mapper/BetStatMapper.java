package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.dto.BetStatQueryParam;
import com.ruoyi.system.domain.vo.BetStatByLotteryVO;
import com.ruoyi.system.domain.vo.BetStatOverviewVO;
import com.ruoyi.system.domain.vo.BetStatTopUserVO;
import com.ruoyi.system.domain.vo.BetStatTrendVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 投注统计 Mapper
 */
public interface BetStatMapper {

    BetStatOverviewVO overview(@Param("param") BetStatQueryParam param);

    List<BetStatByLotteryVO> byLottery(@Param("param") BetStatQueryParam param);

    List<BetStatTrendVO> trendByDay(@Param("param") BetStatQueryParam param);

    List<BetStatTrendVO> trendByIssue(@Param("param") BetStatQueryParam param);

    /** order: ASC=亏损排序 (winLose 最小)；DESC=盈利排序 (winLose 最大)。分页由 PageHelper 处理 */
    List<BetStatByLotteryVO> topLotteries(@Param("param") BetStatQueryParam param, @Param("order") String order);

    /** order: ASC=平台输排序 (winLose 最小=用户赢钱多)；DESC=平台赢排序 (winLose 最大=用户输钱多) */
    List<BetStatTopUserVO> topUsers(@Param("param") BetStatQueryParam param, @Param("order") String order);
}
