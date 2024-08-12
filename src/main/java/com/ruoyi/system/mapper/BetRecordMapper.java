package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BetRecord;

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
}