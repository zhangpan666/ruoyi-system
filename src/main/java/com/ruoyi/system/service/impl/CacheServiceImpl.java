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
    public void clearPlayTypeList(Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.PLAY_TYPE_LIST.getKey(lotteryId));
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

    @Override
    public void clearBetLimitAmount() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.BET_LIMIT_AMOUNT.getKeyPrefix());
    }


    @Override
    public void clearBetLimitAmount(Long platformId) {
        redisCache.deleteByPattern(CommonConstant.RedisKey.BET_LIMIT_AMOUNT.getKey(platformId));
    }

    @Override
    public void clearBetLimitAmount(Long platformId, Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.BET_LIMIT_AMOUNT.getKey(platformId,lotteryId));
    }

    @Override
    public void clearOddsMap() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.ODDS_MAP.getKeyPrefix());
    }

    @Override
    public void clearOddsList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.ODDS_LIST.getKeyPrefix());
    }

    @Override
    public void clearAllOddsList() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.ALL_ODDS_MAP.getKeyPrefix());
    }

    @Override
    public void clearPlatformDetail() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.PLATFORM_DETAIL.getKeyPrefix());
    }

    @Override
    public void clearPlatformDetail(Long platformId) {
        redisCache.deleteObject(CommonConstant.RedisKey.PLATFORM_DETAIL.getKey(platformId));
    }

    @Override
    public void clearCancelOrderLimit() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.CANCEL_ORDER_LIMIT.getKeyPrefix());
    }

    @Override
    public void clearCancelOrderLimit(Long platformId) {
        redisCache.deleteByPattern(CommonConstant.RedisKey.CANCEL_ORDER_LIMIT.getKey(platformId));
    }

    @Override
    public void clearCancelOrderLimit(Long platformId, Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.CANCEL_ORDER_LIMIT.getKey(platformId,lotteryId));
    }


    @Override
    public void clearUserBetLimitAmount() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.USER_BET_LIMIT_AMOUNT.getKeyPrefix());
    }

    @Override
    public void clearUserBetLimitAmount(Long lotteryId) {
        redisCache.deleteByPattern(CommonConstant.RedisKey.USER_BET_LIMIT_AMOUNT.getKey(lotteryId));
    }

    @Override
    public void clearUserBetLimitAmount(Long lotteryId, Long userId) {
        redisCache.deleteObject(CommonConstant.RedisKey.USER_BET_LIMIT_AMOUNT.getKey(lotteryId,userId));
    }

    @Override
    public void clearPlayTypeMap() {
        redisCache.deleteByPattern(CommonConstant.RedisKey.PLAY_TYPE_MAP.getKeyPrefix());
    }

    @Override
    public void clearPlayTypeMap(Long lotteryId) {
        redisCache.deleteObject(CommonConstant.RedisKey.PLAY_TYPE_MAP.getKey(lotteryId));
    }
}
