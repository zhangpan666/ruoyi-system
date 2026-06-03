package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.pojo.LotteryPrizeStatDTO;
import com.ruoyi.system.pojo.LotteryPrizeStatVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryPrizeRecordDetailMapper;
import com.ruoyi.system.domain.LotteryPrizeRecordDetail;
import com.ruoyi.system.service.ILotteryPrizeRecordDetailService;

/**
 * 爆奖记录详情Service业务层处理
 *
 * @author ruoyi
 * @date 2026-05-28
 */
@Service
public class LotteryPrizeRecordDetailServiceImpl implements ILotteryPrizeRecordDetailService
{
    @Autowired
    private LotteryPrizeRecordDetailMapper lotteryPrizeRecordDetailMapper;

    /**
     * 查询爆奖记录详情
     *
     * @param id 爆奖记录详情主键
     * @return 爆奖记录详情
     */
    @Override
    public LotteryPrizeRecordDetail selectLotteryPrizeRecordDetailById(Long id)
    {
        return lotteryPrizeRecordDetailMapper.selectLotteryPrizeRecordDetailById(id);
    }

    /**
     * 查询爆奖记录详情列表
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 爆奖记录详情
     */
    @Override
    public List<LotteryPrizeRecordDetail> selectLotteryPrizeRecordDetailList(LotteryPrizeRecordDetail lotteryPrizeRecordDetail)
    {
        return lotteryPrizeRecordDetailMapper.selectLotteryPrizeRecordDetailList(lotteryPrizeRecordDetail);
    }

    /**
     * 新增爆奖记录详情
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 结果
     */
    @Override
    public int insertLotteryPrizeRecordDetail(LotteryPrizeRecordDetail lotteryPrizeRecordDetail)
    {
        lotteryPrizeRecordDetail.setCreateTime(DateUtils.getNowDate());
        return lotteryPrizeRecordDetailMapper.insertLotteryPrizeRecordDetail(lotteryPrizeRecordDetail);
    }

    /**
     * 修改爆奖记录详情
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 结果
     */
    @Override
    public int updateLotteryPrizeRecordDetail(LotteryPrizeRecordDetail lotteryPrizeRecordDetail)
    {
        lotteryPrizeRecordDetail.setUpdateTime(DateUtils.getNowDate());
        return lotteryPrizeRecordDetailMapper.updateLotteryPrizeRecordDetail(lotteryPrizeRecordDetail);
    }

    /**
     * 批量删除爆奖记录详情
     *
     * @param ids 需要删除的爆奖记录详情主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeRecordDetailByIds(Long[] ids)
    {
        return lotteryPrizeRecordDetailMapper.deleteLotteryPrizeRecordDetailByIds(ids);
    }

    /**
     * 删除爆奖记录详情信息
     *
     * @param id 爆奖记录详情主键
     * @return 结果
     */
    @Override
    public int deleteLotteryPrizeRecordDetailById(Long id)
    {
        return lotteryPrizeRecordDetailMapper.deleteLotteryPrizeRecordDetailById(id);
    }


    @Override
    public List<LotteryPrizeStatVO> stat(LotteryPrizeRecordDetail lotteryPrizeRecordDetail) {
        return lotteryPrizeRecordDetailMapper.stat(lotteryPrizeRecordDetail);
    }

    @Override
    public List<LotteryPrizeStatDTO> statAndGroupByLotteryId(LotteryPrizeRecordDetail lotteryPrizeRecordDetail) {
        return lotteryPrizeRecordDetailMapper.statAndGroupByLotteryId(lotteryPrizeRecordDetail);
    }
}
