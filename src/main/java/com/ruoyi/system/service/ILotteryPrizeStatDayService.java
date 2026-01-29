package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LotteryPrizeStatDay;

/**
 * 爆奖每日汇总Service接口
 * 
 * @author ruoyi
 * @date 2026-01-29
 */
public interface ILotteryPrizeStatDayService 
{
    /**
     * 查询爆奖每日汇总
     * 
     * @param id 爆奖每日汇总主键
     * @return 爆奖每日汇总
     */
    public LotteryPrizeStatDay selectLotteryPrizeStatDayById(Long id);

    /**
     * 查询爆奖每日汇总列表
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 爆奖每日汇总集合
     */
    public List<LotteryPrizeStatDay> selectLotteryPrizeStatDayList(LotteryPrizeStatDay lotteryPrizeStatDay);

    /**
     * 新增爆奖每日汇总
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 结果
     */
    public int insertLotteryPrizeStatDay(LotteryPrizeStatDay lotteryPrizeStatDay);

    /**
     * 修改爆奖每日汇总
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 结果
     */
    public int updateLotteryPrizeStatDay(LotteryPrizeStatDay lotteryPrizeStatDay);

    /**
     * 批量删除爆奖每日汇总
     * 
     * @param ids 需要删除的爆奖每日汇总主键集合
     * @return 结果
     */
    public int deleteLotteryPrizeStatDayByIds(Long[] ids);

    /**
     * 删除爆奖每日汇总信息
     * 
     * @param id 爆奖每日汇总主键
     * @return 结果
     */
    public int deleteLotteryPrizeStatDayById(Long id);
}
