package com.ruoyi.system.constants;

import com.light.core.model.CommonConstantInfo;
import com.light.core.model.CommonKVString;
import com.light.core.utils.BaseCommonKVStringClassUtil;
import com.light.core.utils.BaseConstantClassUtil;
import com.ruoyi.common.core.redis.RedisInfo;

import java.util.Map;

public class CommonConstant {

    public static final byte COMMON_STATUS_AVAILABLE = 1;

    public static final byte COMMON_STATUS_NOT_AVAILABLE = 0;

    public static final byte COMMON_STATUS_DELETE = -1;


    public static class RedisKey {
        public static final RedisInfo USER_LOGIN_VERIFY_CODE = new RedisInfo().setKeyPrefix("USER_LOGIN_VERIFY_CODE").setName("谷歌验证器").setDay(30 * 6).setDbIndex(2);
        public static final RedisInfo APP_USER_LOGIN_INFO = new RedisInfo().setKeyPrefix("APP_USER_LOGIN_INFO").setMinute(5).setDbIndex(3).setName("APP用户登录信息缓存");
        public static final RedisInfo CALL_SYNC_LOCK = new RedisInfo().setSecond(20).setKeyPrefix("CALL_SYNC_LOCK").setName("同步锁").setDbIndex(0);
        public static final RedisInfo ONLINE_ADMIN_COUNT = new RedisInfo().setSecond(-1).setKeyPrefix("ONLINE_ADMIN_COUNT").setName("管理员在线人数");
        public static final RedisInfo ONLINE_ADMIN = new RedisInfo().setSecond(-1).setKeyPrefix("ONLINE_ADMIN").setName("管理员在线人数");
        public static final RedisInfo ONLINE_USER_COUNT = new RedisInfo().setSecond(-1).setKeyPrefix("ONLINE_USER_COUNT").setName("用户在线人数");
        public static final RedisInfo ONLINE_USER = new RedisInfo().setSecond(-1).setKeyPrefix("ONLINE_USER").setName("在线用户");
        public static final RedisInfo CURRENT_LOTTERY_PERIOD_INFO = new RedisInfo().setMinute(4).setKeyPrefix("CURRENT_LOTTERY_PERIOD_INFO").setName("当前开奖期数信息");
        public static final RedisInfo LOGIN_USER = new RedisInfo().setMinute(30).setKeyPrefix("LOGIN_USER").setName("登录信息");
        public static final RedisInfo PLAY_TYPE_LIST = new RedisInfo().setMinute(30).setKeyPrefix("PLAY_TYPE_LIST").setName("彩票玩法列表");
        public static final RedisInfo PLAY_TYPE_MAP = new RedisInfo().setMinute(30).setKeyPrefix("PLAY_TYPE_MAP").setName("彩票玩法列表");
        public static final RedisInfo ODDS_LIST = new RedisInfo().setMinute(30).setKeyPrefix("ODDS_LIST").setName("彩票赔率列表");
        public static final RedisInfo ODDS_MAP = new RedisInfo().setMinute(30).setKeyPrefix("ODDS_MAP").setName("彩票赔率列表");
        public static final RedisInfo LOTTERY_LIST = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_LIST").setName("彩种列表");
        public static final RedisInfo LOTTERY_DETAIL = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_DETAIL").setName("彩种详情");
        public static final RedisInfo LAST_LOTTERY_RECORD = new RedisInfo().setMinute(30).setKeyPrefix("LAST_LOTTERY_RECORD").setName("最新开奖");
        public static final RedisInfo LOTTERY_RECORD_LIST = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_RECORD_LIST").setName("开奖列表");
        public static final RedisInfo LOTTERY_ISSUE_NO_LIST = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_ISSUE_NO_LIST").setName("开奖期号列表");
        public static final RedisInfo LOTTERY_VIDEO_LIST = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_VIDEO_LIST").setName("开奖视频列表");
        public static final RedisInfo BET_LIMIT_AMOUNT = new RedisInfo().setHour(2).setKeyPrefix("BET_LIMIT_AMOUNT").setName("投注限额");
        public static final RedisInfo USER_BET_LIMIT_AMOUNT = new RedisInfo().setHour(2).setKeyPrefix("USER_BET_LIMIT_AMOUNT").setName("用户投注限额");
        public static final RedisInfo CANCEL_ORDER_LIMIT = new RedisInfo().setHour(2).setKeyPrefix("CANCEL_ORDER_LIMIT").setName("撤单限制");
        public static final RedisInfo ALL_ODDS_MAP = new RedisInfo().setMinute(30).setKeyPrefix("ALL_ODDS_MAP").setName("彩票赔率表");
        public static final RedisInfo PLATFORM_DETAIL = new RedisInfo().setDay(1).setKeyPrefix("PLATFORM_DETAIL").setName("平台详情");
        public static final RedisInfo IP_WHITE_LIST_LIST = new RedisInfo().setDay(1).setKeyPrefix("IP_WHITE_LIST_LIST").setName("IP白名单列表");
        public static final RedisInfo ANIMAL_SPORTS_MEETING_CHAMPION_PLAYER_STAT = new RedisInfo().setMinute(10).setKeyPrefix("ANIMAL_SPORTS_MEETING_CHAMPION_PLAYER_STAT").setName("动物运动会冠军次数统计");
        public static final RedisInfo ACTIVITY_SPECIAL_NUMBER_RECORD_DETAIL = new RedisInfo().setMinute(30).setKeyPrefix("ACTIVITY_SPECIAL_NUMBER_RECORD_DETAIL").setName("活动特码详情");
        public static final RedisInfo PLATFORM_PLAY_TYPE_LIST = new RedisInfo().setMinute(30).setKeyPrefix("PLATFORM_PLAY_TYPE_LIST").setName("平台玩法大类");
        public static final RedisInfo PLATFORM_PLAY_TYPE_ITEM_LIST = new RedisInfo().setMinute(30).setKeyPrefix("PLATFORM_PLAY_TYPE_ITEM_LIST").setName("平台玩法小类");
        public static final RedisInfo BET_LIMIT_LIST = new RedisInfo().setHour(2).setKeyPrefix("BET_LIMIT_LIST").setName("投注限制");
        public static final RedisInfo LOTTERY_PRIZE_CONFIG = new RedisInfo().setHour(2).setKeyPrefix("LOTTERY_PRIZE_CONFIG").setName("奖池提取比例");
        public static final RedisInfo JACKPOT_AMOUNT = new RedisInfo().setMinute(30).setKeyPrefix("JACKPOT_AMOUNT").setName("奖池");
        public static final RedisInfo LOTTERY_PRIZE_RECORD_RANK_LIST = new RedisInfo().setMinute(30).setKeyPrefix("LOTTERY_PRIZE_RECORD_RANK_LIST").setName("中奖排行榜");
        public static final RedisInfo RECENT_LOTTERY_PRIZE_NOTICE = new RedisInfo().setMinute(10).setKeyPrefix("RECENT_LOTTERY_PRIZE_NOTICE").setName("最近中奖通知");
        public static final RedisInfo TOTAL_PRIZE_AMOUNT = new RedisInfo().setMinute(10).setKeyPrefix("TOTAL_PRIZE_AMOUNT").setName("已爆奖总金额");
        public static final RedisInfo USER_ONLINE_NOTICE_STATUS = new RedisInfo().setMinute(30).setKeyPrefix("USER_ONLINE_NOTICE_STATUS").setName("用户上线通知状态");
    }



