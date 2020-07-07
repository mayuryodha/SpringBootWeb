package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageProviderController {

	@Autowired
	private MessageProviderService messageProviderService;
	
	
	@GetMapping("/xmlLoading")
	public String hello(){
		return messageProviderService.getMessage();
	}
}
