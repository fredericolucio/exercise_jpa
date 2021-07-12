package com.example.springboot.exercisesb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.exercisesb.models.Client;

@RestController
@RequestMapping("/client")
public class ClientController {

	@GetMapping("/anything")
	public Client getClient() {
		return new Client(10, "Frederico", "123.456.789-00");
	}
	
}
