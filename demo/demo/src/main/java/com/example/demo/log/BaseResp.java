package com.example.demo.log;


public class BaseResp<T> {


    private String code;

    private String message;

    private T data;

    private String total;

    public static <T> BaseResp<T> build() {
        BaseResp<T> baseResp = new BaseResp<T>();
        return baseResp;
    }

    public BaseResp setCode(String code) {
        this.code = code;
        return this;
    }

    public BaseResp setMessage(String message) {
        this.message = message;
        return this;
    }

    public BaseResp setData(T data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return "00".equals(this.code);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public String getTotal() {
        return total;
    }

    public BaseResp setTotal(String total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "BaseResp [code=" + code + ", message=" + message + ", data=" + data + ", total=" + total + "]";
    }


}
