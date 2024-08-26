package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Odds;

/**
 * 赔率设置Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IOddsService 
{
    /**
     * 查询赔率设置
     * 
     * @param id 赔率设置主键
     * @return 赔率设置
     */
    public Odds selectOddsById(Long id);

    /**
     * 查询赔率设置列表
     * 
     * @param odds 赔率设置
     * @return 赔率设置集合
     */
    public List<Odds> selectOddsList(Odds odds);

    /**
     * 新增赔率设置
     * 
     * @param odds 赔率设置
     * @return 结果
     */
    public int insertOdds(Odds odds);

    /**
     * 修改赔率设置
     * 
     * @param odds 赔率设置
     * @return 结果
     */
    public int updateOdds(Odds odds);

    /**
     * 批量删除赔率设置
     * 
     * @param ids 需要删除的赔率设置主键集合
     * @return 结果
     */
    public int deleteOddsByIds(Long[] ids);

    /**
     * 删除赔率设置信息
     * 
     * @param id 赔率设置主键
     * @return 结果
     */
    public int deleteOddsById(Long id);
}
