package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/greet")
	public String greetHello() {
		return "Hello World";
	}

	@GetMapping("/greet/{name}")
	public String greetHello(@PathVariable String name) {
		return "Hello " + name;
	}

}
