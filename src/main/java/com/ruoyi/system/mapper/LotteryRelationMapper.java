package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LotteryRelation;

/**
 * 码表Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-14
 */
public interface LotteryRelationMapper 
{
    /**
     * 查询码表
     * 
     * @param id 码表主键
     * @return 码表
     */
    public LotteryRelation selectLotteryRelationById(Long id);

    /**
     * 查询码表列表
     * 
     * @param lotteryRelation 码表
     * @return 码表集合
     */
    public List<LotteryRelation> selectLotteryRelationList(LotteryRelation lotteryRelation);

    /**
     * 新增码表
     * 
     * @param lotteryRelation 码表
     * @return 结果
     */
    public int insertLotteryRelation(LotteryRelation lotteryRelation);

    /**
     * 修改码表
     * 
     * @param lotteryRelation 码表
     * @return 结果
     */
    public int updateLotteryRelation(LotteryRelation lotteryRelation);

    /**
     * 删除码表
     * 
     * @param id 码表主键
     * @return 结果
     */
    public int deleteLotteryRelationById(Long id);

    /**
     * 批量删除码表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLotteryRelationByIds(Long[] ids);
}