    public static class SmsType {
        public static final byte REGISTER = 1;
        public static final byte LOGIN = 2;
        public static final byte FIND_PASSWORD = 3;
        public static final byte CHANGE_MOBILE_OLD = 4;
        public static final byte CHANGE_MOBILE_NEW = 5;
        public static final byte BINDING_MOBILE = 6;
    }


    public static class IpWhitelistType {
        public static final byte ADMIN = 1;
        public static final byte API = 2;
    }


    public static class Related {
        public static final byte ROLE = 0;
    }

    public static class TradeType {
        public static final CommonConstantInfo REFUND = new CommonConstantInfo(0, "退款");
        public static final CommonConstantInfo AMOUNT_TRANSFER_IN = new CommonConstantInfo(1, "额度转入");
        public static final CommonConstantInfo AMOUNT_TRANSFER_OUT = new CommonConstantInfo(2, "额度转出");
        public static final CommonConstantInfo BET = new CommonConstantInfo(3, "投注");
        public static final CommonConstantInfo REWARD = new CommonConstantInfo(4, "派彩");
        public static final CommonConstantInfo FREEZE = new CommonConstantInfo(5, "冻结");
        public static final CommonConstantInfo UNFREEZE = new CommonConstantInfo(6, "解冻");
        public static final CommonConstantInfo CANCEL_ORDER = new CommonConstantInfo(7, "撤单");
        public static final CommonConstantInfo BALANCE = new CommonConstantInfo(8, "查询额度");
        public static final CommonConstantInfo PRIZE = new CommonConstantInfo(9, "爆奖");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(TradeType.class);
    }


    public static class TradeStatus {
        public static final CommonConstantInfo FAIL = new CommonConstantInfo(0, "交易失败");
        public static final CommonConstantInfo SUCCESS = new CommonConstantInfo(1, "交易成功");
        public static final CommonConstantInfo FREEZE = new CommonConstantInfo(2, "冻结");
        public static final CommonConstantInfo CANCEL = new CommonConstantInfo(3, "取消");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(TradeStatus.class);
    }

    public static final class AccountDetailStatus {
        /**
         * 财务状态-撤销
         */
        public static final byte CANCEL = 3;

