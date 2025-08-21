package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/greet")
	public String greet()
	{
		return "Hello From Greet";
	}
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello From Hawkins";
	}

}
