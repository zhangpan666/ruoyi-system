package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.User;

/**
 * 会员Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-09
 */
public interface UserMapper 
{
    /**
     * 查询会员
     * 
     * @param id 会员主键
     * @return 会员
     */
    public User selectUserById(Long id);

    /**
     * 查询会员列表
     * 
     * @param user 会员
     * @return 会员集合
     */
    public List<User> selectUserList(User user);

    /**
     * 新增会员
     * 
     * @param user 会员
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 修改会员
     * 
     * @param user 会员
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 删除会员
     * 
     * @param id 会员主键
     * @return 结果
     */
    public int deleteUserById(Long id);

    /**
     * 批量删除会员
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserByIds(Long[] ids);
}
