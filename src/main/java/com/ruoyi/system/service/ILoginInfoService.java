package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LoginInfo;

/**
 * 登录日志Service接口
 * 
 * @author ruoyi
 * @date 2024-08-29
 */
public interface ILoginInfoService 
{
    /**
     * 查询登录日志
     * 
     * @param id 登录日志主键
     * @return 登录日志
     */
    public LoginInfo selectLoginInfoById(Long id);

    /**
     * 查询登录日志列表
     * 
     * @param loginInfo 登录日志
     * @return 登录日志集合
     */
    public List<LoginInfo> selectLoginInfoList(LoginInfo loginInfo);

    /**
     * 新增登录日志
     * 
     * @param loginInfo 登录日志
     * @return 结果
     */
    public int insertLoginInfo(LoginInfo loginInfo);

    /**
     * 修改登录日志
     * 
     * @param loginInfo 登录日志
     * @return 结果
     */
    public int updateLoginInfo(LoginInfo loginInfo);

    /**
     * 批量删除登录日志
     * 
     * @param ids 需要删除的登录日志主键集合
     * @return 结果
     */
    public int deleteLoginInfoByIds(Long[] ids);

    /**
     * 删除登录日志信息
     * 
     * @param id 登录日志主键
     * @return 结果
     */
    public int deleteLoginInfoById(Long id);
}