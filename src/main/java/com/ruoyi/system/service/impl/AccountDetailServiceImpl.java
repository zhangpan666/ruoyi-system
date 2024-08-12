package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.constants.ProjectConstant;
import com.ruoyi.system.domain.Account;
import com.ruoyi.system.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AccountDetailMapper;
import com.ruoyi.system.domain.AccountDetail;
import com.ruoyi.system.service.IAccountDetailService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 账户明细Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-11
 */
@Service
@Transactional
public class AccountDetailServiceImpl implements IAccountDetailService
{
    @Autowired
    private AccountDetailMapper accountDetailMapper;


    @Autowired
    private IAccountService accountService;


    /**
     * 查询账户明细
     *
     * @param id 账户明细主键
     * @return 账户明细
     */
    @Override
    public AccountDetail selectAccountDetailById(Long id)
    {
        return accountDetailMapper.selectAccountDetailById(id);
    }

    /**
     * 查询账户明细列表
     *
     * @param accountDetail 账户明细
     * @return 账户明细
     */
    @Override
    public List<AccountDetail> selectAccountDetailList(AccountDetail accountDetail)
    {
        return accountDetailMapper.selectAccountDetailList(accountDetail);
    }

    /**
     * 新增账户明细
     *
     * @param accountDetail 账户明细
     * @return 结果
     */
    @Override
    public int insertAccountDetail(AccountDetail accountDetail)
    {
        accountDetail.setCreateTime(DateUtils.getNowDate());
        return accountDetailMapper.insertAccountDetail(accountDetail);
    }

    /**
     * 修改账户明细
     *
     * @param accountDetail 账户明细
     * @return 结果
     */
    @Override
    public int updateAccountDetail(AccountDetail accountDetail)
    {
        accountDetail.setUpdateTime(DateUtils.getNowDate());
        return accountDetailMapper.updateAccountDetail(accountDetail);
    }

    /**
     * 批量删除账户明细
     *
     * @param ids 需要删除的账户明细主键
     * @return 结果
     */
    @Override
    public int deleteAccountDetailByIds(Long[] ids)
    {
        return accountDetailMapper.deleteAccountDetailByIds(ids);
    }

    /**
     * 删除账户明细信息
     *
     * @param id 账户明细主键
     * @return 结果
     */
    @Override
    public int deleteAccountDetailById(Long id)
    {
        return accountDetailMapper.deleteAccountDetailById(id);
    }


    @Override
    public boolean addBalance(Byte tradeType, Long relatedId, String orderNo, String mchOrderNo, BigDecimal amount, Long userId, String remark) {
        Account account = accountService.selectAccountById(userId);
        BigDecimal availableBalance = account.getAvailableBalance().add(amount);
        accountService.addBalance(amount, userId);
        AccountDetail accountDetail = new AccountDetail().setUserId(userId).setRelatedId(relatedId).setPaymentType(ProjectConstant.PaymentType.INCOME)
                .setAmount(amount).setAvailableBalance(availableBalance).setTradeType(tradeType).setStatus(ProjectConstant.AccountDetailStatus.DONE)
                .setOrderNo(orderNo).setMchOrderNo(mchOrderNo);
        accountDetail.setRemark(remark);
        accountDetailMapper.insertAccountDetail(accountDetail);
        return true;
    }

    @Override
    public boolean reduceBalance(Byte tradeType, Long relatedId, String orderNo,String mchOrderNo, BigDecimal amount, Long userId, String remark) {
        Account account = accountService.selectAccountById(userId);
        BigDecimal availableBalance = account.getAvailableBalance();
        accountService.reduceBalance(amount, userId);
        AccountDetail accountDetail=new AccountDetail().setOrderNo(orderNo).setMchOrderNo(mchOrderNo).setPaymentType(ProjectConstant.PaymentType.EXPENSE).setAmount(amount)
                .setUserId(userId).setAvailableBalance(availableBalance.subtract(amount)).setStatus(ProjectConstant.AccountDetailStatus.DONE)
                .setTradeType(tradeType).setRelatedId(relatedId);
        accountDetail.setRemark(remark);
        accountDetailMapper.insertAccountDetail(accountDetail);
        return true;
    }

    @Override
    public boolean freezeBalance(Byte tradeType, Long relatedId, String orderNo, BigDecimal amount, Long userId, String remark) {
        Account account = accountService.selectAccountById(userId);
        BigDecimal availableBalance = account.getAvailableBalance();
        accountService.doFreezeBalance(amount, userId);
        AccountDetail accountDetail=new AccountDetail().setOrderNo(orderNo).setPaymentType(ProjectConstant.PaymentType.EXPENSE).setAmount(amount)
                .setUserId(userId).setAvailableBalance(availableBalance.subtract(amount)).setStatus(ProjectConstant.AccountDetailStatus.FREEZE)
                .setTradeType(tradeType).setRelatedId(relatedId);
        accountDetail.setRemark(remark);
        accountDetailMapper.insertAccountDetail(accountDetail);
        return true;
    }

    @Override
    public boolean unFreezeBalance(Byte tradeType, Long relatedId, String orderNo, BigDecimal amount, Long userId, String remark) {
        Account account = accountService.selectAccountById(userId);
        accountService.doUnFreezeBalance(amount, userId);
        AccountDetail accountDetail = new AccountDetail().setUserId(userId).setRelatedId(relatedId).setPaymentType(ProjectConstant.PaymentType.INCOME)
                .setAmount(amount).setAvailableBalance(account.getAvailableBalance().add(amount)).setTradeType(tradeType)
                .setStatus(ProjectConstant.AccountDetailStatus.DONE).setOrderNo(orderNo);
        accountDetail.setRemark(remark);
        accountDetailMapper.insertAccountDetail(accountDetail);
        return true;
    }


}
