package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlayTypeMapper;
import com.ruoyi.system.domain.PlayType;
import com.ruoyi.system.service.IPlayTypeService;

/**
 * 玩法管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-19
 */
@Service
public class PlayTypeServiceImpl implements IPlayTypeService 
{
    @Autowired
    private PlayTypeMapper playTypeMapper;

    /**
     * 查询玩法管理
     * 
     * @param id 玩法管理主键
     * @return 玩法管理
     */
    @Override
    public PlayType selectPlayTypeById(Long id)
    {
        return playTypeMapper.selectPlayTypeById(id);
    }

    /**
     * 查询玩法管理列表
     * 
     * @param playType 玩法管理
     * @return 玩法管理
     */
    @Override
    public List<PlayType> selectPlayTypeList(PlayType playType)
    {
        return playTypeMapper.selectPlayTypeList(playType);
    }

    /**
     * 新增玩法管理
     * 
     * @param playType 玩法管理
     * @return 结果
     */
    @Override
    public int insertPlayType(PlayType playType)
    {
        playType.setCreateTime(DateUtils.getNowDate());
        return playTypeMapper.insertPlayType(playType);
    }

    /**
     * 修改玩法管理
     * 
     * @param playType 玩法管理
     * @return 结果
     */
    @Override
    public int updatePlayType(PlayType playType)
    {
        playType.setUpdateTime(DateUtils.getNowDate());
        return playTypeMapper.updatePlayType(playType);
    }

    /**
     * 批量删除玩法管理
     * 
     * @param ids 需要删除的玩法管理主键
     * @return 结果
     */
    @Override
    public int deletePlayTypeByIds(Long[] ids)
    {
        return playTypeMapper.deletePlayTypeByIds(ids);
    }

    /**
     * 删除玩法管理信息
     * 
     * @param id 玩法管理主键
     * @return 结果
     */
    @Override
    public int deletePlayTypeById(Long id)
    {
        return playTypeMapper.deletePlayTypeById(id);
    }
}
