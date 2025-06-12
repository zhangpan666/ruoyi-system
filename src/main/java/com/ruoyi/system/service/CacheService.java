package com.ruoyi.system.service;

public interface CacheService {

    void clearLastLotteryRecord();

    void clearLotteryVideoList();

    void clearLotteryRecordList();

    void clearLotteryList();

    void clearLotteryDetail();

    void clearLotteryDetail(Long lotteryId);

    void clearCurrentLotteryPeriodInfo();

    void clearCurrentLotteryPeriodInfo(Long lotteryId);

    void clearPlayTypeList();

    void clearPlayTypeList(Long lotteryId);

    void clearCacheForLotteryRecord();

    void clearLotteryIssueNoList();

    void clearBetLimitAmount();

    void clearBetLimitAmount(Long platformId);

    void clearBetLimitAmount(Long platformId,Long lotteryId);

    void clearOddsMap();

    void clearOddsList();

    void clearAllOddsList();

    void clearPlatformDetail();

    void clearPlatformDetail(Long platformId);

    void clearCancelOrderLimit();

    void clearCancelOrderLimit(Long platformId);

    void clearCancelOrderLimit(Long platformId,Long lotteryId);

    void clearUserBetLimitAmount();

    void clearUserBetLimitAmount(Long lotteryId);

    void clearUserBetLimitAmount(Long lotteryId,Long userId);

    void clearPlayTypeMap();

    void clearPlayTypeMap(Long lotteryId);

    void clearPlatformPlayTypeMap();

    void clearPlatformPlayTypeMap(Long platformId);

    void clearPlatformPlayTypeItemMap();

    void clearPlatformPlayTypeItemMap(Long platformId);


}