        /**
         * 财务状态-冻结
         */
        public static final byte FREEZE = 2;

        /**
         * 财务状态-到账
         */
        public static final byte DONE = 1;

//        @ApiModelProperty(example = "0-审核中，1-已到账，2-已拒绝")

        public static Byte getStatus(byte detailStatus) {
            if (detailStatus == 3) {
                return 2;
            }
            if (detailStatus == 2) {
                return 0;
            }
            if (detailStatus == 1) {
                return 1;
            }
            return 1;
        }
    }

    public static class AmountTransferType {
        public static final CommonConstantInfo TRANSFER_IN = new CommonConstantInfo(1, "转入");
        public static final CommonConstantInfo TRANSFER_OUT = new CommonConstantInfo(2, "转出");
    }


    public static class StatusColor {
        public static final byte WHITE = 0;
        public static final byte BLUE = 1;
        public static final byte GRAY = 2;
        public static final byte RED = 3;
        public static final byte BLACK = 4;
    }


    public static class Sort {
        public static final Byte DESC = 1;
        public static final Byte ASC = 0;
    }


    public static final class PaymentType {
        public static final byte EXPENSE = -1;
        public static final byte INCOME = 1;
        public static final byte ONLY_RECORD = 0;
    }

    public static class Verify {
        public static final CommonConstantInfo STATUS_ING = new CommonConstantInfo(0, "审核中");
        public static final CommonConstantInfo STATUS_SUCCESS = new CommonConstantInfo(1, "审核通过");
        public static final CommonConstantInfo STATUS_FAIL = new CommonConstantInfo(2, "审核不通过");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(Verify.class);
    }

    public static class OpenStatus {
        public static final CommonConstantInfo STATUS_BETING = new CommonConstantInfo(0, "下注");
        public static final CommonConstantInfo STATUS_CLOSE = new CommonConstantInfo(1, "封盘");
        public static final CommonConstantInfo STATUS_LOTTERYING = new CommonConstantInfo(2, "开奖中");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(OpenStatus.class);
    }

    public static class WinStatus {
        public static final CommonConstantInfo WIN = new CommonConstantInfo(0, "输");
        public static final CommonConstantInfo LOSE = new CommonConstantInfo(1, "赢");
        public static final CommonConstantInfo TIE = new CommonConstantInfo(2, "打和");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(WinStatus.class);
    }

    public static class CountWinStatus {
        public static final CommonConstantInfo LOSE = new CommonConstantInfo(0, "输");
        public static final CommonConstantInfo FIRST_ODDS_WIN = new CommonConstantInfo(1, "第一赔率赢");
        public static final CommonConstantInfo SECOND_ODDS_WIN = new CommonConstantInfo(2, "第二赔率赢");
        public static final CommonConstantInfo TIE = new CommonConstantInfo(3, "打和");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(CountWinStatus.class);
    }

    public static class BetRecordStatus {
        public static final CommonConstantInfo STATUS_ING = new CommonConstantInfo(0, "待结算");
        public static final CommonConstantInfo STATUS_SUCCESS = new CommonConstantInfo(1, "结算成功");
        public static final CommonConstantInfo STATUS_FAIL = new CommonConstantInfo(2, "结算失败");
        public static final CommonConstantInfo STATUS_CANCEL = new CommonConstantInfo(3, "已撤单");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(BetRecordStatus.class);
    }


    public static class LotteryStatus {
        public static final CommonConstantInfo LOTTERY_ING = new CommonConstantInfo(0, "开奖中");
        public static final CommonConstantInfo LOTTERY_COMPLETE = new CommonConstantInfo(1, "开奖完成");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(LotteryStatus.class);
    }

    /**
     * 撤单类型，1-个人撤单，2-系统撤单，3-系统管理员撤单
     */
    public static class CancelType {
        public static final CommonConstantInfo PERSONAL_CANCELLATION = new CommonConstantInfo(1, "个人撤单");
        public static final CommonConstantInfo SYSTEM_CANCELLATION = new CommonConstantInfo(2, "系统撤单");
        public static final CommonConstantInfo SYSTEM_ADMIN_CANCELLATION = new CommonConstantInfo(3, "系统管理员撤单");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(CancelType.class);
    }


    public static class LotteryCode {
        public static final CommonKVString FKLHC = new CommonKVString("FK", "疯狂六合彩");
    }


