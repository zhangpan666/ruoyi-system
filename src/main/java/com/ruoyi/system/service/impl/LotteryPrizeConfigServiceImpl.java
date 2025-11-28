package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryPrizeConfigMapper;
import com.ruoyi.system.domain.LotteryPrizeConfig;
import com.ruoyi.system.service.ILotteryPrizeConfigService;

/**
 * 爆奖配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-28
 */
@Service
public class LotteryPrizeConfigServiceImpl implements ILotteryPrizeConfigService 
{
    @Autowired
    private LotteryPrizeConfigMapper lotteryPrizeConfigMapper;

    /**
     * 查询爆奖配置
     * 
     * @param id 爆奖配置主键
     * @return 爆奖配置
     */
    @Override
    public LotteryPrizeConfig selectLotteryPrizeConfigById(Long id)
    {
        return lotteryPrizeConfigMapper.selectLotteryPrizeConfigById(id);
    }

    /**
     * 查询爆奖配置列表
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 爆奖配置
     */
    @Override
    public List<LotteryPrizeConfig> selectLotteryPrizeConfigList(LotteryPrizeConfig lotteryPrizeConfig)
    {
        return lotteryPrizeConfigMapper.selectLotteryPrizeConfigList(lotteryPrizeConfig);
    }

    /**
     * 新增爆奖配置
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 结果
     */
    @Override
    public int insertLotteryPrizeConfig(LotteryPrizeConfig lotteryPrizeConfig)
    {
        lotteryPrizeConfig.setCreateTime(DateUtils.getNowDate());
        return lotteryPrizeConfigMapper.insertLotteryPrizeConfig(lotteryPrizeConfig);
    }

    /**
     * 修改爆奖配置
     * 
     * @param lotteryPrizeConfig 爆奖配置
     * @return 结果
     */
    @Override
    public int updateLotteryPrizeConfig(LotteryPrizeConfig lotteryPrizeConfig)
    {
        lotteryPrizeConfig.setUpdateTime(DateUtils.getNowDate());
        return lotteryPrizeConfigMapper.updateLotteryPrizeConfig(lotteryPrizeConfig);
    }

    /**
     * 批量删除爆奖配置
     * 
     * @param ids 需要删除的爆奖配置主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeConfigByIds(Long[] ids)
    {
        return lotteryPrizeConfigMapper.deleteLotteryPrizeConfigByIds(ids);
    }

    /**
     * 删除爆奖配置信息
     * 
     * @param id 爆奖配置主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeConfigById(Long id)
    {
        return lotteryPrizeConfigMapper.deleteLotteryPrizeConfigById(id);
    }
}
