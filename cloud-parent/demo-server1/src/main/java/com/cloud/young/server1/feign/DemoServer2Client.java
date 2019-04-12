package com.cloud.young.server1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.young.server1.hystrix.DemoServer2ClientHystrix;

@FeignClient(name="demo-server2",fallback=DemoServer2ClientHystrix.class)
public interface DemoServer2Client {

	@RequestMapping(value="/test2/get2",method = RequestMethod.POST)
	String getDemo2();
}
