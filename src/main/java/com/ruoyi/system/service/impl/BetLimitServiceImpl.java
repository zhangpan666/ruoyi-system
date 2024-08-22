package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BetLimitMapper;
import com.ruoyi.system.domain.BetLimit;
import com.ruoyi.system.service.IBetLimitService;

/**
 * 投注限制Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
@Service
public class BetLimitServiceImpl implements IBetLimitService 
{
    @Autowired
    private BetLimitMapper betLimitMapper;

    /**
     * 查询投注限制
     * 
     * @param id 投注限制主键
     * @return 投注限制
     */
    @Override
    public BetLimit selectBetLimitById(Long id)
    {
        return betLimitMapper.selectBetLimitById(id);
    }

    /**
     * 查询投注限制列表
     * 
     * @param betLimit 投注限制
     * @return 投注限制
     */
    @Override
    public List<BetLimit> selectBetLimitList(BetLimit betLimit)
    {
        return betLimitMapper.selectBetLimitList(betLimit);
    }

    /**
     * 新增投注限制
     * 
     * @param betLimit 投注限制
     * @return 结果
     */
    @Override
    public int insertBetLimit(BetLimit betLimit)
    {
        betLimit.setCreateTime(DateUtils.getNowDate());
        return betLimitMapper.insertBetLimit(betLimit);
    }

    /**
     * 修改投注限制
     * 
     * @param betLimit 投注限制
     * @return 结果
     */
    @Override
    public int updateBetLimit(BetLimit betLimit)
    {
        betLimit.setUpdateTime(DateUtils.getNowDate());
        return betLimitMapper.updateBetLimit(betLimit);
    }

    /**
     * 批量删除投注限制
     * 
     * @param ids 需要删除的投注限制主键
     * @return 结果
     */
    @Override
    public int deleteBetLimitByIds(Long[] ids)
    {
        return betLimitMapper.deleteBetLimitByIds(ids);
    }

    /**
     * 删除投注限制信息
     * 
     * @param id 投注限制主键
     * @return 结果
     */
    @Override
    public int deleteBetLimitById(Long id)
    {
        return betLimitMapper.deleteBetLimitById(id);
    }
}
