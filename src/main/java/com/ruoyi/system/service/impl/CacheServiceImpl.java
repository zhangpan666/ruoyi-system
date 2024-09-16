package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.system.constants.CommonConstant;
import com.ruoyi.system.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private RedisCache redisCache;


    @Override
    public void clearLastLotteryRecord() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LAST_LOTTERY_RECORD.getKeyPrefix());
    }

    @Override
    public void clearLotteryVideoList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LOTTERY_VIDEO_LIST.getKeyPrefix());
    }

    @Override
    public void clearLotteryRecordList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LOTTERY_RECORD_LIST.getKeyPrefix());
    }

    @Override
    public void clearLotteryList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LOTTERY_LIST.getKeyPrefix());
    }

    @Override
    public void clearLotteryDetail() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LOTTERY_DETAIL.getKeyPrefix());
    }

    @Override
    public void clearLotteryDetail(Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.LOTTERY_DETAIL.getKey(lotteryId));
    }

    @Override
    public void clearCurrentLotteryPeriodInfo() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.CURRENT_LOTTERY_PERIOD_INFO.getKeyPrefix());
    }

    @Override
    public void clearCurrentLotteryPeriodInfo(Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.CURRENT_LOTTERY_PERIOD_INFO.getKey(lotteryId));
    }

    @Override
    public void clearPlayTypeList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.PLAY_TYPE_LIST.getKeyPrefix());
    }

    @Override
    public void clearCacheForLotteryRecord() {
        this.clearLastLotteryRecord();
        this.clearCurrentLotteryPeriodInfo();
        this.clearLotteryDetail();
        this.clearLotteryList();
        this.clearLotteryRecordList();
        this.clearLotteryIssueNoList();
    }

    @Override
    public void clearLotteryIssueNoList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.LOTTERY_ISSUE_NO_LIST.getKeyPrefix());
    }
}
