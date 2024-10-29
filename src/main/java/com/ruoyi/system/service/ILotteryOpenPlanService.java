package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LotteryOpenPlan;

/**
 * 开奖计划Service接口
 * 
 * @author ruoyi
 * @date 2024-10-29
 */
public interface ILotteryOpenPlanService 
{
    /**
     * 查询开奖计划
     * 
     * @param id 开奖计划主键
     * @return 开奖计划
     */
    public LotteryOpenPlan selectLotteryOpenPlanById(Long id);

    /**
     * 查询开奖计划列表
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 开奖计划集合
     */
    public List<LotteryOpenPlan> selectLotteryOpenPlanList(LotteryOpenPlan lotteryOpenPlan);

    /**
     * 新增开奖计划
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 结果
     */
    public int insertLotteryOpenPlan(LotteryOpenPlan lotteryOpenPlan);

    /**
     * 修改开奖计划
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 结果
     */
    public int updateLotteryOpenPlan(LotteryOpenPlan lotteryOpenPlan);

    /**
     * 批量删除开奖计划
     * 
     * @param ids 需要删除的开奖计划主键集合
     * @return 结果
     */
    public int deleteLotteryOpenPlanByIds(Long[] ids);

    /**
     * 删除开奖计划信息
     * 
     * @param id 开奖计划主键
     * @return 结果
     */
    public int deleteLotteryOpenPlanById(Long id);
}
