package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Lottery;

/**
 * 彩种Service接口
 * 
 * @author ruoyi
 * @date 2024-08-09
 */
public interface ILotteryService 
{
    /**
     * 查询彩种
     * 
     * @param id 彩种主键
     * @return 彩种
     */
    public Lottery selectLotteryById(Long id);

    /**
     * 查询彩种列表
     * 
     * @param lottery 彩种
     * @return 彩种集合
     */
    public List<Lottery> selectLotteryList(Lottery lottery);

    /**
     * 新增彩种
     * 
     * @param lottery 彩种
     * @return 结果
     */
    public int insertLottery(Lottery lottery);

    /**
     * 修改彩种
     * 
     * @param lottery 彩种
     * @return 结果
     */
    public int updateLottery(Lottery lottery);

    /**
     * 批量删除彩种
     * 
     * @param ids 需要删除的彩种主键集合
     * @return 结果
     */
    public int deleteLotteryByIds(Long[] ids);

    /**
     * 删除彩种信息
     * 
     * @param id 彩种主键
     * @return 结果
     */
    public int deleteLotteryById(Long id);
}
