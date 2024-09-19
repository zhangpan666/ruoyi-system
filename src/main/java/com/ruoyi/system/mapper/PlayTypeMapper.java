package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PlayType;

/**
 * 玩法管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-19
 */
public interface PlayTypeMapper 
{
    /**
     * 查询玩法管理
     * 
     * @param id 玩法管理主键
     * @return 玩法管理
     */
    public PlayType selectPlayTypeById(Long id);

    /**
     * 查询玩法管理列表
     * 
     * @param playType 玩法管理
     * @return 玩法管理集合
     */
    public List<PlayType> selectPlayTypeList(PlayType playType);

    /**
     * 新增玩法管理
     * 
     * @param playType 玩法管理
     * @return 结果
     */
    public int insertPlayType(PlayType playType);

    /**
     * 修改玩法管理
     * 
     * @param playType 玩法管理
     * @return 结果
     */
    public int updatePlayType(PlayType playType);

    /**
     * 删除玩法管理
     * 
     * @param id 玩法管理主键
     * @return 结果
     */
    public int deletePlayTypeById(Long id);

    /**
     * 批量删除玩法管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePlayTypeByIds(Long[] ids);
}
