package com.example.demo.log;

import io.micrometer.core.instrument.util.StringUtils;

/**
 * <p>
 * 基础服务错误枚举规则<br>
 * 01 01 0001<br>
 * 01 基础工程服务<br>
 * 00 系统  01 用户 02 交易 03 其它<br>
 * 0001 错误序号<br>
 * </p>
 *
 * @author tinn
 */
public enum BasicExceptionEnum {

    /* 01000001   00 系统*/
    SIGN_ERROR("01000001", "加签异常"),
    VERIFY_SIGN_FAIL("01000002", "验签失败"),
    TYPE_CONVERSION_ERROR("01000003", "类型转换异常"),
    ENCRYPTION_DECRYPTION_ERROR("01000004", "加解密异常"),
    RESPONSE_IS_NULL_FAIL("01000005", "回调通知结果为NULL"),
    SYSTEM_UNKNOWN_FAIL("01000006", "系统异常:交易状态未知"),
    CORE_PLATFORMS_YSTEM_UNKNOWN("01000007", "核心平台系统异常"),
    MERCHANT_CREATE_FAIL("01000008", "商户入网失败"),
    MERCHANT_INFO_QUERY_FAIl("01000009", "商户申请状态查询失败"),


    /* 01010001   01 用户*/
    LOGIN_NAME_NOT_NULL("01010001", "用户名不能为空"),
    QUERY_MERCHANT_SIMPLE_INFO_FAIL("01010002", "获取商户简单信息失败"),
    QUERY_FAIL("01010003", "查询失败"),
    NO_QUERY_RESULT("01010004", "无查询结果"),
    ARGUMENT_ERROR("01010005", "参数错误"),
    MERCHANT_KEY_EXIST("01010006", "商户密钥已存在"),
    MERCHANT_KEY_NOT_EXIST("01010007", "商户密钥不存在"),
    MERCHAT_NOT_SUB_AGENT("01010008", "服务商和商户不匹配"),
    ENTERPRISE_LICENSE_NO_VALID_FAIL("01010009", "企业统一社会信⽤代码不匹配!"),
    ENTERPRISE_LEGAL_NAME_VALID_FAIL("01010010", "企业法人姓名不匹配!"),
    ENTERPRISE_COMPANY_NAME_NO_QUERY_RESULT("01010011", "该企业商户名称不存在!"),
    BANK_CARD_TYPE_NOT_SUPPORT_ERROR("01010012", "不支持该银行卡!"),
    TERMINAL_SERIAL_NUMBER("01010013", "终端序列号不能未空!"),
    QUERY_MERCHANT_INFO_FAIL("01010014","获取基本商户信息失败!"),


