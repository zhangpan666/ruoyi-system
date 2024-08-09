package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LotteryRecord;

/**
 * 开奖记录Service接口
 * 
 * @author ruoyi
 * @date 2024-08-09
 */
public interface ILotteryRecordService 
{
    /**
     * 查询开奖记录
     * 
     * @param id 开奖记录主键
     * @return 开奖记录
     */
    public LotteryRecord selectLotteryRecordById(Long id);

    /**
     * 查询开奖记录列表
     * 
     * @param lotteryRecord 开奖记录
     * @return 开奖记录集合
     */
    public List<LotteryRecord> selectLotteryRecordList(LotteryRecord lotteryRecord);

    /**
     * 新增开奖记录
     * 
     * @param lotteryRecord 开奖记录
     * @return 结果
     */
    public int insertLotteryRecord(LotteryRecord lotteryRecord);

    /**
     * 修改开奖记录
     * 
     * @param lotteryRecord 开奖记录
     * @return 结果
     */
    public int updateLotteryRecord(LotteryRecord lotteryRecord);

    /**
     * 批量删除开奖记录
     * 
     * @param ids 需要删除的开奖记录主键集合
     * @return 结果
     */
    public int deleteLotteryRecordByIds(Long[] ids);

    /**
     * 删除开奖记录信息
     * 
     * @param id 开奖记录主键
     * @return 结果
     */
    public int deleteLotteryRecordById(Long id);
}
