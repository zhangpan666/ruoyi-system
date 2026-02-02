package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.pojo.LotteryPrizeStatDTO;
import com.ruoyi.system.pojo.LotteryPrizeStatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryPrizeRecordMapper;
import com.ruoyi.system.domain.LotteryPrizeRecord;
import com.ruoyi.system.service.ILotteryPrizeRecordService;

/**
 * 爆奖记录Service业务层处理
 *
 * @author ruoyi
 * @date 2025-11-28
 */
@Service
public class LotteryPrizeRecordServiceImpl implements ILotteryPrizeRecordService
{
    @Autowired
    private LotteryPrizeRecordMapper lotteryPrizeRecordMapper;

    /**
     * 查询爆奖记录
     *
     * @param id 爆奖记录主键
     * @return 爆奖记录
     */
    @Override
    public LotteryPrizeRecord selectLotteryPrizeRecordById(Long id)
    {
        return lotteryPrizeRecordMapper.selectLotteryPrizeRecordById(id);
    }

    /**
     * 查询爆奖记录列表
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 爆奖记录
     */
    @Override
    public List<LotteryPrizeRecord> selectLotteryPrizeRecordList(LotteryPrizeRecord lotteryPrizeRecord)
    {
        return lotteryPrizeRecordMapper.selectLotteryPrizeRecordList(lotteryPrizeRecord);
    }

    /**
     * 新增爆奖记录
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 结果
     */
    @Override
    public int insertLotteryPrizeRecord(LotteryPrizeRecord lotteryPrizeRecord)
    {
        lotteryPrizeRecord.setCreateTime(DateUtils.getNowDate());
        return lotteryPrizeRecordMapper.insertLotteryPrizeRecord(lotteryPrizeRecord);
    }

    /**
     * 修改爆奖记录
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 结果
     */
    @Override
    public int updateLotteryPrizeRecord(LotteryPrizeRecord lotteryPrizeRecord)
    {
        lotteryPrizeRecord.setUpdateTime(DateUtils.getNowDate());
        return lotteryPrizeRecordMapper.updateLotteryPrizeRecord(lotteryPrizeRecord);
    }

    /**
     * 批量删除爆奖记录
     *
     * @param ids 需要删除的爆奖记录主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeRecordByIds(Long[] ids)
    {
        return lotteryPrizeRecordMapper.deleteLotteryPrizeRecordByIds(ids);
    }

    /**
     * 删除爆奖记录信息
     *
     * @param id 爆奖记录主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeRecordById(Long id)
    {
        return lotteryPrizeRecordMapper.deleteLotteryPrizeRecordById(id);
    }


    @Override
    public List<LotteryPrizeStatVO> stat(LotteryPrizeRecord lotteryPrizeRecord) {
        return lotteryPrizeRecordMapper.stat(lotteryPrizeRecord);
    }


    @Override
    public List<LotteryPrizeStatDTO> statAndGroupByLotteryId(LotteryPrizeRecord lotteryPrizeRecord) {
        return lotteryPrizeRecordMapper.statAndGroupByLotteryId(lotteryPrizeRecord);
    }
}