    public static class PlayTypeCode {
        public static final CommonConstantInfo TE_MA = new CommonConstantInfo(1, "特码");
        public static final CommonConstantInfo ZHENG_MA = new CommonConstantInfo(2, "正码");
        public static final CommonConstantInfo ZHENG_MA_1_6 = new CommonConstantInfo(3, "正码1-6");
        public static final CommonConstantInfo ZHENG_TE = new CommonConstantInfo(4, "正特");
        public static final CommonConstantInfo LIAN_MA = new CommonConstantInfo(5, "连码");
        public static final CommonConstantInfo BAN_BO = new CommonConstantInfo(6, "半波");
        public static final CommonConstantInfo WEI_SHU = new CommonConstantInfo(7, "尾数");
        public static final CommonConstantInfo BU_ZHONG = new CommonConstantInfo(8, "不中");
        public static final CommonConstantInfo YI_XIAO = new CommonConstantInfo(9, "一肖");
        public static final CommonConstantInfo TE_XIAO = new CommonConstantInfo(10, "特肖");
        public static final CommonConstantInfo LIU_XIAO = new CommonConstantInfo(11, "六肖");
        public static final CommonConstantInfo LIAN_XIAO = new CommonConstantInfo(12, "连肖");
        public static final CommonConstantInfo LIAN_WEI = new CommonConstantInfo(13, "连尾");
        public static final CommonConstantInfo LONG_HU_1_6 = new CommonConstantInfo(14, "1-6龙虎");
        public static final CommonConstantInfo ZONG_XIAO = new CommonConstantInfo(15, "总肖");
        public static final CommonConstantInfo ZONG_HE = new CommonConstantInfo(16, "总和");
        public static final CommonConstantInfo ZI_XUAN = new CommonConstantInfo(17, "自选");
        public static final CommonConstantInfo HE_XIAO = new CommonConstantInfo(18, "合肖");
        public static final CommonConstantInfo LONG_HU = new CommonConstantInfo(19, "龙虎");
        public static final CommonConstantInfo DING_WEI_DAN = new CommonConstantInfo(20, "定位胆");
        public static final CommonConstantInfo DA_XIAO_DAN_SHUANG = new CommonConstantInfo(21, "大小单双");
        public static final CommonConstantInfo CAI_GUAN_YA_JUN = new CommonConstantInfo(22, "猜冠亚军");
        public static final CommonConstantInfo CAI_QIAN_SAN_MING = new CommonConstantInfo(23, "猜前三名");
        public static final CommonConstantInfo CAI_QIAN_SI_MING = new CommonConstantInfo(24, "猜前四名");
        public static final CommonConstantInfo CAI_QIAN_WU_MING = new CommonConstantInfo(25, "猜前五名");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(PlayTypeCode.class);
    }

    public static class PlayTypeDetailType {
        public static final CommonConstantInfo HAO_MA = new CommonConstantInfo(1, "号码");
        public static final CommonConstantInfo HAO_DUAN = new CommonConstantInfo(2, "号段");
        public static final CommonConstantInfo DA_XIAO = new CommonConstantInfo(3, "大小");
        public static final CommonConstantInfo ZHENG_TE = new CommonConstantInfo(4, "单双");
        public static final CommonConstantInfo JIA_YE = new CommonConstantInfo(5, "家野");
        public static final CommonConstantInfo WEI_SHU_DA_XIAO = new CommonConstantInfo(6, "尾数大小");
        public static final CommonConstantInfo BO_SE = new CommonConstantInfo(7, "波色");
        public static final CommonConstantInfo LONG_HU = new CommonConstantInfo(8, "龙虎");
        public static final CommonConstantInfo SHENG_XIAO = new CommonConstantInfo(9, "生肖");
        public static final CommonConstantInfo WEI_SHU = new CommonConstantInfo(10, "尾数");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(PlayTypeDetailType.class);
    }


