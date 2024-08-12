package com.ruoyi.system.service;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.system.domain.AccountDetail;

/**
 * 账户明细Service接口
 *
 * @author ruoyi
 * @date 2024-08-11
 */
public interface IAccountDetailService
{
    /**
     * 查询账户明细
     *
     * @param id 账户明细主键
     * @return 账户明细
     */
    public AccountDetail selectAccountDetailById(Long id);

    /**
     * 查询账户明细列表
     *
     * @param accountDetail 账户明细
     * @return 账户明细集合
     */
    public List<AccountDetail> selectAccountDetailList(AccountDetail accountDetail);

    /**
     * 新增账户明细
     *
     * @param accountDetail 账户明细
     * @return 结果
     */
    public int insertAccountDetail(AccountDetail accountDetail);

    /**
     * 修改账户明细
     *
     * @param accountDetail 账户明细
     * @return 结果
     */
    public int updateAccountDetail(AccountDetail accountDetail);

    /**
     * 批量删除账户明细
     *
     * @param ids 需要删除的账户明细主键集合
     * @return 结果
     */
    public int deleteAccountDetailByIds(Long[] ids);

    /**
     * 删除账户明细信息
     *
     * @param id 账户明细主键
     * @return 结果
     */
    public int deleteAccountDetailById(Long id);

    boolean addBalance(Byte tradeType, Long relatedId, String orderNo, String mchOrderNo, BigDecimal amount, Long userId, String remark);

    boolean reduceBalance(Byte tradeType, Long relatedId, String orderNo, String mchOrderNo, BigDecimal amount, Long userId, String remark);

    boolean freezeBalance(Byte tradeType, Long relatedId, String orderNo, BigDecimal amount, Long userId, String remark);

    boolean unFreezeBalance(Byte tradeType, Long relatedId, String orderNo, BigDecimal amount, Long userId, String remark);

}
