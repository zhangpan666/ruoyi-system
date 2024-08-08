package com.ruoyi.system.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.Platform;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2024-08-08
 */
public interface PlatformMapper extends BaseMapper<Platform>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Platform selectPlatformById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param platform 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Platform> selectPlatformList(Platform platform);

    /**
     * 新增【请填写功能名称】
     *
     * @param platform 【请填写功能名称】
     * @return 结果
     */
    public int insertPlatform(Platform platform);

    /**
     * 修改【请填写功能名称】
     *
     * @param platform 【请填写功能名称】
     * @return 结果
     */
    public int updatePlatform(Platform platform);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePlatformById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePlatformByIds(Long[] ids);
}
