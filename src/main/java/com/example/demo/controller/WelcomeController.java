package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class WelcomeController {
	@GetMapping("/msg")
	public String getMessage() {
		try {
			
		}catch(Exception e) {
			
		}
		int a=10;
		
		return "welcome";
	}
}
