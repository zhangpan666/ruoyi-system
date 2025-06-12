package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlatformPlayTypeMapper;
import com.ruoyi.system.domain.PlatformPlayType;
import com.ruoyi.system.service.IPlatformPlayTypeService;
import org.springframework.util.CollectionUtils;

/**
 * 平台玩法大类Service业务层处理
 *
 * @author ruoyi
 * @date 2025-06-11
 */
@Service
public class PlatformPlayTypeServiceImpl implements IPlatformPlayTypeService
{
    @Autowired
    private PlatformPlayTypeMapper platformPlayTypeMapper;

    /**
     * 查询平台玩法大类
     *
     * @param id 平台玩法大类主键
     * @return 平台玩法大类
     */
    @Override
    public PlatformPlayType selectPlatformPlayTypeById(Long id)
    {
        return platformPlayTypeMapper.selectPlatformPlayTypeById(id);
    }

    /**
     * 查询平台玩法大类列表
     *
     * @param platformPlayType 平台玩法大类
     * @return 平台玩法大类
     */
    @Override
    public List<PlatformPlayType> selectPlatformPlayTypeList(PlatformPlayType platformPlayType)
    {
        return platformPlayTypeMapper.selectPlatformPlayTypeList(platformPlayType);
    }

    /**
     * 新增平台玩法大类
     *
     * @param platformPlayType 平台玩法大类
     * @return 结果
     */
    @Override
    public int insertPlatformPlayType(PlatformPlayType platformPlayType)
    {
        platformPlayType.setCreateTime(DateUtils.getNowDate());
        return platformPlayTypeMapper.insertPlatformPlayType(platformPlayType);
    }

    /**
     * 修改平台玩法大类
     *
     * @param platformPlayType 平台玩法大类
     * @return 结果
     */
    @Override
    public int updatePlatformPlayType(PlatformPlayType platformPlayType)
    {
        platformPlayType.setUpdateTime(DateUtils.getNowDate());
        return platformPlayTypeMapper.updatePlatformPlayType(platformPlayType);
    }

    /**
     * 批量删除平台玩法大类
     *
     * @param ids 需要删除的平台玩法大类主键
     * @return 结果
     */
    @Override
    public int deletePlatformPlayTypeByIds(Long[] ids)
    {
        return platformPlayTypeMapper.deletePlatformPlayTypeByIds(ids);
    }

    /**
     * 删除平台玩法大类信息
     *
     * @param id 平台玩法大类主键
     * @return 结果
     */
    @Override
    public int deletePlatformPlayTypeById(Long id)
    {
        return platformPlayTypeMapper.deletePlatformPlayTypeById(id);
    }

    @Override
    public void syncPlatformPlayType(Long platformId) {
        List<PlatformPlayType> platformPlayTypeList = platformPlayTypeMapper.selectPlatformPlayTypeList(new PlatformPlayType().setPlatformId(1L));
        platformPlayTypeList.forEach(platformPlayType -> {
            List<PlatformPlayType> selectPlatformPlayTypeList = platformPlayTypeMapper.selectPlatformPlayTypeList(new PlatformPlayType().setPlatformId(platformId)
                    .setLotteryId(platformPlayType.getLotteryId()).setCode(platformPlayType.getCode()));
            if (CollectionUtils.isEmpty(selectPlatformPlayTypeList)){
                PlatformPlayType newPlatformPlayType = new PlatformPlayType().setPlatformId(platformId).setLotteryId(platformPlayType.getLotteryId()).setCode(platformPlayType.getCode())
                        .setStatus(platformPlayType.getStatus());
                platformPlayTypeMapper.insertPlatformPlayType(newPlatformPlayType);
            }
        });
    }

    @Override
    public void initPlatformPlayType(Long platformId) {
        List<PlatformPlayType> platformPlayTypeList = platformPlayTypeMapper.selectPlatformPlayTypeList(new PlatformPlayType().setPlatformId(1L));
        platformPlayTypeList.forEach(platformPlayType -> {
            List<PlatformPlayType> selectPlatformPlayTypeList = platformPlayTypeMapper.selectPlatformPlayTypeList(new PlatformPlayType().setPlatformId(platformId)
                    .setLotteryId(platformPlayType.getLotteryId()).setCode(platformPlayType.getCode()));
            PlatformPlayType newPlatformPlayType = new PlatformPlayType().setPlatformId(platformId).setLotteryId(platformPlayType.getLotteryId()).setCode(platformPlayType.getCode())
                    .setStatus(platformPlayType.getStatus());
            if (CollectionUtils.isEmpty(selectPlatformPlayTypeList)){
                platformPlayTypeMapper.insertPlatformPlayType(newPlatformPlayType);
            } else {
                PlatformPlayType oldPlatformPlayType = selectPlatformPlayTypeList.get(0);
                newPlatformPlayType.setId(oldPlatformPlayType.getId());
                platformPlayTypeMapper.updatePlatformPlayType(newPlatformPlayType);
            }
        });
    }
}
