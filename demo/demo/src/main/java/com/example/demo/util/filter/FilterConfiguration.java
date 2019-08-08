package com.example.demo.util.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

	
	    @Bean
	    public FilterRegistrationBean refererFilterRegistration() {
	        FilterRegistrationBean<MyFilter> registration = new FilterRegistrationBean<>();
	        //注入过滤器
	        registration.setFilter(new MyFilter());
	        //过滤规则
	        registration.addUrlPatterns("/meng3");
	        //过滤器名称
	        registration.setName("ref");
	        //过滤器顺序
	        registration.setOrder(1);

	        return registration;
	    }
	
	
}
