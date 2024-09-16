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

    void clearCacheForLotteryRecord();

    void clearLotteryIssueNoList();


}
