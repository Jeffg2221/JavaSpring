package com.jeffgomez.bundler.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jeffgomez.bundler.services.BundlerService;
import com.jeffgomez.bundler.services.UserService;

@Controller
public class MainController {
	
	public final UserService userServ;
	public final BundlerService bundlerServ;
	public MainController(UserService userServ,BundlerService bundlerServ) {
		this.userServ = userServ;
		this.bundlerServ = bundlerServ;
	
	}
	@GetMapping("/")
	public String redirectLogin() {
		return "redirect:/user/";
	}
	
@GetMapping("/dashboard")
public String dashboard(HttpSession session, Model model) {
	if(session.getAttribute("user_id") == null) {
		return "redirect:/";
	}
	
	model.addAttribute("allBundlers", bundlerServ.allBundlers());
	model.addAttribute("user", userServ.getUser((Long)session.getAttribute("user_id")));
	return "/main/dashboard.jsp";
}
@GetMapping("/logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/";
	}
}