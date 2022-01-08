package com.example.demo.log;

import java.io.Serializable;

/**
 * 基础返回消息对象
 *
 * @author warmsheep
 */
public class BaseResMessage<T> implements Serializable {

    private static final long serialVersionUID = -8589512716551567936L;

    private String code;        //状态码
    private String message;        //消息
    private T data;                //返回对象

    public BaseResMessage() {
    }

    public BaseResMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResMessage(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> BaseResMessage<T> build() {
        BaseResMessage<T> baseResMessage = new BaseResMessage<>();
        return baseResMessage;
    }


    /**
     * 状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * 状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * 消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 数据
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     * 数据
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResMessage{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
