package com.cooksys.timesheet.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebService {
	
	
	public static final String ACCOUNT_SERVICE_URL = "http://ACCOUNTS-SERVICE";
	
	public static void main(String[] args){
		System.setProperty("spring.config.name", "web-service");
		SpringApplication.run(WebService.class, args);
	}
	
	@Bean
	public WebAccountService accountService(){
		return new WebAccountService(ACCOUNT_SERVICE_URL);
	}
	
	@Bean
	public WebAccountController accountController(){
		return new WebAccountController(accountService());
	}
	
	@Bean
	public HomeController homeController(){
		return new HomeController();
	}

}
