package com.cooksys.timesheet.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;



@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountWebApplication.class)
public class AccountService {
	
	
	
	
	public static void main(String[] args) {
		// Tell server to look for accounts-server.properties or
		// accounts-server.yml
		System.setProperty("spring.config.name", "accounts-service");

		SpringApplication.run(AccountService.class, args);
	}

}
