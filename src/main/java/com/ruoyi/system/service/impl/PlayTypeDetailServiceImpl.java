package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PlayTypeDetailMapper;
import com.ruoyi.system.domain.PlayTypeDetail;
import com.ruoyi.system.service.IPlayTypeDetailService;

/**
 * 玩法明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-14
 */
@Service
public class PlayTypeDetailServiceImpl implements IPlayTypeDetailService 
{
    @Autowired
    private PlayTypeDetailMapper playTypeDetailMapper;

    /**
     * 查询玩法明细
     * 
     * @param id 玩法明细主键
     * @return 玩法明细
     */
    @Override
    public PlayTypeDetail selectPlayTypeDetailById(Long id)
    {
        return playTypeDetailMapper.selectPlayTypeDetailById(id);
    }

    /**
     * 查询玩法明细列表
     * 
     * @param playTypeDetail 玩法明细
     * @return 玩法明细
     */
    @Override
    public List<PlayTypeDetail> selectPlayTypeDetailList(PlayTypeDetail playTypeDetail)
    {
        return playTypeDetailMapper.selectPlayTypeDetailList(playTypeDetail);
    }

    /**
     * 新增玩法明细
     * 
     * @param playTypeDetail 玩法明细
     * @return 结果
     */
    @Override
    public int insertPlayTypeDetail(PlayTypeDetail playTypeDetail)
    {
        playTypeDetail.setCreateTime(DateUtils.getNowDate());
        return playTypeDetailMapper.insertPlayTypeDetail(playTypeDetail);
    }

    /**
     * 修改玩法明细
     * 
     * @param playTypeDetail 玩法明细
     * @return 结果
     */
    @Override
    public int updatePlayTypeDetail(PlayTypeDetail playTypeDetail)
    {
        playTypeDetail.setUpdateTime(DateUtils.getNowDate());
        return playTypeDetailMapper.updatePlayTypeDetail(playTypeDetail);
    }

    /**
     * 批量删除玩法明细
     * 
     * @param ids 需要删除的玩法明细主键
     * @return 结果
     */
    @Override
    public int deletePlayTypeDetailByIds(Long[] ids)
    {
        return playTypeDetailMapper.deletePlayTypeDetailByIds(ids);
    }

    /**
     * 删除玩法明细信息
     * 
     * @param id 玩法明细主键
     * @return 结果
     */
    @Override
    public int deletePlayTypeDetailById(Long id)
    {
        return playTypeDetailMapper.deletePlayTypeDetailById(id);
    }
}
