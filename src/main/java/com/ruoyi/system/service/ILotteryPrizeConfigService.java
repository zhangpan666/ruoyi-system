package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LotteryPrizeConfig;

/**
 * 爆奖配置Service接口
 * 
 * @author ruoyi
 * @date 2025-11-28
 */
public interface ILotteryPrizeConfigService 
{
    /**
     * 查询爆奖配置
     * 
     * @param id 爆奖配置主键
     * @return 爆奖配置
     */
    public LotteryPrizeConfig selectLotteryPrizeConfigById(Long id);

    /**
     * 查询爆奖配置列表
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 爆奖配置集合
     */
    public List<LotteryPrizeConfig> selectLotteryPrizeConfigList(LotteryPrizeConfig lotteryPrizeConfig);

    /**
     * 新增爆奖配置
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 结果
     */
    public int insertLotteryPrizeConfig(LotteryPrizeConfig lotteryPrizeConfig);

    /**
     * 修改爆奖配置
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 结果
     */
    public int updateLotteryPrizeConfig(LotteryPrizeConfig lotteryPrizeConfig);

    /**
     * 批量删除爆奖配置
     * 
     * @param ids 需要删除的爆奖配置主键集合
     * @return 结果
     */
    public int deleteLotteryPrizeConfigByIds(Long[] ids);

    /**
     * 删除爆奖配置信息
     * 
     * @param id 爆奖配置主键
     * @return 结果
     */
    public int deleteLotteryPrizeConfigById(Long id);
}
