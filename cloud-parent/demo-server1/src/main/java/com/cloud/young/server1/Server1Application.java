package com.cloud.young.server1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Server1Application{
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Server1Application.class).run(args);
	}
}
