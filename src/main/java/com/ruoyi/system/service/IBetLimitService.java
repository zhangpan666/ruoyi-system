package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BetLimit;

/**
 * 投注限额Service接口
 * 
 * @author ruoyi
 * @date 2024-08-18
 */
public interface IBetLimitService 
{
    /**
     * 查询投注限额
     * 
     * @param id 投注限额主键
     * @return 投注限额
     */
    public BetLimit selectBetLimitById(Long id);

    /**
     * 查询投注限额列表
     * 
     * @param betLimit 投注限额
     * @return 投注限额集合
     */
    public List<BetLimit> selectBetLimitList(BetLimit betLimit);

    /**
     * 新增投注限额
     * 
     * @param betLimit 投注限额
     * @return 结果
     */
    public int insertBetLimit(BetLimit betLimit);

    /**
     * 修改投注限额
     * 
     * @param betLimit 投注限额
     * @return 结果
     */
    public int updateBetLimit(BetLimit betLimit);

    /**
     * 批量删除投注限额
     * 
     * @param ids 需要删除的投注限额主键集合
     * @return 结果
     */
    public int deleteBetLimitByIds(Long[] ids);

    /**
     * 删除投注限额信息
     * 
     * @param id 投注限额主键
     * @return 结果
     */
    public int deleteBetLimitById(Long id);
}
