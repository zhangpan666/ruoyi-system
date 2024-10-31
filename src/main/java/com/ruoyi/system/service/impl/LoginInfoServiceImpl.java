package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LoginInfoMapper;
import com.ruoyi.system.domain.LoginInfo;
import com.ruoyi.system.service.ILoginInfoService;

/**
 * 登录日志Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-29
 */
@Service
public class LoginInfoServiceImpl implements ILoginInfoService
{
    @Autowired
    private LoginInfoMapper loginInfoMapper;

    /**
     * 查询登录日志
     *
     * @param id 登录日志主键
     * @return 登录日志
     */
    @Override
    public LoginInfo selectLoginInfoById(Long id)
    {
        return loginInfoMapper.selectLoginInfoById(id);
    }

    /**
     * 查询登录日志列表
     *
     * @param loginInfo 登录日志
     * @return 登录日志
     */
    @Override
    public List<LoginInfo> selectLoginInfoList(LoginInfo loginInfo)
    {
        return loginInfoMapper.selectLoginInfoList(loginInfo);
    }

    /**
     * 新增登录日志
     *
     * @param loginInfo 登录日志
     * @return 结果
     */
    @Override
    public int insertLoginInfo(LoginInfo loginInfo)
    {
        loginInfo.setCreateTime(DateUtils.getNowDate());
        return loginInfoMapper.insertLoginInfo(loginInfo);
    }

    /**
     * 修改登录日志
     *
     * @param loginInfo 登录日志
     * @return 结果
     */
    @Override
    public int updateLoginInfo(LoginInfo loginInfo)
    {
        loginInfo.setUpdateTime(DateUtils.getNowDate());
        return loginInfoMapper.updateLoginInfo(loginInfo);
    }

    /**
     * 批量删除登录日志
     *
     * @param ids 需要删除的登录日志主键
     * @return 结果
     */
    @Override
    public int deleteLoginInfoByIds(Long[] ids)
    {
        return loginInfoMapper.deleteLoginInfoByIds(ids);
    }

    /**
     * 删除登录日志信息
     *
     * @param id 登录日志主键
     * @return 结果
     */
    @Override
    public int deleteLoginInfoById(Long id)
    {
        return loginInfoMapper.deleteLoginInfoById(id);
    }

    @Override
    public int getLoginUserCount(LoginInfo loginInfo) {
        return loginInfoMapper.getLoginUserCount(loginInfo);
    }
}
