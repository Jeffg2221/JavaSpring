package com.jeffgomez.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jeffgomez.dojosNinjas.models.Dojo;
import com.jeffgomez.dojosNinjas.models.Ninja;
import com.jeffgomez.dojosNinjas.services.DojoService;
import com.jeffgomez.dojosNinjas.services.NinjaService;

@Controller
public class HomeController {

	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String index(Model model) {
		//grab list from datbase and send list of ninjas to jsp
		model.addAttribute("ninjaList", ninjaService.allNinjas());
		model.addAttribute("dojolist", dojoService.allDojos());
		return "dashboard.jsp";
	}
	// --------create --------
	@GetMapping("/add/dojos")
	public String renderDojoForm(@ModelAttribute("dojo")Dojo dojo) {
		return "createDojo.jsp";
	}
	
	//---- process the form
	@PostMapping("/add/dojos")
	public String processDojoForm(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "createDojo.jsp";
		}else {
			dojoService.saveDojo(dojo);
			return "redirect:/";
		}
	}
	
	// --------create --------
		@GetMapping("/add/ninjas")
		public String renderNinjaForm(@ModelAttribute("ninja")Ninja ninja, Model model) {
			//grab the user list and send to the jsp
			List<Dojo> dojolist = dojoService.allDojos();
			model.addAttribute("dojolist", dojolist);
			
			return "newNinja.jsp";
			
		}
		
		
		//---- process the form
		@PostMapping("/add/ninjas")
		public String processNinjaForm(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
			if(result.hasErrors()) {
				List<Dojo> dojolist = dojoService.allDojos();
				model.addAttribute("dojolist", dojolist);
				return "newNinja.jsp";
			}else {
				ninjaService.saveNinja(ninja);
				return "redirect:/";
			}
			
		
		}
		
		//-----Find One -------
		@GetMapping("/dojos/{id}")
		public String getOneDojo(@PathVariable("id") Long id, Model model) {
			model.addAttribute("dojo", dojoService.oneDojo(id));
			return "dojoDetails.jsp";
		}
	
	
	
}
