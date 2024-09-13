package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserMapper;
import com.ruoyi.system.domain.User;
import com.ruoyi.system.service.IUserService;

/**
 * 会员Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-09
 */
@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper userMapper;

    /**
     * 查询会员
     *
     * @param id 会员主键
     * @return 会员
     */
    @Override
    public User selectUserById(Long id)
    {
        return userMapper.selectUserById(id);
    }

    /**
     * 查询会员列表
     *
     * @param user 会员
     * @return 会员
     */
    @Override
    public List<User> selectUserList(User user)
    {
        Long platformId = SecurityUtils.getPlatformId();
        if (platformId != 1){
            user.setPlatformId(platformId);
        }
        return userMapper.selectUserList(user);
    }

    /**
     * 新增会员
     *
     * @param user 会员
     * @return 结果
     */
    @Override
    public int insertUser(User user)
    {
        user.setCreateTime(DateUtils.getNowDate());
        return userMapper.insertUser(user);
    }

    /**
     * 修改会员
     *
     * @param user 会员
     * @return 结果
     */
    @Override
    public int updateUser(User user)
    {
        user.setUpdateTime(DateUtils.getNowDate());
        return userMapper.updateUser(user);
    }

    /**
     * 批量删除会员
     *
     * @param ids 需要删除的会员主键
     * @return 结果
     */
    @Override
    public int deleteUserByIds(Long[] ids)
    {
        return userMapper.deleteUserByIds(ids);
    }

    /**
     * 删除会员信息
     *
     * @param id 会员主键
     * @return 结果
     */
    @Override
    public int deleteUserById(Long id)
    {
        return userMapper.deleteUserById(id);
    }


    @Override
    public void checkSysUserDataScope(Long userId) {
        if (!SysUser.isAdmin(SecurityUtils.getUserId())) {
            Long platformId = SecurityUtils.getPlatformId();
            if (platformId != 1L){
                User user = userMapper.selectUserById(userId);
                if (!user.getPlatformId().equals(platformId)){
                    throw new ServiceException("没有权限访问用户数据！");
                }
            }
        }
    }

    @Override
    public int getCount(User user) {
        return userMapper.getCount(user);
    }
}
