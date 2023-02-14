package com.jeffgomez.travelers.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffgomez.travelers.models.LoginUser;
import com.jeffgomez.travelers.models.User;
import com.jeffgomez.travelers.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	private final UserService userServ;
	public UserController(UserService userServ) {
		this.userServ = userServ;
	}
	
	@GetMapping("/login/register")
	public String loginReg(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("loginUser", new LoginUser());
		return "user/loginReg.jsp";
	}
	
	@PostMapping("/login/register")
	public String registerUser(@Valid @ModelAttribute("newUser") User user, BindingResult result, HttpSession session, Model model) {
		if(!user.getPassword().equals(user.getConfirm())) {
			result.rejectValue("password", "Match", "passwords do not match");
		}
		
		if(userServ.getUser(user.getEmail()) != null) {
			result.rejectValue("email", "Unique", "Email already exists");
		}
		
		if(result.hasErrors()) {
			model.addAttribute("loginUser", new LoginUser());
			return "user/loginReg.jsp";
		}
		
		User newUser = userServ.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/dashboard";
		
	}
	
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("loginUser") LoginUser loginUser, BindingResult result, Model model, HttpSession session) {
		User loggingUser = userServ.login(loginUser,  result);
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "user/loginReg.jsp";
		}
		session.setAttribute("user_id", loggingUser.getId());
		
		
		return "redirect:/";
	}
	

}
