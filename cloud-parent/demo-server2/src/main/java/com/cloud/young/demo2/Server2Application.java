package com.cloud.young.demo2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Server2Application{
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Server2Application.class).run(args);
	}
}
