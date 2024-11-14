package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PlayTypeDetail;

/**
 * 玩法明细Service接口
 * 
 * @author ruoyi
 * @date 2024-11-14
 */
public interface IPlayTypeDetailService 
{
    /**
     * 查询玩法明细
     * 
     * @param id 玩法明细主键
     * @return 玩法明细
     */
    public PlayTypeDetail selectPlayTypeDetailById(Long id);

    /**
     * 查询玩法明细列表
     * 
     * @param playTypeDetail 玩法明细
     * @return 玩法明细集合
     */
    public List<PlayTypeDetail> selectPlayTypeDetailList(PlayTypeDetail playTypeDetail);

    /**
     * 新增玩法明细
     * 
     * @param playTypeDetail 玩法明细
     * @return 结果
     */
    public int insertPlayTypeDetail(PlayTypeDetail playTypeDetail);

    /**
     * 修改玩法明细
     * 
     * @param playTypeDetail 玩法明细
     * @return 结果
     */
    public int updatePlayTypeDetail(PlayTypeDetail playTypeDetail);

    /**
     * 批量删除玩法明细
     * 
     * @param ids 需要删除的玩法明细主键集合
     * @return 结果
     */
    public int deletePlayTypeDetailByIds(Long[] ids);

    /**
     * 删除玩法明细信息
     * 
     * @param id 玩法明细主键
     * @return 结果
     */
    public int deletePlayTypeDetailById(Long id);
}
