package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserBetLimitAmountMapper;
import com.ruoyi.system.domain.UserBetLimitAmount;
import com.ruoyi.system.service.IUserBetLimitAmountService;

/**
 * 用户投注限额Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-22
 */
@Service
public class UserBetLimitAmountServiceImpl implements IUserBetLimitAmountService 
{
    @Autowired
    private UserBetLimitAmountMapper userBetLimitAmountMapper;

    /**
     * 查询用户投注限额
     * 
     * @param id 用户投注限额主键
     * @return 用户投注限额
     */
    @Override
    public UserBetLimitAmount selectUserBetLimitAmountById(String id)
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
    public int deleteUserBetLimitAmountByIds(String[] ids)
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
    public int deleteUserBetLimitAmountById(String id)
    {
        return userBetLimitAmountMapper.deleteUserBetLimitAmountById(id);
    }
}
