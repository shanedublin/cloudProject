package com.cooksys.timesheet.account;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	
	@RequestMapping("/")
	public String hi(){
		return "Hello World";
	}
	
	public static AtomicLong num = new AtomicLong();
	
	@RequestMapping("/count")
	public long getCount(){
		return num.getAndIncrement();
	}

}
