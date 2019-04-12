package com.cloud.young.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class TestController {
	
	@RequestMapping("/get")
	public String get1() {
		return "test2";
	}
	
	@RequestMapping("/get2")
	public String get2() {
		return "get2";
	}
}
