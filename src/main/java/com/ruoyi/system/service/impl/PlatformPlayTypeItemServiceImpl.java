package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.function.Consumer;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlatformPlayTypeItemMapper;
import com.ruoyi.system.domain.PlatformPlayTypeItem;
import com.ruoyi.system.service.IPlatformPlayTypeItemService;
import org.springframework.util.CollectionUtils;

/**
 * 平台玩法小类Service业务层处理
 *
 * @author ruoyi
 * @date 2025-06-12
 */
@Service
public class PlatformPlayTypeItemServiceImpl implements IPlatformPlayTypeItemService
{
    @Autowired
    private PlatformPlayTypeItemMapper platformPlayTypeItemMapper;

    /**
     * 查询平台玩法小类
     *
     * @param id 平台玩法小类主键
     * @return 平台玩法小类
     */
    @Override
    public PlatformPlayTypeItem selectPlatformPlayTypeItemById(Long id)
    {
        return platformPlayTypeItemMapper.selectPlatformPlayTypeItemById(id);
    }

    /**
     * 查询平台玩法小类列表
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 平台玩法小类
     */
    @Override
    public List<PlatformPlayTypeItem> selectPlatformPlayTypeItemList(PlatformPlayTypeItem platformPlayTypeItem)
    {
        return platformPlayTypeItemMapper.selectPlatformPlayTypeItemList(platformPlayTypeItem);
    }

    /**
     * 新增平台玩法小类
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    @Override
    public int insertPlatformPlayTypeItem(PlatformPlayTypeItem platformPlayTypeItem)
    {
        platformPlayTypeItem.setCreateTime(DateUtils.getNowDate());
        return platformPlayTypeItemMapper.insertPlatformPlayTypeItem(platformPlayTypeItem);
    }

    /**
     * 修改平台玩法小类
     *
     * @param platformPlayTypeItem 平台玩法小类
     * @return 结果
     */
    @Override
    public int updatePlatformPlayTypeItem(PlatformPlayTypeItem platformPlayTypeItem)
    {
        platformPlayTypeItem.setUpdateTime(DateUtils.getNowDate());
        return platformPlayTypeItemMapper.updatePlatformPlayTypeItem(platformPlayTypeItem);
    }

    /**
     * 批量删除平台玩法小类
     *
     * @param ids 需要删除的平台玩法小类主键
     * @return 结果
     */
    @Override
    public int deletePlatformPlayTypeItemByIds(Long[] ids)
    {
        return platformPlayTypeItemMapper.deletePlatformPlayTypeItemByIds(ids);
    }

    /**
     * 删除平台玩法小类信息
     *
     * @param id 平台玩法小类主键
     * @return 结果
     */
    @Override
    public int deletePlatformPlayTypeItemById(Long id)
    {
        return platformPlayTypeItemMapper.deletePlatformPlayTypeItemById(id);
    }


    @Override
    public void syncPlatformPlayTypeItem(Long platformId) {
        List<PlatformPlayTypeItem> platformPlayTypeItemList = platformPlayTypeItemMapper.selectPlatformPlayTypeItemList(new PlatformPlayTypeItem().setPlatformId(1L));
        platformPlayTypeItemList.forEach(platformPlayTypeItem -> {
            List<PlatformPlayTypeItem> selectPlatformPlayTypeItemList = platformPlayTypeItemMapper.selectPlatformPlayTypeItemList(new PlatformPlayTypeItem().setPlatformId(platformId)
                    .setLotteryId(platformPlayTypeItem.getLotteryId()).setCode(platformPlayTypeItem.getCode()));
            if (CollectionUtils.isEmpty(selectPlatformPlayTypeItemList)){
                platformPlayTypeItemMapper.insertPlatformPlayTypeItem(new PlatformPlayTypeItem().setPlatformId(platformId).setLotteryId(platformPlayTypeItem.getLotteryId())
                        .setCode(platformPlayTypeItem.getCode()).setStatus(platformPlayTypeItem.getStatus()));
            }
        });
    }


    @Override
    public void initPlatformPlayTypeItem(Long platformId) {
        List<PlatformPlayTypeItem> platformPlayTypeItemList = platformPlayTypeItemMapper.selectPlatformPlayTypeItemList(new PlatformPlayTypeItem().setPlatformId(1L));
        platformPlayTypeItemList.forEach(platformPlayTypeItem -> {
            List<PlatformPlayTypeItem> selectPlatformPlayTypeItemList = platformPlayTypeItemMapper.selectPlatformPlayTypeItemList(new PlatformPlayTypeItem().setPlatformId(platformId)
                    .setLotteryId(platformPlayTypeItem.getLotteryId()).setCode(platformPlayTypeItem.getCode()));
            if (CollectionUtils.isEmpty(selectPlatformPlayTypeItemList)){
                platformPlayTypeItemMapper.insertPlatformPlayTypeItem(new PlatformPlayTypeItem().setPlatformId(platformId).setLotteryId(platformPlayTypeItem.getLotteryId())
                        .setCode(platformPlayTypeItem.getCode()).setStatus(platformPlayTypeItem.getStatus()));
            } else {
                PlatformPlayTypeItem oldPlatformPlayTypeItem = selectPlatformPlayTypeItemList.get(0);
                platformPlayTypeItemMapper.updatePlatformPlayTypeItem(new PlatformPlayTypeItem().setId(oldPlatformPlayTypeItem.getId()).setPlatformId(platformId)
                        .setLotteryId(platformPlayTypeItem.getLotteryId()).setCode(platformPlayTypeItem.getCode()).setStatus(platformPlayTypeItem.getStatus()));
            }
        });
    }
}
