package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.core.redis.RedisInfo;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.constants.CommonConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IpWhitelistMapper;
import com.ruoyi.system.domain.IpWhitelist;
import com.ruoyi.system.service.IIpWhitelistService;

/**
 * 白名单Service业务层处理
 *
 * @author ruoyi
 * @date 2024-08-15
 */
@Service
public class IpWhitelistServiceImpl implements IIpWhitelistService
{
    @Autowired
    private IpWhitelistMapper ipWhitelistMapper;

    @Autowired
    private RedisCache redisCache;

    /**
     * 查询白名单
     *
     * @param id 白名单主键
     * @return 白名单
     */
    @Override
    public IpWhitelist selectIpWhitelistById(Long id)
    {
        return ipWhitelistMapper.selectIpWhitelistById(id);
    }

    /**
     * 查询白名单列表
     *
     * @param ipWhitelist 白名单
     * @return 白名单
     */
    @Override
    public List<IpWhitelist> selectIpWhitelistList(IpWhitelist ipWhitelist)
    {
        return ipWhitelistMapper.selectIpWhitelistList(ipWhitelist);
    }

    /**
     * 新增白名单
     *
     * @param ipWhitelist 白名单
     * @return 结果
     */
    @Override
    public int insertIpWhitelist(IpWhitelist ipWhitelist)
    {
        ipWhitelist.setCreateTime(DateUtils.getNowDate());
        return ipWhitelistMapper.insertIpWhitelist(ipWhitelist);
    }

    /**
     * 修改白名单
     *
     * @param ipWhitelist 白名单
     * @return 结果
     */
    @Override
    public int updateIpWhitelist(IpWhitelist ipWhitelist)
    {
        ipWhitelist.setUpdateTime(DateUtils.getNowDate());
        return ipWhitelistMapper.updateIpWhitelist(ipWhitelist);
    }

    /**
     * 批量删除白名单
     *
     * @param ids 需要删除的白名单主键
     * @return 结果
     */
    @Override
    public int deleteIpWhitelistByIds(Long[] ids)
    {
        for (Long id : ids) {
            checkSysUserDataScope(id);
        }
        return ipWhitelistMapper.deleteIpWhitelistByIds(ids);
    }

    /**
     * 删除白名单信息
     *
     * @param id 白名单主键
     * @return 结果
     */
    @Override
    public int deleteIpWhitelistById(Long id)
    {
        return ipWhitelistMapper.deleteIpWhitelistById(id);
    }


    @Override
    public void checkSysUserDataScope(Long id) {
        if (!SysUser.isAdmin(SecurityUtils.getUserId())){
            Long platformId = SecurityUtils.getPlatformId();
            if (platformId != 1L){
                IpWhitelist ipWhitelist = ipWhitelistMapper.selectIpWhitelistById(id);
                if (!ipWhitelist.getPlatformId().equals(platformId)){
                    throw new ServiceException("没有权限访问！");
                }
            }
        }
    }

    @Override
    public List<String> getIpWhitelistList(Long platformId, Byte type) {
        RedisInfo redisInfo = CommonConstant.RedisKey.IP_WHITE_LIST_LIST;
        String key = redisInfo.getKey(platformId, type);
        List<String> ipWhitelistList = redisCache.getCacheObject(key);
        if (ipWhitelistList != null){
            return ipWhitelistList;
        }
        List<IpWhitelist> selectIpWhitelistList = ipWhitelistMapper.selectIpWhitelistList(new IpWhitelist().setPlatformId(platformId).setType(type));
        ipWhitelistList = selectIpWhitelistList.stream().map(IpWhitelist::getIp).distinct().collect(Collectors.toList());
        redisCache.setCacheObject(key, ipWhitelistList, redisInfo.getExpire(), TimeUnit.MILLISECONDS);
        return ipWhitelistList;
    }
}
