package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LotteryRelation;
import com.ruoyi.system.domain.vo.RealTimeOrderVO;

/**
 * 码表Service接口
 * 
 * @author ruoyi
 * @date 2024-08-14
 */
public interface ILotteryRelationService 
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
     * 批量删除码表
     * 
     * @param ids 需要删除的码表主键集合
     * @return 结果
     */
    public int deleteLotteryRelationByIds(Long[] ids);

    /**
     * 删除码表信息
     * 
     * @param id 码表主键
     * @return 结果
     */
    public int deleteLotteryRelationById(Long id);

    List<RealTimeOrderVO> selectSxList(Integer year);
}
