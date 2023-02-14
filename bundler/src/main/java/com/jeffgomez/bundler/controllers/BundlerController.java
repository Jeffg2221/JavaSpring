package com.jeffgomez.bundler.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffgomez.bundler.models.Bundler;
import com.jeffgomez.bundler.services.BundlerService;

@Controller
@RequestMapping("/bundler")
public class BundlerController {

public final BundlerService bundlerServ; 
	
	public BundlerController(BundlerService bundlerServ) {
		this.bundlerServ = bundlerServ;
	}
	
	@GetMapping("/new")
	public String newBundler(@ModelAttribute("bundler") Bundler bundler,HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "bundler/create.jsp";
	}
	
	@PostMapping("/new")
	public String processNewBundler(@Valid @ModelAttribute("bundler") Bundler bundler, BindingResult result) {
		System.out.println("Show post route");
		if(result.hasErrors()) {
			System.out.println(result);
			return "bundler/create.jsp";
		}
		bundlerServ.create(bundler);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/display/{id}")
	public String displayBundler(@PathVariable("id")Long id, HttpSession session,Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		
	}
		model.addAttribute("bundler", bundlerServ.getOne(id));
	return "bundler/displayOne.jsp";
}
	
	@GetMapping("/edit/{id}")
	public String editBundler(@PathVariable("id") Long id, Model model, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		
	}
	model.addAttribute("bundler", bundlerServ.getOne(id));	
	return "bundler/edit.jsp";
}
	@PutMapping("/edit/{id}")
	public String processEditBundler(@Valid @ModelAttribute("bundler") Bundler bundler, BindingResult result) {
		if(result.hasErrors()) {
			return "bundler/edit.jsp";
		}
		bundlerServ.updateBundler(bundler);
		return "redirect:/bundler/display/" + bundler.getId();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteBundler(@PathVariable("id")Long id) {
		
		bundlerServ.deleteBundler(id);
		return "redirect:/dashboard";
	}

}

