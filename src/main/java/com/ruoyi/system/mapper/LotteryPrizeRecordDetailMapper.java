package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.LotteryPrizeRecord;
import com.ruoyi.system.domain.LotteryPrizeRecordDetail;
import com.ruoyi.system.pojo.LotteryPrizeStatDTO;
import com.ruoyi.system.pojo.LotteryPrizeStatVO;

/**
 * 爆奖记录详情Mapper接口
 *
 * @author ruoyi
 * @date 2026-05-28
 */
public interface LotteryPrizeRecordDetailMapper
{
    /**
     * 查询爆奖记录详情
     *
     * @param id 爆奖记录详情主键
     * @return 爆奖记录详情
     */
    public LotteryPrizeRecordDetail selectLotteryPrizeRecordDetailById(Long id);

    /**
     * 查询爆奖记录详情列表
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 爆奖记录详情集合
     */
    public List<LotteryPrizeRecordDetail> selectLotteryPrizeRecordDetailList(LotteryPrizeRecordDetail lotteryPrizeRecordDetail);

    /**
     * 新增爆奖记录详情
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 结果
     */
    public int insertLotteryPrizeRecordDetail(LotteryPrizeRecordDetail lotteryPrizeRecordDetail);

    /**
     * 修改爆奖记录详情
     *
     * @param lotteryPrizeRecordDetail 爆奖记录详情
     * @return 结果
     */
    public int updateLotteryPrizeRecordDetail(LotteryPrizeRecordDetail lotteryPrizeRecordDetail);

    /**
     * 删除爆奖记录详情
     *
     * @param id 爆奖记录详情主键
     * @return 结果
     */
    public int deleteLotteryPrizeRecordDetailById(Long id);

    /**
     * 批量删除爆奖记录详情
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLotteryPrizeRecordDetailByIds(Long[] ids);

    List<LotteryPrizeStatVO> stat(LotteryPrizeRecordDetail lotteryPrizeRecordDetail);

    List<LotteryPrizeStatDTO> statAndGroupByLotteryId(LotteryPrizeRecordDetail lotteryPrizeRecordDetail);

}
