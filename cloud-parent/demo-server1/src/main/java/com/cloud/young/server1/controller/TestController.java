package com.cloud.young.server1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.young.server1.feign.DemoServer2Client;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/test1/")
@Slf4j
public class TestController {
	
	@Autowired
	private DemoServer2Client demo2Client;

	@RequestMapping("/get")
	public String getTest() {
		return "test1";
	}
	
	@RequestMapping("/get2")
	public String getTest2() {
		log.info("get test2...");
		return demo2Client.getDemo2();
	}
}
