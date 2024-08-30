package com.ruoyi.system.constants;

import com.light.core.model.CommonConstantInfo;
import com.light.core.utils.BaseConstantClassUtil;

import java.util.Map;

public class CommonConstant {

    public static final byte COMMON_STATUS_AVAILABLE = 1;

    public static final byte COMMON_STATUS_NOT_AVAILABLE = 0;

    public static final byte COMMON_STATUS_DELETE = -1;


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

    public static class Sort {
        public static final Byte DESC = 1;
        public static final Byte ASC = 0;
    }


    public static final class PaymentType {
        public static final byte EXPENSE = -1;
        public static final byte INCOME = 1;
        public static final byte ONLY_RECORD = 0;
    }

    public static void main(String[] args) {

    }

}
