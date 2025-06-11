package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.platformPlayTypeItemMapper;
import com.ruoyi.system.domain.platformPlayTypeItem;
import com.ruoyi.system.service.IplatformPlayTypeItemService;

/**
 * 平台玩法小类Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-11
 */
@Service
public class platformPlayTypeItemServiceImpl implements IplatformPlayTypeItemService 
{
    @Autowired
    private platformPlayTypeItemMapper platformPlayTypeItemMapper;

    /**
     * 查询平台玩法小类
     * 
     * @param id 平台玩法小类主键
     * @return 平台玩法小类
     */
    @Override
    public platformPlayTypeItem selectplatformPlayTypeItemById(Long id)
    {
        return platformPlayTypeItemMapper.selectplatformPlayTypeItemById(id);
    }

    /**
     * 查询平台玩法小类列表
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 平台玩法小类
     */
    @Override
    public List<platformPlayTypeItem> selectplatformPlayTypeItemList(platformPlayTypeItem platformPlayTypeItem)
    {
        return platformPlayTypeItemMapper.selectplatformPlayTypeItemList(platformPlayTypeItem);
    }

    /**
     * 新增平台玩法小类
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    @Override
    public int insertplatformPlayTypeItem(platformPlayTypeItem platformPlayTypeItem)
    {
        platformPlayTypeItem.setCreateTime(DateUtils.getNowDate());
        return platformPlayTypeItemMapper.insertplatformPlayTypeItem(platformPlayTypeItem);
    }

    /**
     * 修改平台玩法小类
     * 
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    @Override
    public int updateplatformPlayTypeItem(platformPlayTypeItem platformPlayTypeItem)
    {
        platformPlayTypeItem.setUpdateTime(DateUtils.getNowDate());
        return platformPlayTypeItemMapper.updateplatformPlayTypeItem(platformPlayTypeItem);
    }

    /**
     * 批量删除平台玩法小类
     * 
     * @param ids 需要删除的平台玩法小类主键
     * @return 结果
     */
    @Override
    public int deleteplatformPlayTypeItemByIds(Long[] ids)
    {
        return platformPlayTypeItemMapper.deleteplatformPlayTypeItemByIds(ids);
    }

    /**
     * 删除平台玩法小类信息
     * 
     * @param id 平台玩法小类主键
     * @return 结果
     */
    @Override
    public int deleteplatformPlayTypeItemById(Long id)
    {
        return platformPlayTypeItemMapper.deleteplatformPlayTypeItemById(id);
    }
}
