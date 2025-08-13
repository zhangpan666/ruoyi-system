package com.ruoyi.system.service.impl;

import java.util.Collections;
import java.util.List;

import com.ruoyi.system.domain.vo.RealTimeOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryRelationMapper;
import com.ruoyi.system.domain.LotteryRelation;
import com.ruoyi.system.service.ILotteryRelationService;

/**
 * 码表Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-14
 */
@Service
public class LotteryRelationServiceImpl implements ILotteryRelationService 
{
    @Autowired
    private LotteryRelationMapper lotteryRelationMapper;

    /**
     * 查询码表
     * 
     * @param id 码表主键
     * @return 码表
     */
    @Override
    public LotteryRelation selectLotteryRelationById(Long id)
    {
        return lotteryRelationMapper.selectLotteryRelationById(id);
    }

    /**
     * 查询码表列表
     * 
     * @param lotteryRelation 码表
     * @return 码表
     */
    @Override
    public List<LotteryRelation> selectLotteryRelationList(LotteryRelation lotteryRelation)
    {
        return lotteryRelationMapper.selectLotteryRelationList(lotteryRelation);
    }

    /**
     * 新增码表
     * 
     * @param lotteryRelation 码表
     * @return 结果
     */
    @Override
    public int insertLotteryRelation(LotteryRelation lotteryRelation)
    {
        return lotteryRelationMapper.insertLotteryRelation(lotteryRelation);
    }

    /**
     * 修改码表
     * 
     * @param lotteryRelation 码表
     * @return 结果
     */
    @Override
    public int updateLotteryRelation(LotteryRelation lotteryRelation)
    {
        return lotteryRelationMapper.updateLotteryRelation(lotteryRelation);
    }

    /**
     * 批量删除码表
     * 
     * @param ids 需要删除的码表主键
     * @return 结果
     */
    @Override
    public int deleteLotteryRelationByIds(Long[] ids)
    {
        return lotteryRelationMapper.deleteLotteryRelationByIds(ids);
    }

    /**
     * 删除码表信息
     * 
     * @param id 码表主键
     * @return 结果
     */
    @Override
    public int deleteLotteryRelationById(Long id)
    {
        return lotteryRelationMapper.deleteLotteryRelationById(id);
    }

    @Override
    public List<RealTimeOrderVO> selectSxList(Integer year) {
        return lotteryRelationMapper.selectSxList(year);
    }
}
