package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PlatformPlayTypeItem;

/**
 * 平台玩法小类Service接口
 *
 * @author ruoyi
 * @date 2025-06-12
 */
public interface IPlatformPlayTypeItemService
{
    /**
     * 查询平台玩法小类
     *
     * @param id 平台玩法小类主键
     * @return 平台玩法小类
     */
    public PlatformPlayTypeItem selectPlatformPlayTypeItemById(Long id);

    /**
     * 查询平台玩法小类列表
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 平台玩法小类集合
     */
    public List<PlatformPlayTypeItem> selectPlatformPlayTypeItemList(PlatformPlayTypeItem platformPlayTypeItem);

    /**
     * 新增平台玩法小类
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    public int insertPlatformPlayTypeItem(PlatformPlayTypeItem platformPlayTypeItem);

    /**
     * 修改平台玩法小类
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    public int updatePlatformPlayTypeItem(PlatformPlayTypeItem platformPlayTypeItem);

    /**
     * 批量删除平台玩法小类
     *
     * @param ids 需要删除的平台玩法小类主键集合
     * @return 结果
     */
    public int deletePlatformPlayTypeItemByIds(Long[] ids);

    /**
     * 删除平台玩法小类信息
     *
     * @param id 平台玩法小类主键
     * @return 结果
     */
    public int deletePlatformPlayTypeItemById(Long id);

    void initPlatformPlayTypeItem(Long platformId);

    void syncPlatformPlayTypeItem(Long platformId);

}
