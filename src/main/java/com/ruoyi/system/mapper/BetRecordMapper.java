package com.ruoyi.system.mapper;

import java.util.Date;
import java.util.List;
import com.ruoyi.system.domain.BetRecord;
import com.ruoyi.system.domain.vo.LotteryBetDataVO;
import com.ruoyi.system.domain.vo.RealTimeOrderVO;
import com.ruoyi.system.pojo.BetRecordDateStatVO;
import com.ruoyi.system.pojo.BetRecordStatVO;
import org.apache.ibatis.annotations.Param;

/**
 * 投注记录Mapper接口
 *
 * @author ruoyi
 * @date 2024-08-11
 */
public interface BetRecordMapper
{
    /**
     * 查询投注记录
     *
     * @param id 投注记录主键
     * @return 投注记录
     */
    public BetRecord selectBetRecordById(Long id);

    /**
     * 查询投注记录列表
     *
     * @param betRecord 投注记录
     * @return 投注记录集合
     */
    public List<BetRecord> selectBetRecordList(BetRecord betRecord);

    /**
     * 新增投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    public int insertBetRecord(BetRecord betRecord);

    /**
     * 修改投注记录
     *
     * @param betRecord 投注记录
     * @return 结果
     */
    public int updateBetRecord(BetRecord betRecord);

    /**
     * 删除投注记录
     *
     * @param id 投注记录主键
     * @return 结果
     */
    public int deleteBetRecordById(Long id);

    /**
     * 批量删除投注记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBetRecordByIds(Long[] ids);

    BetRecordStatVO statBetRecord(BetRecord betRecord);

    List<BetRecordStatVO> statBetRecordAndGroupByUserId(BetRecord betRecord);

    List<BetRecordDateStatVO> statBetRecordAndGroupByDate(BetRecord betRecord);

    List<BetRecordStatVO> statBetRecordAndGroupByLotteryId(BetRecord betRecord);

    List<BetRecordStatVO> statBetRecordAndGroupByPlayTypeCode(BetRecord betRecord);

    List<BetRecordStatVO> statBetRecordAndGroupByPlayTypeDetailCode(BetRecord betRecord);

    List<LotteryBetDataVO> statLotteryDataList(BetRecord betRecord);

    List<LotteryBetDataVO> getPlayTypeList(BetRecord betRecord);

    List<RealTimeOrderVO> realTimeOrderByNumber(BetRecord betRecordParam);

    List<RealTimeOrderVO> realTimeOrderBySx(BetRecord betRecordParam);

    List<RealTimeOrderVO> realTimeOrderByColour(BetRecord betRecordParam);

    List<RealTimeOrderVO> realTimeOrderByType(BetRecord betRecordParam);

    List<RealTimeOrderVO> realTimeOrderByPtyx(BetRecord betRecordParam);

    List<RealTimeOrderVO> realTimeOrderByMantissa(BetRecord betRecordParam);
}
