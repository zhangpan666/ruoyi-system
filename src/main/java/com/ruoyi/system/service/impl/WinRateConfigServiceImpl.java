package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WinRateConfigMapper;
import com.ruoyi.system.domain.WinRateConfig;
import com.ruoyi.system.service.IWinRateConfigService;

/**
 * 赢率配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-28
 */
@Service
public class WinRateConfigServiceImpl implements IWinRateConfigService 
{
    @Autowired
    private WinRateConfigMapper winRateConfigMapper;

    /**
     * 查询赢率配置
     * 
     * @param id 赢率配置主键
     * @return 赢率配置
     */
    @Override
    public WinRateConfig selectWinRateConfigById(Long id)
    {
        return winRateConfigMapper.selectWinRateConfigById(id);
    }

    /**
     * 查询赢率配置列表
     * 
     * @param winRateConfig 赢率配置
     * @return 赢率配置
     */
    @Override
    public List<WinRateConfig> selectWinRateConfigList(WinRateConfig winRateConfig)
    {
        return winRateConfigMapper.selectWinRateConfigList(winRateConfig);
    }

    /**
     * 新增赢率配置
     * 
     * @param winRateConfig 赢率配置
     * @return 结果
     */
    @Override
    public int insertWinRateConfig(WinRateConfig winRateConfig)
    {
        winRateConfig.setCreateTime(DateUtils.getNowDate());
        return winRateConfigMapper.insertWinRateConfig(winRateConfig);
    }

    /**
     * 修改赢率配置
     * 
     * @param winRateConfig 赢率配置
     * @return 结果
     */
    @Override
    public int updateWinRateConfig(WinRateConfig winRateConfig)
    {
        winRateConfig.setUpdateTime(DateUtils.getNowDate());
        return winRateConfigMapper.updateWinRateConfig(winRateConfig);
    }

    /**
     * 批量删除赢率配置
     * 
     * @param ids 需要删除的赢率配置主键
     * @return 结果
     */
    @Override
    public int deleteWinRateConfigByIds(Long[] ids)
    {
        return winRateConfigMapper.deleteWinRateConfigByIds(ids);
    }

    /**
     * 删除赢率配置信息
     * 
     * @param id 赢率配置主键
     * @return 结果
     */
    @Override
    public int deleteWinRateConfigById(Long id)
    {
        return winRateConfigMapper.deleteWinRateConfigById(id);
    }
}
