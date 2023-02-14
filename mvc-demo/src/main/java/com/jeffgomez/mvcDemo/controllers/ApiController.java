package com.jeffgomez.mvcDemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeffgomez.mvcDemo.models.Donation;
import com.jeffgomez.mvcDemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	public final DonationService donationServ;
	
	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	//---------Find ONE (/donations/{id})-------
	@GetMapping("/donations/{id}")
	public Donation findOne(@PathVariable("id") Long id) {
		return donationServ.getOne(id);
	}
	
	//--------edit (/donations/{id}--------
	@PutMapping("/donations/{id}")
	public Donation editOneDonation(@PathVariable("id")Long id,
			@RequestParam("donationName")String donationName, 
			@RequestParam("donor")String donor, 
			@RequestParam("quantity")Integer quantity) {
		Donation donationToBeUpdated = donationServ.getOne(id);
		donationToBeUpdated.setDonationName(donationName);
		donationToBeUpdated.setDonor(donor);
		donationToBeUpdated.setQuantity(quantity);
		return donationServ.update(donationToBeUpdated);
	}
	
	//-----------Delete(/donations/{id})---------
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id")Long id) {
		
		if(donationServ.getOne(id) == null) {
			return "the donation you are looking for is not here";
		}
		donationServ.delete(id);
		return "the instance with the id of " + id + " has been deleted";
	}
	
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.findAll();

	}
	
	 @PostMapping("/donations")
	    public Donation createDonation(@RequestParam("donationName")String donationName, 
							    		@RequestParam("donor")String donor, 
							    		@RequestParam("quantity")Integer quantity) {
	    	
	    	Donation newDonation = new Donation(donationName,donor,quantity);
	    	
	    	return donationServ.create(newDonation);
	    }
	}


