package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AccountMapper;
import com.ruoyi.system.domain.Account;
import com.ruoyi.system.service.IAccountService;

/**
 * 账户Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-09
 */
@Service
public class AccountServiceImpl implements IAccountService
{
    @Autowired
    private AccountMapper accountMapper;

    /**
     * 查询账户
     *
     * @param id 账户主键
     * @return 账户
     */
    @Override
    public Account selectAccountById(Long id)
    {
        return accountMapper.selectAccountById(id);
    }

    /**
     * 查询账户列表
     *
     * @param account 账户
     * @return 账户
     */
    @Override
    public List<Account> selectAccountList(Account account)
    {
        Long platformId = SecurityUtils.getPlatformId();
        if (platformId != 1) {
            account.setPlatformId(platformId);
        }
        return accountMapper.selectAccountList(account);
    }

    /**
     * 新增账户
     *
     * @param account 账户
     * @return 结果
     */
    @Override
    public int insertAccount(Account account)
    {
        account.setCreateTime(DateUtils.getNowDate());
        return accountMapper.insertAccount(account);
    }

    /**
     * 修改账户
     *
     * @param account 账户
     * @return 结果
     */
    @Override
    public int updateAccount(Account account)
    {
        account.setUpdateTime(DateUtils.getNowDate());
        return accountMapper.updateAccount(account);
    }

    /**
     * 批量删除账户
     *
     * @param ids 需要删除的账户主键
     * @return 结果
     */
    @Override
    public int deleteAccountByIds(Long[] ids)
    {
        return accountMapper.deleteAccountByIds(ids);
    }

    /**
     * 删除账户信息
     *
     * @param id 账户主键
     * @return 结果
     */
    @Override
    public int deleteAccountById(Long id)
    {
        return accountMapper.deleteAccountById(id);
    }
}
