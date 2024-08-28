package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CancelOrderLimit;

/**
 * 撤单限制Service接口
 * 
 * @author ruoyi
 * @date 2024-08-28
 */
public interface ICancelOrderLimitService 
{
    /**
     * 查询撤单限制
     * 
     * @param id 撤单限制主键
     * @return 撤单限制
     */
    public CancelOrderLimit selectCancelOrderLimitById(Long id);

    /**
     * 查询撤单限制列表
     * 
     * @param cancelOrderLimit 撤单限制
     * @return 撤单限制集合
     */
    public List<CancelOrderLimit> selectCancelOrderLimitList(CancelOrderLimit cancelOrderLimit);

    /**
     * 新增撤单限制
     * 
     * @param cancelOrderLimit 撤单限制
     * @return 结果
     */
    public int insertCancelOrderLimit(CancelOrderLimit cancelOrderLimit);

    /**
     * 修改撤单限制
     * 
     * @param cancelOrderLimit 撤单限制
     * @return 结果
     */
    public int updateCancelOrderLimit(CancelOrderLimit cancelOrderLimit);

    /**
     * 批量删除撤单限制
     * 
     * @param ids 需要删除的撤单限制主键集合
     * @return 结果
     */
    public int deleteCancelOrderLimitByIds(Long[] ids);

    /**
     * 删除撤单限制信息
     * 
     * @param id 撤单限制主键
     * @return 结果
     */
    public int deleteCancelOrderLimitById(Long id);
}
