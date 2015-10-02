package com.cooksys.timesheet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAccountController {
	@Autowired
	protected WebAccountService accountService;
	
	public WebAccountController(WebAccountService accountService){
		this.accountService = accountService;
	}
	
	@RequestMapping("/account/count")
	public int getCount(){
		return accountService.getIntCount();
	}

}
