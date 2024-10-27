package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BetLimitAmount;

/**
 * 投注限额Service接口
 *
 * @author ruoyi
 * @date 2024-08-22
 */
public interface IBetLimitAmountService
{
    /**
     * 查询投注限额
     *
     * @param id 投注限额主键
     * @return 投注限额
     */
    public BetLimitAmount selectBetLimitAmountById(Long id);


    /**
     * 查询投注限额列表
     *
     * @param betLimitAmount 投注限额
     * @return 投注限额集合
     */
    public List<BetLimitAmount> selectBetLimitAmountList(BetLimitAmount betLimitAmount);

    /**
     * 新增投注限额
     *
     * @param betLimitAmount 投注限额
     * @return 结果
     */
    public int insertBetLimitAmount(BetLimitAmount betLimitAmount);

    /**
     * 修改投注限额
     *
     * @param betLimitAmount 投注限额
     * @return 结果
     */
    public int updateBetLimitAmount(BetLimitAmount betLimitAmount);

    /**
     * 批量删除投注限额
     *
     * @param ids 需要删除的投注限额主键集合
     * @return 结果
     */
    public int deleteBetLimitAmountByIds(Long[] ids);

    /**
     * 删除投注限额信息
     *
     * @param id 投注限额主键
     * @return 结果
     */
    public int deleteBetLimitAmountById(Long id);

    void checkBetLimitAmountDataScope(Long id);


    void initBetLimitAmount(Long platformId, Long lotteryId);
}
