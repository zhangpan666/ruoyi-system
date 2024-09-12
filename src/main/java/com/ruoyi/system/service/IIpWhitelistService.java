package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.IpWhitelist;

/**
 * 白名单Service接口
 *
 * @author ruoyi
 * @date 2024-08-15
 */
public interface IIpWhitelistService
{
    /**
     * 查询白名单
     *
     * @param id 白名单主键
     * @return 白名单
     */
    public IpWhitelist selectIpWhitelistById(Long id);

    /**
     * 查询白名单列表
     *
     * @param ipWhitelist 白名单
     * @return 白名单集合
     */
    public List<IpWhitelist> selectIpWhitelistList(IpWhitelist ipWhitelist);

    /**
     * 新增白名单
     *
     * @param ipWhitelist 白名单
     * @return 结果
     */
    public int insertIpWhitelist(IpWhitelist ipWhitelist);

    /**
     * 修改白名单
     *
     * @param ipWhitelist 白名单
     * @return 结果
     */
    public int updateIpWhitelist(IpWhitelist ipWhitelist);

    /**
     * 批量删除白名单
     *
     * @param ids 需要删除的白名单主键集合
     * @return 结果
     */
    public int deleteIpWhitelistByIds(Long[] ids);

    /**
     * 删除白名单信息
     *
     * @param id 白名单主键
     * @return 结果
     */
    public int deleteIpWhitelistById(Long id);

    void checkSysUserDataScope(Long id);

    List<String> getIpWhitelistList(Long platformId,Byte type);
}
