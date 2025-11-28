package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LotteryPrizeTask;

/**
 * 爆奖任务Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-28
 */
public interface LotteryPrizeTaskMapper 
{
    /**
     * 查询爆奖任务
     * 
     * @param id 爆奖任务主键
     * @return 爆奖任务
     */
    public LotteryPrizeTask selectLotteryPrizeTaskById(Long id);

    /**
     * 查询爆奖任务列表
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 爆奖任务集合
     */
    public List<LotteryPrizeTask> selectLotteryPrizeTaskList(LotteryPrizeTask lotteryPrizeTask);

    /**
     * 新增爆奖任务
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 结果
     */
    public int insertLotteryPrizeTask(LotteryPrizeTask lotteryPrizeTask);

    /**
     * 修改爆奖任务
     * 
     * @param lotteryPrizeTask 爆奖任务
     * @return 结果
     */
    public int updateLotteryPrizeTask(LotteryPrizeTask lotteryPrizeTask);

    /**
     * 删除爆奖任务
     * 
     * @param id 爆奖任务主键
     * @return 结果
     */
    public int deleteLotteryPrizeTaskById(Long id);

    /**
     * 批量删除爆奖任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLotteryPrizeTaskByIds(Long[] ids);
}
