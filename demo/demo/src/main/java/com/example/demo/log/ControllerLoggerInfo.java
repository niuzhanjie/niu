package com.example.demo.log;

import java.lang.annotation.*;

/**
 * 功能描述:
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ControllerLoggerInfo {

    /**
     * 需要打印的日志的接口中文名
     */
    String value();

    /**
     * 是否重写日志打印格式
     */
    boolean isOverrideLogFormat() default false;

    /**
     * 请求报文日志格式
     */
    String requestLog() default "";

    /**
     * 响应报文日志格式
     */
    String responseLog() default "";
}
