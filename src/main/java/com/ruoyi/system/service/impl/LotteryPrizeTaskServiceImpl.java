package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryPrizeTaskMapper;
import com.ruoyi.system.domain.LotteryPrizeTask;
import com.ruoyi.system.service.ILotteryPrizeTaskService;

/**
 * 爆奖任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-28
 */
@Service
public class LotteryPrizeTaskServiceImpl implements ILotteryPrizeTaskService 
{
    @Autowired
    private LotteryPrizeTaskMapper lotteryPrizeTaskMapper;

    /**
     * 查询爆奖任务
     * 
     * @param id 爆奖任务主键
     * @return 爆奖任务
     */
    @Override
    public LotteryPrizeTask selectLotteryPrizeTaskById(Long id)
    {
        return lotteryPrizeTaskMapper.selectLotteryPrizeTaskById(id);
    }

    /**
     * 查询爆奖任务列表
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 爆奖任务
     */
    @Override
    public List<LotteryPrizeTask> selectLotteryPrizeTaskList(LotteryPrizeTask lotteryPrizeTask)
    {
        return lotteryPrizeTaskMapper.selectLotteryPrizeTaskList(lotteryPrizeTask);
    }

    /**
     * 新增爆奖任务
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 结果
     */
    @Override
    public int insertLotteryPrizeTask(LotteryPrizeTask lotteryPrizeTask)
    {
        lotteryPrizeTask.setCreateTime(DateUtils.getNowDate());
        return lotteryPrizeTaskMapper.insertLotteryPrizeTask(lotteryPrizeTask);
    }

    /**
     * 修改爆奖任务
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 结果
     */
    @Override
    public int updateLotteryPrizeTask(LotteryPrizeTask lotteryPrizeTask)
    {
        lotteryPrizeTask.setUpdateTime(DateUtils.getNowDate());
        return lotteryPrizeTaskMapper.updateLotteryPrizeTask(lotteryPrizeTask);
    }

    /**
     * 批量删除爆奖任务
     * 
     * @param ids 需要删除的爆奖任务主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeTaskByIds(Long[] ids)
    {
        return lotteryPrizeTaskMapper.deleteLotteryPrizeTaskByIds(ids);
    }

    /**
     * 删除爆奖任务信息
     * 
     * @param id 爆奖任务主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeTaskById(Long id)
    {
        return lotteryPrizeTaskMapper.deleteLotteryPrizeTaskById(id);
    }
}
