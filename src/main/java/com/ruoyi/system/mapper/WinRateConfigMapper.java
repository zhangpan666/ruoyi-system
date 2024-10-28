package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WinRateConfig;

/**
 * 赢率配置Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-28
 */
public interface WinRateConfigMapper 
{
    /**
     * 查询赢率配置
     * 
     * @param id 赢率配置主键
     * @return 赢率配置
     */
    public WinRateConfig selectWinRateConfigById(Long id);

    /**
     * 查询赢率配置列表
     * 
     * @param winRateConfig 赢率配置
     * @return 赢率配置集合
     */
    public List<WinRateConfig> selectWinRateConfigList(WinRateConfig winRateConfig);

    /**
     * 新增赢率配置
     * 
     * @param winRateConfig 赢率配置
     * @return 结果
     */
    public int insertWinRateConfig(WinRateConfig winRateConfig);

    /**
     * 修改赢率配置
     * 
     * @param winRateConfig 赢率配置
     * @return 结果
     */
    public int updateWinRateConfig(WinRateConfig winRateConfig);

    /**
     * 删除赢率配置
     * 
     * @param id 赢率配置主键
     * @return 结果
     */
    public int deleteWinRateConfigById(Long id);

    /**
     * 批量删除赢率配置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWinRateConfigByIds(Long[] ids);
}