    public static class BetLimitAmountType {
        public static final CommonConstantInfo TE_MA = new CommonConstantInfo(1, "特码");
        public static final CommonConstantInfo DAN_SHUANG = new CommonConstantInfo(2, "单双");
        public static final CommonConstantInfo DA_XIAO = new CommonConstantInfo(3, "大小");
        public static final CommonConstantInfo HE_SHU_DAN_SHUANG = new CommonConstantInfo(4, "合数单双");
        public static final CommonConstantInfo ZHENG_TE = new CommonConstantInfo(5, "正特");
        public static final CommonConstantInfo ZHENG_MA = new CommonConstantInfo(6, "正码");
        public static final CommonConstantInfo ZONG_HE_DAN_SHUANG = new CommonConstantInfo(7, "总和单双");
        public static final CommonConstantInfo ZONG_HE_DA_XIAO = new CommonConstantInfo(8, "总和大小");
        public static final CommonConstantInfo SE_BO = new CommonConstantInfo(9, "波色");
        public static final CommonConstantInfo BAN_BO = new CommonConstantInfo(10, "半波");
        public static final CommonConstantInfo ZHENG_MA_GUO_GUAN = new CommonConstantInfo(11, "正码过关");
        public static final CommonConstantInfo ER_QUAN_ZHONG = new CommonConstantInfo(12, "二全中");
        public static final CommonConstantInfo SAN_QUAN_ZHONG = new CommonConstantInfo(13, "三全中");
        public static final CommonConstantInfo SAN_ZHONG_ER = new CommonConstantInfo(14, "三中二");
        public static final CommonConstantInfo ER_ZHONG_TE = new CommonConstantInfo(15, "二中特");
        public static final CommonConstantInfo TE_CHUAN = new CommonConstantInfo(16, "特串");
        public static final CommonConstantInfo LIAN_XIAO = new CommonConstantInfo(17, "连肖");
        public static final CommonConstantInfo LIU_XIAO = new CommonConstantInfo(18, "六肖");
        public static final CommonConstantInfo YI_XIAO = new CommonConstantInfo(19, "一肖");
        public static final CommonConstantInfo WEI_SHU = new CommonConstantInfo(20, "尾数");
        public static final CommonConstantInfo JIA_QIN_YE_SHOU = new CommonConstantInfo(21, "家禽野兽");
        public static final CommonConstantInfo WEI_DA_WEI_XIAO = new CommonConstantInfo(22, "尾大尾小");
        public static final CommonConstantInfo TE_XIAO = new CommonConstantInfo(23, "特肖");
        public static final CommonConstantInfo BU_ZHONG = new CommonConstantInfo(24, "不中");
        public static final CommonConstantInfo LIAN_WEI = new CommonConstantInfo(25, "连尾");
        public static final CommonConstantInfo LONG_HU = new CommonConstantInfo(26, "龙虎");
        public static final CommonConstantInfo TE_MA_FEN_DUAN = new CommonConstantInfo(27, "特码分段");
        public static final CommonConstantInfo ZHENG_1_6_LONG_HU = new CommonConstantInfo(28, "正1-6龙虎");
        public static final CommonConstantInfo ZONG_HE_WEI_DA_XIAO = new CommonConstantInfo(29, "总和尾大小");
        public static final CommonConstantInfo HE_SHU_DA_XIAO = new CommonConstantInfo(30, "合数大小");
        public static final CommonConstantInfo HE_XIAO = new CommonConstantInfo(31, "合肖");
        public static final CommonConstantInfo WU_XING = new CommonConstantInfo(32, "五行");
        public static final CommonConstantInfo ZHENG_XIAO = new CommonConstantInfo(33, "正肖");
        public static final CommonConstantInfo QI_SE_BO = new CommonConstantInfo(34, "七色波");
        public static final CommonConstantInfo SI_QUAN_ZHONG = new CommonConstantInfo(35, "四全中");
        public static final CommonConstantInfo ZONG_XIAO = new CommonConstantInfo(36, "总肖");
        public static final CommonConstantInfo ZONG_HE = new CommonConstantInfo(37, "总和");
        public static final CommonConstantInfo ZI_XUAN = new CommonConstantInfo(38, "自选");
        public static final CommonConstantInfo DING_WEI_DAN = new CommonConstantInfo(39, "定位胆");
        public static final CommonConstantInfo DA_XIAO_DAN_SHUANG = new CommonConstantInfo(40, "大小单双");
        public static final CommonConstantInfo CAI_GUAN_YA_JUN = new CommonConstantInfo(41, "猜冠亚军");
        public static final CommonConstantInfo CAI_QIAN_SAN_MING = new CommonConstantInfo(42, "猜前三名");
        public static final CommonConstantInfo CAI_QIAN_SI_MING = new CommonConstantInfo(43, "猜前四名");
        public static final CommonConstantInfo CAI_QIAN_WU_MING = new CommonConstantInfo(44, "猜前五名");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(BetLimitAmountType.class);
    }


