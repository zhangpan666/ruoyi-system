package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OddsMapper;
import com.ruoyi.system.domain.Odds;
import com.ruoyi.system.service.IOddsService;

/**
 * 赔率设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class OddsServiceImpl implements IOddsService 
{
    @Autowired
    private OddsMapper oddsMapper;

    /**
     * 查询赔率设置
     * 
     * @param id 赔率设置主键
     * @return 赔率设置
     */
    @Override
    public Odds selectOddsById(Long id)
    {
        return oddsMapper.selectOddsById(id);
    }

    /**
     * 查询赔率设置列表
     * 
     * @param odds 赔率设置
     * @return 赔率设置
     */
    @Override
    public List<Odds> selectOddsList(Odds odds)
    {
        return oddsMapper.selectOddsList(odds);
    }

    /**
     * 新增赔率设置
     * 
     * @param odds 赔率设置
     * @return 结果
     */
    @Override
    public int insertOdds(Odds odds)
    {
        odds.setCreateTime(DateUtils.getNowDate());
        return oddsMapper.insertOdds(odds);
    }

    /**
     * 修改赔率设置
     * 
     * @param odds 赔率设置
     * @return 结果
     */
    @Override
    public int updateOdds(Odds odds)
    {
        odds.setUpdateTime(DateUtils.getNowDate());
        return oddsMapper.updateOdds(odds);
    }

    /**
     * 批量删除赔率设置
     * 
     * @param ids 需要删除的赔率设置主键
     * @return 结果
     */
    @Override
    public int deleteOddsByIds(Long[] ids)
    {
        return oddsMapper.deleteOddsByIds(ids);
    }

    /**
     * 删除赔率设置信息
     * 
     * @param id 赔率设置主键
     * @return 结果
     */
    @Override
    public int deleteOddsById(Long id)
    {
        return oddsMapper.deleteOddsById(id);
    }
}
