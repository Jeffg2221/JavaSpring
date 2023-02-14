package com.jeffgomez.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@RequestMapping("/option/1")
	public String option1() {
		return "Option one request mapping";
	}
	
	// OPTION 2: explicitly set request method
	@RequestMapping(value="/option/2", method = RequestMethod.GET)
	public String option2() {
		return "option two request mapping";
	}
	
	@GetMapping("/option/3")
	public String option3() {
		return "Option 3 request mapping";
	}
	
	
}
