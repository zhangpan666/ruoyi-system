package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AccountMapper;
import com.ruoyi.system.domain.Account;
import com.ruoyi.system.service.IAccountService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 账户Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-09
 */
@Service
@Transactional
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

    @Override
    public boolean addBalance(BigDecimal amount, Long accountId) {
        return accountMapper.addBalance(amount, accountId) == 1;
    }

    @Override
    public boolean reduceBalance(BigDecimal amount, Long accountId) {
        return accountMapper.reduceBalance(amount, accountId) == 1;
    }

    @Override
    public boolean doFreezeBalance(BigDecimal amount, Long accountId) {
        return accountMapper.doFreezeBalance(amount, accountId) == 1;
    }

    @Override
    public boolean doUnFreezeBalance(BigDecimal amount, Long accountId) {
        return accountMapper.doUnFreezeBalance(amount, accountId) == 1;
    }

    @Override
    public int addTotalBetAmount(BigDecimal amount, Long accountId) {
        return accountMapper.addTotalBetAmount(amount, accountId);
    }

    @Override
    public int reduceTotalBetAmount(BigDecimal amount, Long accountId) {
        return accountMapper.reduceTotalBetAmount(amount, accountId);
    }

    @Override
    public int addTotalWinLoseAmount(BigDecimal amount, Long accountId) {
        return accountMapper.addTotalWinLoseAmount(amount, accountId);
    }

    @Override
    public int reduceTotalWinLoseAmount(BigDecimal amount, Long accountId) {
        return accountMapper.reduceTotalWinLoseAmount(amount, accountId);
    }

}
