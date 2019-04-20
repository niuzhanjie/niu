package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Test {

	@RequestMapping("/hello")
	public String name() {
	//	2019-02-23T09:01:53.909177Z 5 [Note] [MY-010454] [Server] A temporary password is generated for root@localhost: ewWxgJv<Q6e- 
		return "index";
		
	}
}
