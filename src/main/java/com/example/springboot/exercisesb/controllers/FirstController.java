package com.example.springboot.exercisesb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
public class FirstController {
	
	//One way to mapping webpage
	//@RequestMapping(method = RequestMethod.GET, path = "/hello")
	
	@GetMapping(path = {"/hello", "/sayhello"})
	public String hello() {
		return "Hello Spring Boot!";
	}
}
