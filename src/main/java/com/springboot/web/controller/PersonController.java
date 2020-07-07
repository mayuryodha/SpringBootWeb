package com.springboot.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Person;

@RestController
public class PersonController {

	
	
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
	@RequestMapping("/person/list")
	public List<Person> getPerson() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("ram"));
		list.add(new Person("ramesh"));
		
		return list;
	}
	
	
	
}