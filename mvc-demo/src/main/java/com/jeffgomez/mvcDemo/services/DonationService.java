package com.jeffgomez.mvcDemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeffgomez.mvcDemo.models.Donation;
import com.jeffgomez.mvcDemo.repositories.DonationRepository;

@Service
public class DonationService {
	
	public final DonationRepository donationRepo;
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	  // returns all the books
    public List<Donation> findAll() {
        return donationRepo.findAll();
    }
    
    public Donation create(Donation donation) {
    	return donationRepo.save(donation);
    }
    
    public Donation update(Donation donation) {
    		return donationRepo.save(donation);
    	
    }
    
    public void delete(Long id) {
    	donationRepo.deleteById(id);
    }
    
    public Donation getOne(Long id) {
    		Optional<Donation> optionalDonation = donationRepo.findById(id);
    		if(optionalDonation.isPresent()) {
    			return optionalDonation.get();
    		}else {
    			return null;
    		}
    }
    
}  
