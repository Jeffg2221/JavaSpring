package com.jeffgomez.daikichi.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String redirectHome() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}else {
			Integer countInsession = (Integer) session.getAttribute("count");
			countInsession++;
			session.setAttribute("count", countInsession);
		}
		
		return "index.jsp";
	}
	
	@GetMapping("/display/count")
	public String getCount() {
		return "show.jsp";
	}
	
	@GetMapping("/reset/count")
	public String resetCount(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji/form")
	public String displayOmikuji() {
		return "index.jsp";
	}
	
	@PostMapping("/omikuji/form")
	public String processForm(@RequestParam("city") String city, @RequestParam("realPerson") String realPerson, @RequestParam("hobby") String hobby, @RequestParam("thing") String thing, @RequestParam("textarea") String textarea, @RequestParam("number") Integer number, HttpSession session)   {
		session.setAttribute("textarea", textarea);
		session.setAttribute("city", city);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("number", number);
		session.setAttribute("realPerson", realPerson);
	
		return "redirect:/omikuju/form/show";
	}
	
	@GetMapping("/omikuju/form/show")
	public String displayform() {
		return "show.jsp";
	}
	


}