    /* 01020001   02 交易*/
    MERCHANT_ORDER_NO_REPEAT("01020001", "该商户订单交易号已重复"),
    REMIT_BY_FLOW_PAY_REPEAT("01020002", "操作失败,请勿重复清算!"),
    NOTIFY_MERCH_ORDER_NOT_EXIST("01020003", "通知商户的原始交易记录不存在!"),
    ERROR_MERCHAID("01020004", "基础产品编码与原交易不一致或该商户下没有该笔订单"),
    STATUS_IS_NOT_OPER("01020005", "当前状态不可操作!"),
    SETTAMOUNT_LESS_THAN_ZERO_OR_NULL("01020006", "生成电子回单失败到账金额不能为空或者不能小于0!"),
    ELECTRONIC_RECEIPT_EXIST("01020007", "电子回单已存在!"),
    MERCHANT_NO_NOT_EXIST("01020008", "商户号不存在"),
    MERCHANT_NOTIFY_FLOW_ID_NOT_EXIST("01020009", "商户通知流水ID不存在!"),
    ORDER_NOT_EXIST("01020010", "该笔订单不存在!"),
    PAID_STATUS_VALID_FAIL("01020011", "该笔订单未成功完成！"),
    CONVERT_BASE64_FAIL("01020012", "文件转换Base64失败!"),
    ERROR_NAME("01020013", "收款人账号和收款人名称不一致"),
    ERROR_MERCHID("01020014", "收款人商户号不存在"),
    GET_HOLIDAY_FAIL("01020015", "获取节假日数据失败"),
    PRODUCT_CODE_IS_NULL("01020016", "营销产品编码不能为空!"),
    FUNCTION_CODE_IS_NULL("01020017", "基础产品编码不能为空!"),
    PARAMETER_IS_NULL("01020018", "参数校验未通过:[账户类型为对公时收款人开户支行联行号或收款人开户支行名称不能为空]"),
    PROVINCE_IS_NULL("01020019", "参数校验未通过:[账户类型为对公时收款人开户支行所在省份编码和名称不能为空]"),
    CITY_IS_NULL("01020020", "参数校验未通过:[账户类型为对公时收款人开户支行所在城市编码和名称不能为空]"),
    ORIG_ORDER_STATUE_PAY_FAIL("01020021", "原交易状态不允许发起退款!"),
    QUERY_TERM_KEY_NOT_RESULT("01020022", "获取的终端密钥信息不存在!"),
    MERCHANT_UNAVAILABLE("01020023", "该商户状态已失效或已注销"),
    MERCHANT_NOT_PROVIDER("01020024", "该商户和服务商不存在所属关系"),
    TRADE_DETAILED_IS_NULL("01020025", "交易明细为空值"),
    RNN_IS_NULL("01020026", "交明细参考号为空"),
    TRANS_DATE_IS_NULL("01020027", "交易明细交易时间为空"),
    GROUPCODE_IS_NULL("01020028", "交易明细分组号为空"),
    ORG_MERCHANT_ORDER_NO_NOT_EXIST("01020029", "该笔交易的原交易订单号不存在!"),
    NO_RESULT("01020030", "未查到原始交易记录"),
    NOT_REPEAT_SEND_REFUND("01020031", "你已发起退款，请勿重复操作!"),
    NO_REPEAT_ORDER_NO_AND_ORG_NO("01020032", "原交易订单号和退款单号不能相同!"),
    NO_REPEAT_ORDER_NO("01020033", "该退款订单号已重复，请重新生成!"),
    MERCHANT_ORDER_NO_NOT_EXIST("01020034", "该商户订单号不存在!"),
    QUERY_THANSFER_DETAIL_IS_NULL("01020035", "查询转账明细失败"),
    SEND_ALL_REFUND("01020036", "该交易订单已全额退款!"),
    QUERY_GATEWAY_PAY_DETAI_IS_NULLL("01020037", "网关充值交易记录不存在"),
    WITHDRAW_DEPOSIT_TRANS_IS_EXIST("01020038", "操作失败,请勿重复提现!"),
    PAYMENT_TRANS_IS_EXIST("01020039", "操作失败,请勿重复代付!"),
    PAYMENT_TRANS_IS_NOT_EXIST("01020040", "操作失败,代付记录不存在!"),
    RETURN_DATA_IS_NULL("01020041", "接口返回数据为空!"),
    REFUND_AMOUNT_NOT_VARY("01020042", "本次退款金额和上次失败退款交易金额不一致"),
    REFUND_ORDER_ON_THE_WAY("01020043", "你已存在一笔在途退款订单,请稍后再试!"),
    REFUND_TOTAL_AMOUNT_NOT_DIFF("01020044", "退款总金额与原交易总金额不一致"),
    REFUND_TOTAL_AMOUNT_NOT_EQUAL("01020045", "退款总金额不能大于未退款总金额!"),
    REFUND_TOTAL_AMOUNT_NOT_LESS_THAN("01020046", "退款总金额不能小于原交易总金额"),
    REFUND_AMOUNT_NOT_EQUAL("01020047", "退款金额不能大于未退款总金额!"),
    REFUND_AMOUNT_NOT_LESS_THAN("01020048", "退款金额不能小于或等于0"),
    TRANSFER_FUNCTION_CODE_VALID_FAIL("01020049", "所输入的产品编码非转账基础产品编码!"),
    TRANSFER_TYPE_D0_VALID_FAIL("01020050", "请检查转账D0所对应的转账类型值!"),
    TRANSFER_TYPE_T1_VALID_FAIL("01020051", "请检查转账T1所对应的转账类型值!"),
    PAID_FUNCTION_CODE_VALID_FAIL("01020052", "所输入的产品编码非代付基础产品编码!"),
    PAID_TYPE_D0_VALID_FAIL("01020053", "请检查代付D0所对应的转账类型值!"),
    PAID_TYPE_D1_VALID_FAIL("01020054", "请检查代付D1所对应的转账类型值!"),
    PAID_TYPE_D1_FAIL("01020055", "请检查基础产品码是否正确!"),
    PAID_TYPE_T1_VALID_FAIL("01020056", "请检查代付T1所对应的转账类型值"),
    PRODUCT_CODE_VALID_FAIL("01020057", "营销产品编码校验失败!"),
    FUNCTION_CODE_NOT_EQUAL_ORIG_CODE("01020058", "基础产品编码与原交易不一致!"),
    TRANSFER_NO_QUERY_RESULT("01020059", "未查到具体的转账记录信息!"),
    PAID_NO_QUERY_RESULT("01020060", "未查到具体的代付记录信息"),
    REFUND_FUNCTION_CODE_NOT_EQUALS_ORIG_CODE("01020061", "退款基础产品码与原交易基础产品码不一致!"),
    ACCOUNT_QUERY_NO_RESULT("01020062", "未查到对应的账户信息"),
    ACCOUNT_EDIT_VALIDATE_G_FAIL("01020063", "对公类型 联行号不能为空！"),
    ACCOUNT_EDIT_VALIDATE_S_IDCARD_FAIL("01020064", "对私 身份证号不能为空!"),
    ACCOUNT_EDIT_VALIDATE_S_TEL_FAIL("01020065", "对私 预留手机号不能为空!"),
    ACCOUNT_EDIT_BANK_CODE_VALID_FAIL("01020066", "银行账号或卡号不能为空!"),
    ACCOUNT_EDIT_BANK_NAME_VALID_FAIL("01020067", "开户名称不能为空!"),
    TRADE_ERROR("01020068", "交易失败!"),
    PLAT_FROM_ORDER_NO("01020069", "畅捷订单号和原畅捷订单号不同!"),
    UPDATE_TERM_KEY_FAIL("01020070", "获取的终端密钥信息不存在!"),
    PRE_SIGN_NO("01020071", "商户订单号有误或请先预签约!"),
    PRE_SIGN_FAIL("01020072", "预签约失败，请重新预签约!"),
    SIGN_YES("01020073", "已签约成功！"),
    SIGN_SEQNO_FAIL("01020074", "预签约流水号错误!"),
    MERCHANT_WAIT_AUTH("01020075", "该商户还在等待审批!"),
    SALE_PRODUCT_FAIL("01020076", "获取查询商户开通的所有营销产品异常"),
    SIGNID_NO_SIGN("01020077", "当前协议号未签约！"),
    QUICK_PAY_NO_SIGN_INFO("01020078", "无签约信息！"),
    FUNCTION_CODE_NOT_MATCH_SIGN_BANK("01020079", "基础产品编码与签约银行不对应!"),
    SIGN_DATA_NOT_EXIST("01020080", "签约信息不存在!"),
    UNSIGN_STATUS_INCORRECT("01020081", "该卡号不是签约状态！"),
    MERCHANT_SEND_MSG_ERROR("01020082", "给商户发送入网成功结果短信、电子邮件失败！"),
    SEND_MSG_TYPE_NOT_SUPPORT("01020083", "该消息发送类型暂不支持!"),
    QRCODE_ALIPAY_BUYER_ID_AND_BUYER_LOGON_ID_IS_NULL("01020084", "买家支付宝账号和支付宝用户号不能同时为空"),
    QRCODE_BUYER_ID_IS_ERROR("01020085", "买家的支付宝唯一用户号（2088开头的16位纯数字）"),
    MERCHANT_INFO_SELECT_IS_NULL("01020086", "操作失败!查询商户基本信息为空。"),
    AGENT_INFO_SELECT_IS_NULL("01020087", "操作失败!查询服务商信息为空。"),
    MERCHANT_WALLET_SELECT_IS_NULL("01020088", "操作失败!查询商户钱包余额为空。"),
    QUERY_FORMWORK_NOT_INFO("01020089", "查询模板信息不存在!"),
    QUERY_FORMWORK_NUMBER_VALID("01020090", "费率模板数量已经超过九个,请删除之后再进行新建模板!"),
    MERCHANT_NOTIFY_IS_EXIST("01020091", "该商户通知请求已在处理,请勿重复操作!"),
    CARD_PAY_ORGIN_TRADE_NO_EXIST("01020092","原交易记录不存在!"),
    CARD_PAY_REVERSE_TRADE_NO_EXIST("01020093","原撤销记录不存在!"),
    PRE_AUTH_ORGIN_TRADE_NO_EXIST("01020094","原预授权记录不存在!"),
    PRE_AUTH_COMPLETE_ORGIN_TRADE_NO_EXIST("01020095","原预授权完成记录不存在!"),
    PRE_AUTH_COMPLETE_REVERSE_TRADE_NO_EXIST("01020096","预售权完成撤销记录不存在!"),
    MERCHAN_ORDER_TRADE_ALREADY_SUCCESS("01020097","该商户订单号已经交易成功!，不可再支付"),
    MERCHAN_ORDER_TRADE_ALREADY_PROCESSING("01020098","该商户订单号在处理中!，请稍等"),
    MERCHAN_ORDER_TRADE_ALREADY_VALIDATE("01020099","该商户订单号已经失效!，不可再支付，请重新下单"),
    MERCHAN_ORDER_TRADE_FLOW_ALREADY_SUCCESS("01020100","该笔订单号交易已支付成功"),
    ;


    private String value;
    private String key;

    BasicExceptionEnum(String index, String name) {
        this.key = index;
        this.value = name;
    }

    /**
     * 通过下标获得枚举
     *
     * @param key
     */
    public static BasicExceptionEnum getByKey(String key) {
        if (null == key) {
            return null;
        }
        for (BasicExceptionEnum at : BasicExceptionEnum.values()) {
            if (at.key.equals(key)) {
                return at;
            }
        }
        return null;
    }

    /**
     * 通过名称获得枚举
     *
     * @param value
     */
    public static BasicExceptionEnum getByValue(String value) {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        for (BasicExceptionEnum at : BasicExceptionEnum.values()) {
            if (at.value.equals(value)) {
                return at;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.key + ":" + this.value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
