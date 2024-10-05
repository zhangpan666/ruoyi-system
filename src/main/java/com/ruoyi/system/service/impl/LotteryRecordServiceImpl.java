package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryRecordMapper;
import com.ruoyi.system.domain.LotteryRecord;
import com.ruoyi.system.service.ILotteryRecordService;

/**
 * 开奖记录Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-09
 */
@Service
public class LotteryRecordServiceImpl implements ILotteryRecordService
{
    @Autowired
    private LotteryRecordMapper lotteryRecordMapper;

    /**
     * 查询开奖记录
     *
     * @param id 开奖记录主键
     * @return 开奖记录
     */
    @Override
    public LotteryRecord selectLotteryRecordById(Long id)
    {
        return lotteryRecordMapper.selectLotteryRecordById(id);
    }

    /**
     * 查询开奖记录列表
     *
     * @param lotteryRecord 开奖记录
     * @return 开奖记录
     */
    @Override
    public List<LotteryRecord> selectLotteryRecordList(LotteryRecord lotteryRecord)
    {
        return lotteryRecordMapper.selectLotteryRecordList(lotteryRecord);
    }

    /**
     * 新增开奖记录
     *
     * @param lotteryRecord 开奖记录
     * @return 结果
     */
    @Override
    public int insertLotteryRecord(LotteryRecord lotteryRecord)
    {
        lotteryRecord.setCreateTime(DateUtils.getNowDate());
        return lotteryRecordMapper.insertLotteryRecord(lotteryRecord);
    }

    /**
     * 修改开奖记录
     *
     * @param lotteryRecord 开奖记录
     * @return 结果
     */
    @Override
    public int updateLotteryRecord(LotteryRecord lotteryRecord)
    {
        lotteryRecord.setUpdateTime(DateUtils.getNowDate());
        return lotteryRecordMapper.updateLotteryRecord(lotteryRecord);
    }

    /**
     * 批量删除开奖记录
     *
     * @param ids 需要删除的开奖记录主键
     * @return 结果
     */
    @Override
    public int deleteLotteryRecordByIds(Long[] ids)
    {
        return lotteryRecordMapper.deleteLotteryRecordByIds(ids);
    }

    /**
     * 删除开奖记录信息
     *
     * @param id 开奖记录主键
     * @return 结果
     */
    @Override
    public int deleteLotteryRecordById(Long id)
    {
        return lotteryRecordMapper.deleteLotteryRecordById(id);
    }


    @Override
    public List<LotteryRecord> selectLotteryRecordByIds(List<Long> idList) {
        if (CollectionUtils.isEmpty(idList)){
            return new ArrayList<>();
        }
        return lotteryRecordMapper.selectLotteryRecordByIds(idList);
    }
}
