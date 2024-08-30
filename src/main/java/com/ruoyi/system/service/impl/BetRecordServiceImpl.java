package com.ruoyi.system.service.impl;

import java.util.Date;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.pojo.BetRecordStatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BetRecordMapper;
import com.ruoyi.system.domain.BetRecord;
import com.ruoyi.system.service.IBetRecordService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 投注记录Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-11
 */
@Service
@Transactional
public class BetRecordServiceImpl implements IBetRecordService
{
    @Autowired
    private BetRecordMapper betRecordMapper;

    /**
     * 查询投注记录
     *
     * @param id 投注记录主键
     * @return 投注记录
     */
    @Override
    public BetRecord selectBetRecordById(Long id)
    {
        return betRecordMapper.selectBetRecordById(id);
    }

    /**
     * 查询投注记录列表
     *
     * @param betRecord 投注记录
     * @return 投注记录
     */
    @Override
    public List<BetRecord> selectBetRecordList(BetRecord betRecord)
    {
        return betRecordMapper.selectBetRecordList(betRecord);
    }

    /**
     * 新增投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    @Override
    public int insertBetRecord(BetRecord betRecord)
    {
        betRecord.setCreateTime(DateUtils.getNowDate());
        return betRecordMapper.insertBetRecord(betRecord);
    }

    /**
     * 修改投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    @Override
    public int updateBetRecord(BetRecord betRecord)
    {
        betRecord.setUpdateTime(DateUtils.getNowDate());
        return betRecordMapper.updateBetRecord(betRecord);
    }

    /**
     * 批量删除投注记录
     *
     * @param ids 需要删除的投注记录主键
     * @return 结果
     */
    @Override
    public int deleteBetRecordByIds(Long[] ids)
    {
        return betRecordMapper.deleteBetRecordByIds(ids);
    }

    /**
     * 删除投注记录信息
     *
     * @param id 投注记录主键
     * @return 结果
     */
    @Override
    public int deleteBetRecordById(Long id)
    {
        return betRecordMapper.deleteBetRecordById(id);
    }

    @Override
    public BetRecordStatVO statCountBetRecordByDateAndLotteryId(Long platformId,Long lotteryId, Date beginTime, Date endTime) {
        return betRecordMapper.statCountBetRecordByDateAndLotteryId(platformId,lotteryId, beginTime, endTime);
    }

    @Override
    public List<BetRecordStatVO> statCountBetRecordByDateAndLotteryIdAndGroupByUserId(Long platformId,Long lotteryId, Date beginTime, Date endTime) {
        return betRecordMapper.statCountBetRecordByDateAndLotteryIdAndGroupByUserId(platformId,lotteryId, beginTime, endTime);
    }

    @Override
    public List<BetRecordStatVO> statCountBetRecordByDateAndGroupByLotteryId(Long platformId,Long lotteryId, Date beginTime, Date endTime) {
        return betRecordMapper.statCountBetRecordByDateAndGroupByLotteryId(platformId,lotteryId, beginTime, endTime);
    }
}
