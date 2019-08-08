package com.example.demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer{

//	   @Autowired
//	    LoginInterceptor loginInterceptor;
	    @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        //登录拦截的管理器
	        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());     //拦截的对象会进入这个类中进行判断
	        registration.addPathPatterns("/meng2");                    //所有路径都被拦截
	        registration.excludePathPatterns("/index");       //添加不拦截路径
//	        super.addInterceptors(registry);


	        
	    }
	
}
