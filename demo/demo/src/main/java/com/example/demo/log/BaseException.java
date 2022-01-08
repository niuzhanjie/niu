package com.example.demo.log;


/**
 * 基础异常类
 *
 * @author warmsheep
 */
public class BaseException extends Exception {

    private static final long serialVersionUID = -5135934259130410531L;

    protected String code;
    protected String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
