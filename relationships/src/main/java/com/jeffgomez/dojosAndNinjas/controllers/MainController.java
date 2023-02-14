//package com.jeffgomez.dojosAndNinjas.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.jeffgomez.dojosAndNinjas.services.DojoService;
//import com.jeffgomez.dojosAndNinjas.services.NinjaService;
//
//@Controller
//public class MainController {
//	@Autowired
//	DojoService dojoService;
//	
//	@Autowired
//	NinjaService ninjaService;
//	
//	@GetMapping
//	public String index(Model model) {
//		model.addAttribute("dojo", dojoService.allDojos());
//		return "new_dojo.jsp";
//		// TODO Auto-generated constructor stub
//	}
//
//}
