package com.cooksys.timesheet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebAccountService {
	
	@Autowired
	protected RestTemplate restTemplate;

	protected String serviceURL;
	
	public WebAccountService(String serviceUrl){
		this.serviceURL = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	public String doSomething(){
		return restTemplate.getForObject(serviceURL + "/",String.class);
		
	}
	public int getIntCount(){
		return restTemplate.getForObject(serviceURL + "/count",int.class);
	}
}
