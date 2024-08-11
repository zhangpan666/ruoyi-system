package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LotteryMapper;
import com.ruoyi.system.domain.Lottery;
import com.ruoyi.system.service.ILotteryService;

/**
 * 彩种Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-09
 */
@Service
public class LotteryServiceImpl implements ILotteryService
{
    @Autowired
    private LotteryMapper lotteryMapper;

    /**
     * 查询彩种
     *
     * @param id 彩种主键
     * @return 彩种
     */
    @Override
    public Lottery selectLotteryById(Long id)
    {
        return lotteryMapper.selectLotteryById(id);
    }

    /**
     * 查询彩种列表
     *
     * @param lottery 彩种
     * @return 彩种
     */
    @Override
    public List<Lottery> selectLotteryList(Lottery lottery)
    {
        return lotteryMapper.selectLotteryList(lottery);
    }

    /**
     * 新增彩种
     *
     * @param lottery 彩种
     * @return 结果
     */
    @Override
    public int insertLottery(Lottery lottery)
    {
        lottery.setCreateTime(DateUtils.getNowDate());
        return lotteryMapper.insertLottery(lottery);
    }

    /**
     * 修改彩种
     *
     * @param lottery 彩种
     * @return 结果
     */
    @Override
    public int updateLottery(Lottery lottery)
    {
        lottery.setUpdateTime(DateUtils.getNowDate());
        return lotteryMapper.updateLottery(lottery);
    }

    /**
     * 批量删除彩种
     *
     * @param ids 需要删除的彩种主键
     * @return 结果
     */
    @Override
    public int deleteLotteryByIds(Long[] ids)
    {
        return lotteryMapper.deleteLotteryByIds(ids);
    }

    /**
     * 删除彩种信息
     *
     * @param id 彩种主键
     * @return 结果
     */
    @Override
    public int deleteLotteryById(Long id)
    {
        return lotteryMapper.deleteLotteryById(id);
    }

    @Override
    public Lottery getByName(String name) {
        return lotteryMapper.getByName(name);
    }

    @Override
    public Lottery getByCode(String code) {
        return lotteryMapper.getByCode(code);
    }
}
