package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CancelOrderLimitMapper;
import com.ruoyi.system.domain.CancelOrderLimit;
import com.ruoyi.system.service.ICancelOrderLimitService;

/**
 * 撤单限制Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-28
 */
@Service
public class CancelOrderLimitServiceImpl implements ICancelOrderLimitService
{
    @Autowired
    private CancelOrderLimitMapper cancelOrderLimitMapper;

    /**
     * 查询撤单限制
     *
     * @param id 撤单限制主键
     * @return 撤单限制
     */
    @Override
    public CancelOrderLimit selectCancelOrderLimitById(Long id)
    {
        return cancelOrderLimitMapper.selectCancelOrderLimitById(id);
    }

    /**
     * 查询撤单限制列表
     *
     * @param cancelOrderLimit 撤单限制
     * @return 撤单限制
     */
    @Override
    public List<CancelOrderLimit> selectCancelOrderLimitList(CancelOrderLimit cancelOrderLimit)
    {
        return cancelOrderLimitMapper.selectCancelOrderLimitList(cancelOrderLimit);
    }

    /**
     * 新增撤单限制
     *
     * @param cancelOrderLimit 撤单限制
     * @return 结果
     */
    @Override
    public int insertCancelOrderLimit(CancelOrderLimit cancelOrderLimit)
    {
        cancelOrderLimit.setCreateTime(DateUtils.getNowDate());
        return cancelOrderLimitMapper.insertCancelOrderLimit(cancelOrderLimit);
    }

    /**
     * 修改撤单限制
     *
     * @param cancelOrderLimit 撤单限制
     * @return 结果
     */
    @Override
    public int updateCancelOrderLimit(CancelOrderLimit cancelOrderLimit)
    {
        cancelOrderLimit.setUpdateTime(DateUtils.getNowDate());
        return cancelOrderLimitMapper.updateCancelOrderLimit(cancelOrderLimit);
    }

    /**
     * 批量删除撤单限制
     *
     * @param ids 需要删除的撤单限制主键
     * @return 结果
     */
    @Override
    public int deleteCancelOrderLimitByIds(Long[] ids)
    {
        return cancelOrderLimitMapper.deleteCancelOrderLimitByIds(ids);
    }

    /**
     * 删除撤单限制信息
     *
     * @param id 撤单限制主键
     * @return 结果
     */
    @Override
    public int deleteCancelOrderLimitById(Long id)
    {
        return cancelOrderLimitMapper.deleteCancelOrderLimitById(id);
    }


    @Override
    public void initCancelOrderLimit(Long platformId, Long lotteryId) {
        List<CancelOrderLimit> cancelOrderLimitList = cancelOrderLimitMapper.selectCancelOrderLimitList(new CancelOrderLimit().setPlatformId(1L).setLotteryId(lotteryId));
        cancelOrderLimitList.forEach(cancelOrderLimit -> {
            List<CancelOrderLimit> oldCancelOrderLimitList = cancelOrderLimitMapper.selectCancelOrderLimitList(new CancelOrderLimit().setPlatformId(platformId).setLotteryId(cancelOrderLimit.getLotteryId()));
            CancelOrderLimit newCancelOrderLimit = new CancelOrderLimit().setPlatformId(platformId).setLotteryId(cancelOrderLimit.getLotteryId()).setType(cancelOrderLimit.getType())
                    .setTimeout(cancelOrderLimit.getTimeout()).setSinglePeriodAllowMaxCancelCount(cancelOrderLimit.getSinglePeriodAllowMaxCancelCount());
            if (CollectionUtils.isEmpty(oldCancelOrderLimitList)) {
                cancelOrderLimitMapper.insertCancelOrderLimit(newCancelOrderLimit);
            } else {
                CancelOrderLimit oldCancelOrderLimit = oldCancelOrderLimitList.get(0);
                newCancelOrderLimit.setId(oldCancelOrderLimit.getId());
                cancelOrderLimitMapper.updateCancelOrderLimit(newCancelOrderLimit);
            }
        });
    }

    @Override
    public void initCancelOrderLimit(Long platformId) {
       this.initCancelOrderLimit(platformId, null);
    }

}
