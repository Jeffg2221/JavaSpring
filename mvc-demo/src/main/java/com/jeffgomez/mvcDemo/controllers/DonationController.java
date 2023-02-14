package com.jeffgomez.mvcDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeffgomez.mvcDemo.services.DonationService;

@Controller
@RequestMapping("/donation")
public class DonationController {
	
	public final DonationService donationServ;
	public DonationController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	@GetMapping("/all")
	public String showAllDonations(Model model) {
		model.addAttribute("allDonations", donationServ.findAll());
		return "donation/showAll.jsp";
	}
	@GetMapping("/show/{id}")
	public String showOneDonation(@PathVariable("id")Long id, Model model) {
		model.addAttribute("oneDonation", donationServ.getOne(id));
		return "donation/showOne.jsp";
	}
}