package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlatformPlayType;

/**
 * 平台玩法大类Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-11
 */
public interface PlatformPlayTypeMapper 
{
    /**
     * 查询平台玩法大类
     * 
     * @param id 平台玩法大类主键
     * @return 平台玩法大类
     */
    public PlatformPlayType selectPlatformPlayTypeById(Long id);

    /**
     * 查询平台玩法大类列表
     * 
     * @param platformPlayType 平台玩法大类
     * @return 平台玩法大类集合
     */
    public List<PlatformPlayType> selectPlatformPlayTypeList(PlatformPlayType platformPlayType);

    /**
     * 新增平台玩法大类
     * 
     * @param platformPlayType 平台玩法大类
     * @return 结果
     */
    public int insertPlatformPlayType(PlatformPlayType platformPlayType);

    /**
     * 修改平台玩法大类
     * 
     * @param platformPlayType 平台玩法大类
     * @return 结果
     */
    public int updatePlatformPlayType(PlatformPlayType platformPlayType);

    /**
     * 删除平台玩法大类
     * 
     * @param id 平台玩法大类主键
     * @return 结果
     */
    public int deletePlatformPlayTypeById(Long id);

    /**
     * 批量删除平台玩法大类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePlatformPlayTypeByIds(Long[] ids);
}
