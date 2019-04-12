package com.cloud.young.server1.hystrix;

import org.springframework.stereotype.Component;

import com.cloud.young.server1.feign.DemoServer2Client;

@Component
public class DemoServer2ClientHystrix implements DemoServer2Client{

	@Override
	public String getDemo2() {
		return "this is hystrix value";
	}

}
