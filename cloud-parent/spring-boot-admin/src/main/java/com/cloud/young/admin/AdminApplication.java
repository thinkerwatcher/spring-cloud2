package com.cloud.young.admin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class AdminApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AdminApplication.class).run(args);
	}
}
