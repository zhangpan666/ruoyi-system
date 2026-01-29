package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryPrizeStatDayMapper;
import com.ruoyi.system.domain.LotteryPrizeStatDay;
import com.ruoyi.system.service.ILotteryPrizeStatDayService;

/**
 * 爆奖每日汇总Service业务层处理
 * 
 * @author ruoyi
 * @date 2026-01-29
 */
@Service
public class LotteryPrizeStatDayServiceImpl implements ILotteryPrizeStatDayService 
{
    @Autowired
    private LotteryPrizeStatDayMapper lotteryPrizeStatDayMapper;

    /**
     * 查询爆奖每日汇总
     * 
     * @param id 爆奖每日汇总主键
     * @return 爆奖每日汇总
     */
    @Override
    public LotteryPrizeStatDay selectLotteryPrizeStatDayById(Long id)
    {
        return lotteryPrizeStatDayMapper.selectLotteryPrizeStatDayById(id);
    }

    /**
     * 查询爆奖每日汇总列表
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 爆奖每日汇总
     */
    @Override
    public List<LotteryPrizeStatDay> selectLotteryPrizeStatDayList(LotteryPrizeStatDay lotteryPrizeStatDay)
    {
        return lotteryPrizeStatDayMapper.selectLotteryPrizeStatDayList(lotteryPrizeStatDay);
    }

    /**
     * 新增爆奖每日汇总
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 结果
     */
    @Override
    public int insertLotteryPrizeStatDay(LotteryPrizeStatDay lotteryPrizeStatDay)
    {
        lotteryPrizeStatDay.setCreateTime(DateUtils.getNowDate());
        return lotteryPrizeStatDayMapper.insertLotteryPrizeStatDay(lotteryPrizeStatDay);
    }

    /**
     * 修改爆奖每日汇总
     * 
     * @param lotteryPrizeStatDay 爆奖每日汇总
     * @return 结果
     */
    @Override
    public int updateLotteryPrizeStatDay(LotteryPrizeStatDay lotteryPrizeStatDay)
    {
        lotteryPrizeStatDay.setUpdateTime(DateUtils.getNowDate());
        return lotteryPrizeStatDayMapper.updateLotteryPrizeStatDay(lotteryPrizeStatDay);
    }

    /**
     * 批量删除爆奖每日汇总
     * 
     * @param ids 需要删除的爆奖每日汇总主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeStatDayByIds(Long[] ids)
    {
        return lotteryPrizeStatDayMapper.deleteLotteryPrizeStatDayByIds(ids);
    }

    /**
     * 删除爆奖每日汇总信息
     * 
     * @param id 爆奖每日汇总主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeStatDayById(Long id)
    {
        return lotteryPrizeStatDayMapper.deleteLotteryPrizeStatDayById(id);
    }
}
