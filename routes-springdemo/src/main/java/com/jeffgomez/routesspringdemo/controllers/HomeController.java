package com.jeffgomez.routesspringdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		int testint = 3;
		model.addAttribute("name", "Bobby Brown");
		model.addAttribute("number", testint);
		return "index.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstl(Model model) {
		String name = "Bobby brown";
		Integer age = 53;
		Boolean isHungry = true;
		model.addAttribute("jspName", name);
		model.addAttribute("jspAge", age);
		model.addAttribute("jspIsHungry",isHungry);
		model.addAttribute("test","<script>alert('h1')</script>");
		return "jstl.jsp";
	}
	
}
