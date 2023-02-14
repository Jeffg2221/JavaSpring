package com.jeffgomez.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffgomez.bookclub.models.LoginUser;
import com.jeffgomez.bookclub.models.User;
import com.jeffgomez.bookclub.services.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {
	
	public final UserService userServ;
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/")
	public String loginRegPage(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "user/loginReg.jsp";
	}
	
	@PostMapping("/register")
	public String processRegForm(@Valid @ModelAttribute("user")User user, BindingResult results, Model model,HttpSession session) {
		if(!user.getPassword().equals(user.getConfirm())) {
			results.rejectValue("password", "Match","Confirm Password must match Password!");
		}
		if(userServ.getUser(user.getEmail()) != null) {
			results.rejectValue("email","Unique","Email already in use!");
		}
		if(results.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "user/loginReg.jsp";
		}
		User newUser = userServ.create(user);
		session.setAttribute("user_id", newUser.getId());
			return "redirect:/dashboard";
	}
	@PostMapping("/login")
	public String processLoginForm(@Valid @ModelAttribute("loginUser") LoginUser user, BindingResult results, Model model, HttpSession session) {
		User loggingUser = userServ.login(user, results);
		if(results.hasErrors()) {
			model.addAttribute("user", new User());
			return "user/loginReg.jsp";
		}
		session.setAttribute("user_id", loggingUser.getId());
		return "redirect:/dashboard";

	}
}