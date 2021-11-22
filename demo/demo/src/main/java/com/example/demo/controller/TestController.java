package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

@Controller
public class TestController {

	@Autowired
	private QidongZanting qidongZanting;
	
	@RequestMapping("qidongZanting")
	public String kaishiZanting() {
		
		return "qidongZanting";
	}
	
	@RequestMapping("start")
	@ResponseBody
	public String kaishi() {
		if(qidongZanting.isAlive()) {
			qidongZanting.resumeThread();//唤醒
		}else {
			qidongZanting.start();
		}
		
		
		return "kaishi";
	}
	

	@RequestMapping(value = "/pause")
	@ResponseBody
	public String zanting(@RequestBody String name) {
		qidongZanting.pauseThread();
		return "zanting";
	}
	
	
	@RequestMapping(value = "/stop")
	@ResponseBody
	public String stop() {
	
		qidongZanting.stopTherad();
		return "zanting";
	}
	
	
	@RequestMapping(value = "/reStart")
	@ResponseBody
	public String reStart() {
	
		qidongZanting.stopTherad();
		qidongZanting.start();
		return "zanting";
	}
	
}
