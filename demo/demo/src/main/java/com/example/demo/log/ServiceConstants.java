package com.example.demo.log;


public final class ServiceConstants {

    /**
     * 熔断
     */
    public static final String SUCCESS = "SUCCESS";
    public static final String HYSTRIX_RES_CODE = "01";
    public static final String EXCEPTION_RES_CODE = "02";

    public static final String HYSTRIX_RES_MESSAGE = "服务器通讯异常!";
    public static final String EXCEPTION_RES_MESSAGE = "系统异常!";

    public static final String RES_SUCCESS_CODE = "00";
    public static final String RES_SUCCESS_MESSAGE = "操作成功";

    public static final String RES_SYSTEM_ERROR_CODE = "0102";        //系统异常
    public static final String RES_lOGIN_USER_FAIL = "0103";        //用户未登录


    /**
     * 格式类型
     */
    public static final String FORMAT = "JSON";
    /**
     * 编码格式
     */
    public static final String CHARSET = "UTF-8";
    /**
     * 算法类型
     */
    public static final String SIGN_TYPE = "RSA2";
    /**
     * 调用的接口版本
     */
    public static final String VERSION = "1.0";


    /**
     * 畅捷私钥
     */
    public static final String CHANJET_PRIVATE_KEY = "chanjet_private";

    /**
     * 数据库批量插入最大条数
     */
    public static final Integer MAX_DB_INSERT_COUNT = 200;

    /**
     * 代付最大查询笔数
     */
    public static final Integer REMIT_BY_FLOW_QUERY_NUM = 100;

    /**
     * DELAY_ONE_MINUTE
     */
    public static final long DELAY_ONE_MINUTE = 60 * 1000;

    public static final long DELAY_EXPIRE_TIME = 24 * 60 * 60 * 1000 - 1;


    /**
     * 对私账户，
     * 在实际应用场景中是没有联行号一说的。
     * 鉴于小微对bankCode参数必传的校验，应用层可以传固定值：12个9
     */
    public static final String MERCH_IN_ADD_BANK_CODE = "999999999999";

    /**
     * 支付结果，异步通知支付结果：
     * 0:支付成功；
     * 1:已撤销；
     * 2:已冲正；
     * 3:已调账；
     * 4:待支付状态；
     * 5:已关闭；
     * 6:部分退款；
     * 7:全部退款；
     * 8:转入退款；
     * 9:用户支付中；
     * 10:支付失败；
     * 11:交易失败
     */
    public static final String PAY_RESULT_SUCCESS = "0";


    /**
     * 默认货币单位
     */
    public static final String DEFAULT_CURRENCY_CODE = "CNY";
}
