package com.example.demo.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserRedisController {

	   @RequestMapping("/getUser")
	    @Cacheable(value="user-key")
	    public User getUser() {
	        User user=new User("aa@126.com", "aa2", "aa123456", "aa","123");
	        System.out.println("若下面没出现“无缓存的时候调ss用”字样且能打印出数据表示测试成功");
	        return user;
	    }
	
}