    public static class BetLimitCode {
        public static final CommonKVString DEFAULT = new CommonKVString("0", "默认");
        public static final CommonKVString TE_MA = new CommonKVString("1", "特码");
        public static final CommonKVString ZHENG_MA = new CommonKVString("2", "正码");
        public static final CommonKVString ZHENG_TE = new CommonKVString("3", "正特");
        public static final CommonKVString SAN_QUAN_ZHONG = new CommonKVString("4", "三全中");
        public static final CommonKVString SAN_ZHONG_ER = new CommonKVString("5", "三中二");
        public static final CommonKVString ER_QUAN_ZHONG = new CommonKVString("6", "二全中");
        public static final CommonKVString ER_ZHONG_TE = new CommonKVString("7", "二中特");
        public static final CommonKVString TE_CHUAN = new CommonKVString("8", "特串");
        public static final CommonKVString WU_BU_ZHONG = new CommonKVString("9", "五不中");
        public static final CommonKVString LIU_BU_ZHONG = new CommonKVString("10", "六不中");
        public static final CommonKVString QI_BU_ZHONG = new CommonKVString("11", "七不中");
        public static final CommonKVString BA_BU_ZHONG = new CommonKVString("12", "八不中");
        public static final CommonKVString JIU_BU_ZHONG = new CommonKVString("13", "九不中");
        public static final CommonKVString SHI_BU_ZHONG = new CommonKVString("14", "十不中");
        public static final CommonKVString LIU_XIAO_LIAN_ZHONG = new CommonKVString("15", "六肖中");
        public static final CommonKVString LIU_XIAO_LIAN_BU_ZHONG = new CommonKVString("16", "六肖不中");
        public static final CommonKVString ER_LIAN_XIAO_ZHONG = new CommonKVString("17", "二连肖(中)");
        public static final CommonKVString ER_LIAN_XIAO_BU_ZHONG = new CommonKVString("18", "二连肖(不中)");
        public static final CommonKVString SAN_LIAN_XIAO_ZHONG = new CommonKVString("19", "三连肖(中)");
        public static final CommonKVString SAN_LIAN_XIAO_BU_ZHONG = new CommonKVString("20", "三连肖(不中)");
        public static final CommonKVString SI_LIAN_XIAO_ZHONG = new CommonKVString("21", "四连肖(中)");
        public static final CommonKVString SI_LIAN_XIAO_BU_ZHONG = new CommonKVString("22", "四连肖(不中)");
        public static final CommonKVString ER_LIAN_WEI_ZHONG = new CommonKVString("23", "二连尾(中)");
        public static final CommonKVString ER_LIAN_WEI_BU_ZHONG = new CommonKVString("24", "二连尾(不中)");
        public static final CommonKVString SAN_LIAN_WEI_ZHONG = new CommonKVString("25", "三连尾(中)");
        public static final CommonKVString SAN_LIAN_WEI_BU_ZHONG = new CommonKVString("26", "三连尾(不中)");
        public static final CommonKVString SI_LIAN_WEI_ZHONG = new CommonKVString("27", "四连尾(中)");
        public static final CommonKVString SI_LIAN_WEI_BU_ZHONG = new CommonKVString("28", "四连尾(不中)");
        public static final CommonKVString LONG = new CommonKVString("29", "龙");
        public static final CommonKVString HU = new CommonKVString("30", "虎");
        public static final CommonKVString HE_XIAO = new CommonKVString("31", "虎");
        public static final CommonKVString WU_LIAN_XIAO_ZHONG = new CommonKVString("32", "五连肖(中)");
        public static final CommonKVString WU_LIAN_XIAO_BU_ZHONG = new CommonKVString("33", "五连肖(不中)");
        public static final CommonKVString WU_LIAN_WEI_ZHONG = new CommonKVString("34", "五连尾(中)");
        public static final CommonKVString WU_LIAN_WEI_BU_ZHONG = new CommonKVString("35", "五连尾(不中)");
        public static final CommonKVString SI_QUAN_ZHONG = new CommonKVString("36", "四全中");
        public static final CommonKVString CAI_GUAN_YA_JUN = new CommonKVString("37", "猜冠亚军");
        public static final CommonKVString CAI_QIAN_SAN_MING = new CommonKVString("38", "猜前三名");
        public static final CommonKVString CAI_QIAN_SI_MING = new CommonKVString("39", "猜前四名");
        public static final CommonKVString CAI_QIAN_WU_MING = new CommonKVString("40", "猜前五名");
        public static final Map<String, String> map = BaseCommonKVStringClassUtil.getMap(BetLimitCode.class);
    }


