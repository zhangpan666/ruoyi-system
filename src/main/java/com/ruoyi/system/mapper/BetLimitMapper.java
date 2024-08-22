package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BetLimit;

/**
 * 投注限制Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
public interface BetLimitMapper 
{
    /**
     * 查询投注限制
     * 
     * @param id 投注限制主键
     * @return 投注限制
     */
    public BetLimit selectBetLimitById(Long id);

    /**
     * 查询投注限制列表
     * 
     * @param betLimit 投注限制
     * @return 投注限制集合
     */
    public List<BetLimit> selectBetLimitList(BetLimit betLimit);

    /**
     * 新增投注限制
     * 
     * @param betLimit 投注限制
     * @return 结果
     */
    public int insertBetLimit(BetLimit betLimit);

    /**
     * 修改投注限制
     * 
     * @param betLimit 投注限制
     * @return 结果
     */
    public int updateBetLimit(BetLimit betLimit);

    /**
     * 删除投注限制
     * 
     * @param id 投注限制主键
     * @return 结果
     */
    public int deleteBetLimitById(Long id);

    /**
     * 批量删除投注限制
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBetLimitByIds(Long[] ids);
}
