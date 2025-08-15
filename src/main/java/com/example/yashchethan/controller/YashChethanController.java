package com.example.yashchethan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YashChethanController {

	@GetMapping(value = "/checkHealth")
	public String getResponse() {
		1return "Hello Good Day Application UP and Running";
	}	
	
}