    public static class PlayTypeItemCode {
        public static final CommonConstantInfo ZHENG_1_TE = new CommonConstantInfo(1, "正1特");
        public static final CommonConstantInfo ZHENG_2_TE = new CommonConstantInfo(2, "正2特");
        public static final CommonConstantInfo ZHENG_3_TE = new CommonConstantInfo(3, "正3特");
        public static final CommonConstantInfo ZHENG_4_TE = new CommonConstantInfo(4, "正4特");
        public static final CommonConstantInfo ZHENG_5_TE = new CommonConstantInfo(5, "正5特");
        public static final CommonConstantInfo ZHENG_6_TE = new CommonConstantInfo(6, "正6特");
        public static final CommonConstantInfo SAN_QUAN_ZHONG = new CommonConstantInfo(7, "三全中");
        public static final CommonConstantInfo SAN_ZHONG_ER = new CommonConstantInfo(8, "三中二");
        public static final CommonConstantInfo ER_QUAN_ZHONG = new CommonConstantInfo(9, "二全中");
        public static final CommonConstantInfo ER_ZHONG_TE = new CommonConstantInfo(10, "二中特");
        public static final CommonConstantInfo TE_CHUAN = new CommonConstantInfo(11, "特串");
        public static final CommonConstantInfo HONG_BO = new CommonConstantInfo(12, "红波");
        public static final CommonConstantInfo LAN_BO = new CommonConstantInfo(13, "蓝波");
        public static final CommonConstantInfo LV_BO = new CommonConstantInfo(14, "绿波");
        public static final CommonConstantInfo WU_BU_ZHONG = new CommonConstantInfo(15, "五不中");
        public static final CommonConstantInfo LIU_BU_ZHONG = new CommonConstantInfo(16, "六不中");
        public static final CommonConstantInfo QI_BU_ZHONG = new CommonConstantInfo(17, "七不中");
        public static final CommonConstantInfo BA_BU_ZHONG = new CommonConstantInfo(18, "八不中");
        public static final CommonConstantInfo JIU_BU_ZHONG = new CommonConstantInfo(19, "九不中");
        public static final CommonConstantInfo SHI_BU_ZHONG = new CommonConstantInfo(20, "十不中");
        public static final CommonConstantInfo LIU_XIAO_LIAN_ZHONG = new CommonConstantInfo(21, "六肖中");
        public static final CommonConstantInfo LIU_XIAO_LIAN_BU_ZHONG = new CommonConstantInfo(22, "六肖不中");
        public static final CommonConstantInfo ER_LIAN_XIAO_ZHONG = new CommonConstantInfo(23, "二连肖(中)");
        public static final CommonConstantInfo ER_LIAN_XIAO_BU_ZHONG = new CommonConstantInfo(24, "二连肖(不中)");
        public static final CommonConstantInfo SAN_LIAN_XIAO_ZHONG = new CommonConstantInfo(25, "三连肖(中)");
        public static final CommonConstantInfo SAN_LIAN_XIAO_BU_ZHONG = new CommonConstantInfo(26, "三连肖(不中)");
        public static final CommonConstantInfo SI_LIAN_XIAO_ZHONG = new CommonConstantInfo(27, "四连肖(中)");
        public static final CommonConstantInfo SI_LIAN_XIAO_BU_ZHONG = new CommonConstantInfo(28, "四连肖(不中)");
        public static final CommonConstantInfo ER_LIAN_WEI_ZHONG = new CommonConstantInfo(29, "二连尾(中)");
        public static final CommonConstantInfo ER_LIAN_WEI_BU_ZHONG = new CommonConstantInfo(30, "二连尾(不中)");
        public static final CommonConstantInfo SAN_LIAN_WEI_ZHONG = new CommonConstantInfo(31, "三连尾(中)");
        public static final CommonConstantInfo SAN_LIAN_WEI_BU_ZHONG = new CommonConstantInfo(32, "三连尾(不中)");
        public static final CommonConstantInfo SI_LIAN_WEI_ZHONG = new CommonConstantInfo(33, "四连尾(中)");
        public static final CommonConstantInfo SI_LIAN_WEI_BU_ZHONG = new CommonConstantInfo(34, "四连尾(不中)");
        public static final CommonConstantInfo LONG = new CommonConstantInfo(35, "龙");
        public static final CommonConstantInfo HU = new CommonConstantInfo(36, "虎");
        public static final CommonConstantInfo WU_LIAN_XIAO_ZHONG = new CommonConstantInfo(37, "五连肖(中)");
        public static final CommonConstantInfo WU_LIAN_XIAO_BU_ZHONG = new CommonConstantInfo(38, "五连肖(不中)");
        public static final CommonConstantInfo WU_LIAN_WEI_ZHONG = new CommonConstantInfo(39, "五连尾(中)");
        public static final CommonConstantInfo WU_LIAN_WEI_BU_ZHONG = new CommonConstantInfo(40, "五连尾(不中)");
        public static final CommonConstantInfo SI_QUAN_ZHONG = new CommonConstantInfo(41, "四全中");
        public static final CommonConstantInfo GUAN_JUN = new CommonConstantInfo(42, "冠军");
        public static final CommonConstantInfo YA_JUN = new CommonConstantInfo(43, "亚军");
        public static final CommonConstantInfo JI_JUN = new CommonConstantInfo(44, "季军");
        public static final CommonConstantInfo DI_SI_MING = new CommonConstantInfo(45, "第四名");
        public static final CommonConstantInfo DI_WU_MING = new CommonConstantInfo(46, "第五名");
        public static final CommonConstantInfo DI_LIU_MING = new CommonConstantInfo(47, "第六名");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(PlayTypeItemCode.class);
    }

    public static class BetRecordTimeType {
        public static final byte BET_TIME = 1;
        public static final byte COUNT_TIME = 2;
    }


    public static class NoticeType {
        public static final byte ADMIN = 1;
        public static final byte USER = 2;
        public static final byte INDEX = 3;
        public static final byte COMMUNICATE = 4;
        public static final byte CHAT = 5;
    }

    public static class OsType {
        public static final byte ANDROID = 1;
        public static final byte IOS = 2;
        public static final byte H5 = 3;
    }

