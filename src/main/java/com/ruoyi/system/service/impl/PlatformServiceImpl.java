package com.ruoyi.system.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlatformMapper;
import com.ruoyi.system.domain.Platform;
import com.ruoyi.system.service.IPlatformService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-08
 */
@Service
public class PlatformServiceImpl extends ServiceImpl<PlatformMapper, Platform> implements IPlatformService
{
    @Autowired
    private PlatformMapper platformMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Platform selectPlatformById(Long id)
    {
        return platformMapper.selectPlatformById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param platform 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Platform> selectPlatformList(Platform platform)
    {
        return platformMapper.selectPlatformList(platform);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param platform 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPlatform(Platform platform)
    {
        platform.setCreateTime(DateUtils.getNowDate());
        return platformMapper.insertPlatform(platform);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param platform 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePlatform(Platform platform)
    {
        platform.setUpdateTime(DateUtils.getNowDate());
        return platformMapper.updatePlatform(platform);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePlatformByIds(Long[] ids)
    {
        return platformMapper.deletePlatformByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePlatformById(Long id)
    {
        return platformMapper.deletePlatformById(id);
    }
}
