package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.BetLimitAmount;
import com.ruoyi.system.service.IBetLimitAmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserBetLimitAmountMapper;
import com.ruoyi.system.domain.UserBetLimitAmount;
import com.ruoyi.system.service.IUserBetLimitAmountService;

/**
 * 用户投注限额Service业务层处理
 *
 * @author ruoyi
 * @date 2024-09-21
 */
@Service
public class UserBetLimitAmountServiceImpl implements IUserBetLimitAmountService
{
    @Autowired
    private UserBetLimitAmountMapper userBetLimitAmountMapper;

    @Autowired
    private IBetLimitAmountService betLimitAmountService;

    /**
     * 查询用户投注限额
     *
     * @param id 用户投注限额主键
     * @return 用户投注限额
     */
    @Override
    public UserBetLimitAmount selectUserBetLimitAmountById(Long id)
    {
        return userBetLimitAmountMapper.selectUserBetLimitAmountById(id);
    }

    /**
     * 查询用户投注限额列表
     *
     * @param userBetLimitAmount 用户投注限额
     * @return 用户投注限额
     */
    @Override
    public List<UserBetLimitAmount> selectUserBetLimitAmountList(UserBetLimitAmount userBetLimitAmount)
    {
        return userBetLimitAmountMapper.selectUserBetLimitAmountList(userBetLimitAmount);
    }

    /**
     * 新增用户投注限额
     *
     * @param userBetLimitAmount 用户投注限额
     * @return 结果
     */
    @Override
    public int insertUserBetLimitAmount(UserBetLimitAmount userBetLimitAmount)
    {
        userBetLimitAmount.setCreateTime(DateUtils.getNowDate());
        return userBetLimitAmountMapper.insertUserBetLimitAmount(userBetLimitAmount);
    }

    /**
     * 修改用户投注限额
     *
     * @param userBetLimitAmount 用户投注限额
     * @return 结果
     */
    @Override
    public int updateUserBetLimitAmount(UserBetLimitAmount userBetLimitAmount)
    {
        userBetLimitAmount.setUpdateTime(DateUtils.getNowDate());
        return userBetLimitAmountMapper.updateUserBetLimitAmount(userBetLimitAmount);
    }

    /**
     * 批量删除用户投注限额
     *
     * @param ids 需要删除的用户投注限额主键
     * @return 结果
     */
    @Override
    public int deleteUserBetLimitAmountByIds(Long[] ids)
    {
        return userBetLimitAmountMapper.deleteUserBetLimitAmountByIds(ids);
    }

    /**
     * 删除用户投注限额信息
     *
     * @param id 用户投注限额主键
     * @return 结果
     */
    @Override
    public int deleteUserBetLimitAmountById(Long id)
    {
        return userBetLimitAmountMapper.deleteUserBetLimitAmountById(id);
    }


    @Override
    public void initUserBetLimitAmount(Long userId) {
        List<BetLimitAmount> betLimitAmountList = betLimitAmountService.selectBetLimitAmountList(new BetLimitAmount().setPlatformId(0L));
        List<UserBetLimitAmount> userBetLimitAmountList = betLimitAmountList.stream().map(betLimitAmount -> new UserBetLimitAmount().setLotteryId(betLimitAmount.getLotteryId()).setType(betLimitAmount.getType())
                .setUserId(userId).setSingleTimeBetMinAmount(betLimitAmount.getSingleTimeBetMinAmount()).setSingleTimeBetMaxAmount(betLimitAmount.getSingleTimeBetMaxAmount())
                .setSinglePeriodBetMaxAmount(betLimitAmount.getSinglePeriodBetMaxAmount())).collect(Collectors.toList());
        userBetLimitAmountList.forEach(userBetLimitAmount -> {
            userBetLimitAmountMapper.insertUserBetLimitAmount(userBetLimitAmount);
        });
    }


}
