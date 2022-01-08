package com.example.demo.log;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;
import java.util.List;

/**
 * 功能描述:
 */
@Slf4j
@Configuration
@Aspect
public class AopLogConfig {


    @Pointcut("@annotation(com.example.demo.log.LoggerInfo)")
    public void loggerFeignInfo() {
    }

    @Around(value = "loggerFeignInfo()")
    public Object feign(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Method method = ms.getMethod();

        LoggerInfo loggerInfo = method.getDeclaredAnnotation(LoggerInfo.class);
        StopWatch stopWatch = new StopWatch(loggerInfo.value());


        Object[] args = joinPoint.getArgs();
        if (null == args || 0 == args.length) {
            log.info(" 接口 [{}] 请求参数：{}", loggerInfo.value(), "空！");
        } else {
            Object request = args[0];
            log.info(" 接口 [{}] 请求参数：{}", loggerInfo.value(), request);
        }

        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();
        if (result instanceof BaseResp) {

            if (((BaseResp) result).getData() instanceof List) {
                log.info(" 接口 [{}] 响应参数:{}[list size()：{}], 耗时{}ms", loggerInfo.value(),
                        result.getClass().getSimpleName(), ((List) ((BaseResp) result).getData()).size(),
                        stopWatch.getTotalTimeMillis());
            } else {
                log.info(" 接口 [{}] 响应参数：{}, 耗时{}ms", loggerInfo.value(), result, stopWatch.getTotalTimeMillis());
            }

        } else {
            log.info(" 接口 [{}] 响应参数：{}, 耗时{}ms", loggerInfo.value(), result, stopWatch.getTotalTimeMillis());
        }
        return result;
    }


    @Pointcut("@annotation(com.example.demo.log.ControllerLoggerInfo)")
    public void loggerControllerInfo() {
    }

    @Around(value = "loggerControllerInfo()")
    public Object doAfterReturning(ProceedingJoinPoint joinPoint) {
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Method method = ms.getMethod();

        ControllerLoggerInfo loggerInfo = method.getDeclaredAnnotation(ControllerLoggerInfo.class);
        StopWatch stopWatch = new StopWatch(loggerInfo.value());

        Object[] args = joinPoint.getArgs();
        if (null == args || 0 == args.length) {
            log.info("Basic-Service 接口 [{}] 接受到的请求参数：{}", loggerInfo.value(), "空！");
        } else {
            Object request = args[0];
            log.info("Basic-Service 接口 [{}] 接受到的请求参数：{}", loggerInfo.value(), request);
        }

        stopWatch.start();
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            if (throwable instanceof BasicException) {
                BasicException ex = (BasicException) throwable;
                BaseResMessage<Object> resMessage = new BaseResMessage<>(ex.getCode(), ex.getMessage());

                stopWatch.stop();
                log.info(" 接口 [{}] 返回的响应参数：{}, 耗时{}ms", loggerInfo.value(), resMessage, stopWatch.getTotalTimeMillis());
                return new BaseResMessage<>(ex.getCode(), ex.getMessage());
            }
        }
        stopWatch.stop();
        log.info(" 接口 [{}] 返回的响应参数：{}, 耗时{}ms", loggerInfo.value(), result, stopWatch.getTotalTimeMillis());
        return result;
    }
}