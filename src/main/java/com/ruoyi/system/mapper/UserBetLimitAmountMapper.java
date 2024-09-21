package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserBetLimitAmount;

/**
 * 用户投注限额Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-21
 */
public interface UserBetLimitAmountMapper 
{
    /**
     * 查询用户投注限额
     * 
     * @param id 用户投注限额主键
     * @return 用户投注限额
     */
    public UserBetLimitAmount selectUserBetLimitAmountById(Long id);

    /**
     * 查询用户投注限额列表
     * 
     * @param userBetLimitAmount 用户投注限额
     * @return 用户投注限额集合
     */
    public List<UserBetLimitAmount> selectUserBetLimitAmountList(UserBetLimitAmount userBetLimitAmount);

    /**
     * 新增用户投注限额
     * 
     * @param userBetLimitAmount 用户投注限额
     * @return 结果
     */
    public int insertUserBetLimitAmount(UserBetLimitAmount userBetLimitAmount);

    /**
     * 修改用户投注限额
     * 
     * @param userBetLimitAmount 用户投注限额
     * @return 结果
     */
    public int updateUserBetLimitAmount(UserBetLimitAmount userBetLimitAmount);

    /**
     * 删除用户投注限额
     * 
     * @param id 用户投注限额主键
     * @return 结果
     */
    public int deleteUserBetLimitAmountById(Long id);

    /**
     * 批量删除用户投注限额
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserBetLimitAmountByIds(Long[] ids);
}