    public static class UserType {
        public static final byte TYPE_APP = 1;//真实用户
        public static final byte TYPE_AUTO = 2;//虚拟用户
        public static final byte TYPE_TEST = 3;//测试用户
    }


    public static class CancelOrderLimitType {
        public static final CommonConstantInfo BEFORE_CLOSE = new CommonConstantInfo(1, "封盘前");
        public static final CommonConstantInfo AFTER_BET = new CommonConstantInfo(2, "下注后");
    }


    public static class ReportStatType {
        public static final CommonConstantInfo BY_DATE = new CommonConstantInfo(1, "按日期");
        public static final CommonConstantInfo BY_ISSUENO = new CommonConstantInfo(2, "按期数");
    }


    public static class ReportType {
        public static final CommonConstantInfo SETTLEMENT_REPORT = new CommonConstantInfo(1, "交收报表");
        public static final CommonConstantInfo CLASSIFICATION_REPORT = new CommonConstantInfo(2, "分类报表");
    }


    public static class BetRecordCountStatus {
        public static final CommonConstantInfo STATUS_WAIT = new CommonConstantInfo(0, "待结算");
        public static final CommonConstantInfo STATUS_ING = new CommonConstantInfo(1, "结算中");
        public static final CommonConstantInfo STATUS_SUCCESS = new CommonConstantInfo(2, "结算完成");
        public static final Map<Byte, String> map = BaseConstantClassUtil.getMap(BetRecordCountStatus.class);
    }


    public static class MessageType {
        public static final CommonConstantInfo CONNECT_NOTICE = new CommonConstantInfo(1, "连接通知");
        public static final CommonConstantInfo LOTTERY_VIDEO_NOTICE = new CommonConstantInfo(2, "开奖直播通知");
        public static final CommonConstantInfo REFRESH_CONFIGURATION_VAR_NOTICE = new CommonConstantInfo(3, "系统参数变更通知");
        public static final CommonConstantInfo LOTTERY_CLOSE_NOTICE = new CommonConstantInfo(4, "封盘通知");
        public static final CommonConstantInfo LOTTERY_PREPARE_NOTICE = new CommonConstantInfo(5, "准备开奖通知");
        public static final CommonConstantInfo LOTTERY_COMPLETE_NOTICE = new CommonConstantInfo(6, "开奖结束通知");
        public static final CommonConstantInfo LOTTERY_PUSH_NOTICE = new CommonConstantInfo(7, "开奖结果通知");
        public static final CommonConstantInfo LOTTERY_COUNT_NOTICE = new CommonConstantInfo(8, "开奖结算通知");
        public static final CommonConstantInfo LOTTERY_CONTROL_NOTICE = new CommonConstantInfo(9, "控奖通知");
        public static final CommonConstantInfo ACTIVITY_SPECIAL_NUMBER_NOTICE = new CommonConstantInfo(10, "活动特码通知");
        public static final CommonConstantInfo PRIZE_NOTICE = new CommonConstantInfo(11, "爆奖通知");
        public static final CommonConstantInfo PRIZE_RESULT_NOTICE = new CommonConstantInfo(12, "爆奖结果通知");
        public static final CommonConstantInfo VIRTUAL_ORDER_NOTICE = new CommonConstantInfo(13, "虚拟注单通知");
        public static final CommonConstantInfo PRIZE_TASK_NOTICE = new CommonConstantInfo(14, "爆奖任务通知");
        public static final CommonConstantInfo PRIZE_TASK_EDIT_NOTICE = new CommonConstantInfo(15, "爆奖任务编辑通知");
        public static final CommonConstantInfo PRIZE_TASK_DELETE_NOTICE = new CommonConstantInfo(16, "爆奖任务删除通知");
        public static final CommonConstantInfo USER_ONLINE_NOTICE = new CommonConstantInfo(17, "用户上线通知");
    }

    public static class WinRateConfigType {
        public static final CommonConstantInfo FULL_CONTROL = new CommonConstantInfo(1, "全部控制");
        public static final CommonConstantInfo SINGLE_CONTROL = new CommonConstantInfo(2, "单个控制");
    }

    public static final class LotteryType {
        public static final byte LHC = 1;
        public static final byte DWC = 2;
        public static final byte SZC = 3;
    }


    public static class TaskExecuteType {
        public static final byte IMMEDIATELY = 1;
        public static final byte SCHEDULED = 2;
    }

    public static class TaskExecStatus {
        public static final byte STATUS_WAIT = 0;
        public static final byte STATUS_ING = 1;
        public static final byte STATUS_SUCCESS = 2;
        public static final byte STATUS_FAIL = 3;
    }

    public static final class LotteryPrizeTargetUserType {
        public static final byte ALL = 1;
        public static final byte SPECIFY = 2;
        public static final byte WIN = 3;
        public static final byte LOSE = 4;
        public static final byte BET = 5;
    }

    public static void main(String[] args) {

    }

}
