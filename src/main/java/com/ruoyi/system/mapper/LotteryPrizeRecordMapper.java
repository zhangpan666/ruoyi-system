package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LotteryPrizeRecord;
import com.ruoyi.system.pojo.LotteryPrizeStatDTO;
import com.ruoyi.system.pojo.LotteryPrizeStatVO;

/**
 * 爆奖记录Mapper接口
 *
 * @author ruoyi
 * @date 2025-11-28
 */
public interface LotteryPrizeRecordMapper
{
    /**
     * 查询爆奖记录
     *
     * @param id 爆奖记录主键
     * @return 爆奖记录
     */
    public LotteryPrizeRecord selectLotteryPrizeRecordById(Long id);

    /**
     * 查询爆奖记录列表
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 爆奖记录集合
     */
    public List<LotteryPrizeRecord> selectLotteryPrizeRecordList(LotteryPrizeRecord lotteryPrizeRecord);

    /**
     * 新增爆奖记录
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 结果
     */
    public int insertLotteryPrizeRecord(LotteryPrizeRecord lotteryPrizeRecord);

    /**
     * 修改爆奖记录
     *
     * @param lotteryPrizeRecord 爆奖记录
     * @return 结果
     */
    public int updateLotteryPrizeRecord(LotteryPrizeRecord lotteryPrizeRecord);

    /**
     * 删除爆奖记录
     *
     * @param id 爆奖记录主键
     * @return 结果
     */
    public int deleteLotteryPrizeRecordById(Long id);

    /**
     * 批量删除爆奖记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLotteryPrizeRecordByIds(Long[] ids);

    List<LotteryPrizeStatVO> stat(LotteryPrizeRecord lotteryPrizeRecord);

    List<LotteryPrizeStatDTO> statAndGroupByLotteryId(LotteryPrizeRecord lotteryPrizeRecord);
}
