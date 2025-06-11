package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.platformPlayTypeItem;

/**
 * 平台玩法小类Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-11
 */
public interface platformPlayTypeItemMapper 
{
    /**
     * 查询平台玩法小类
     * 
     * @param id 平台玩法小类主键
     * @return 平台玩法小类
     */
    public platformPlayTypeItem selectplatformPlayTypeItemById(Long id);

    /**
     * 查询平台玩法小类列表
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 平台玩法小类集合
     */
    public List<platformPlayTypeItem> selectplatformPlayTypeItemList(platformPlayTypeItem platformPlayTypeItem);

    /**
     * 新增平台玩法小类
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    public int insertplatformPlayTypeItem(platformPlayTypeItem platformPlayTypeItem);

    /**
     * 修改平台玩法小类
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    public int updateplatformPlayTypeItem(platformPlayTypeItem platformPlayTypeItem);

    /**
     * 删除平台玩法小类
     * 
     * @param id 平台玩法小类主键
     * @return 结果
     */
    public int deleteplatformPlayTypeItemById(Long id);

    /**
     * 批量删除平台玩法小类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteplatformPlayTypeItemByIds(Long[] ids);
}
