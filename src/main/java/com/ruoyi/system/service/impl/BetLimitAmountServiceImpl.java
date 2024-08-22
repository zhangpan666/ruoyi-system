package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BetLimitAmountMapper;
import com.ruoyi.system.domain.BetLimitAmount;
import com.ruoyi.system.service.IBetLimitAmountService;

/**
 * 投注限额Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
@Service
public class BetLimitAmountServiceImpl implements IBetLimitAmountService 
{
    @Autowired
    private BetLimitAmountMapper betLimitAmountMapper;

    /**
     * 查询投注限额
     * 
     * @param id 投注限额主键
     * @return 投注限额
     */
    @Override
    public BetLimitAmount selectBetLimitAmountById(Long id)
    {
        return betLimitAmountMapper.selectBetLimitAmountById(id);
    }

    /**
     * 查询投注限额列表
     * 
     * @param betLimitAmount 投注限额
     * @return 投注限额
     */
    @Override
    public List<BetLimitAmount> selectBetLimitAmountList(BetLimitAmount betLimitAmount)
    {
        return betLimitAmountMapper.selectBetLimitAmountList(betLimitAmount);
    }

    /**
     * 新增投注限额
     * 
     * @param betLimitAmount 投注限额
     * @return 结果
     */
    @Override
    public int insertBetLimitAmount(BetLimitAmount betLimitAmount)
    {
        betLimitAmount.setCreateTime(DateUtils.getNowDate());
        return betLimitAmountMapper.insertBetLimitAmount(betLimitAmount);
    }

    /**
     * 修改投注限额
     * 
     * @param betLimitAmount 投注限额
     * @return 结果
     */
    @Override
    public int updateBetLimitAmount(BetLimitAmount betLimitAmount)
    {
        betLimitAmount.setUpdateTime(DateUtils.getNowDate());
        return betLimitAmountMapper.updateBetLimitAmount(betLimitAmount);
    }

    /**
     * 批量删除投注限额
     * 
     * @param ids 需要删除的投注限额主键
     * @return 结果
     */
    @Override
    public int deleteBetLimitAmountByIds(Long[] ids)
    {
        return betLimitAmountMapper.deleteBetLimitAmountByIds(ids);
    }

    /**
     * 删除投注限额信息
     * 
     * @param id 投注限额主键
     * @return 结果
     */
    @Override
    public int deleteBetLimitAmountById(Long id)
    {
        return betLimitAmountMapper.deleteBetLimitAmountById(id);
    }
}
