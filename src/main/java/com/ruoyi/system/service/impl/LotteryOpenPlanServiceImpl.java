package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryOpenPlanMapper;
import com.ruoyi.system.domain.LotteryOpenPlan;
import com.ruoyi.system.service.ILotteryOpenPlanService;

/**
 * 开奖计划Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-29
 */
@Service
public class LotteryOpenPlanServiceImpl implements ILotteryOpenPlanService 
{
    @Autowired
    private LotteryOpenPlanMapper lotteryOpenPlanMapper;

    /**
     * 查询开奖计划
     * 
     * @param id 开奖计划主键
     * @return 开奖计划
     */
    @Override
    public LotteryOpenPlan selectLotteryOpenPlanById(Long id)
    {
        return lotteryOpenPlanMapper.selectLotteryOpenPlanById(id);
    }

    /**
     * 查询开奖计划列表
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 开奖计划
     */
    @Override
    public List<LotteryOpenPlan> selectLotteryOpenPlanList(LotteryOpenPlan lotteryOpenPlan)
    {
        return lotteryOpenPlanMapper.selectLotteryOpenPlanList(lotteryOpenPlan);
    }

    /**
     * 新增开奖计划
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 结果
     */
    @Override
    public int insertLotteryOpenPlan(LotteryOpenPlan lotteryOpenPlan)
    {
        lotteryOpenPlan.setCreateTime(DateUtils.getNowDate());
        return lotteryOpenPlanMapper.insertLotteryOpenPlan(lotteryOpenPlan);
    }

    /**
     * 修改开奖计划
     * 
     * @param lotteryOpenPlan 开奖计划
     * @return 结果
     */
    @Override
    public int updateLotteryOpenPlan(LotteryOpenPlan lotteryOpenPlan)
    {
        lotteryOpenPlan.setUpdateTime(DateUtils.getNowDate());
        return lotteryOpenPlanMapper.updateLotteryOpenPlan(lotteryOpenPlan);
    }

    /**
     * 批量删除开奖计划
     * 
     * @param ids 需要删除的开奖计划主键
     * @return 结果
     */
    @Override
    public int deleteLotteryOpenPlanByIds(Long[] ids)
    {
        return lotteryOpenPlanMapper.deleteLotteryOpenPlanByIds(ids);
    }

    /**
     * 删除开奖计划信息
     * 
     * @param id 开奖计划主键
     * @return 结果
     */
    @Override
    public int deleteLotteryOpenPlanById(Long id)
    {
        return lotteryOpenPlanMapper.deleteLotteryOpenPlanById(id);
    }
}
