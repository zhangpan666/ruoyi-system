package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LotteryOpenPlan;

/**
 * 开奖计划Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-29
 */
public interface LotteryOpenPlanMapper 
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
     * 删除开奖计划
     * 
     * @param id 开奖计划主键
     * @return 结果
     */
    public int deleteLotteryOpenPlanById(Long id);

    /**
     * 批量删除开奖计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLotteryOpenPlanByIds(Long[] ids);
}
