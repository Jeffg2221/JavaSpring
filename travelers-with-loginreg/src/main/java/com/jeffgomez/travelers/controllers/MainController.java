package com.jeffgomez.travelers.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jeffgomez.travelers.services.UserService;

@Controller
public class MainController {
	
	private final UserService userServ;

	public MainController(UserService userServ) {
		this.userServ = userServ;
	}
	@GetMapping("/")
	public String dashboard(HttpSession session, Model model) {
		model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
		return "main/dashboard.jsp";
	}

}
