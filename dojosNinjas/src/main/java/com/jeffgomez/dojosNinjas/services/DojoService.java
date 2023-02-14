package com.jeffgomez.dojosNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffgomez.dojosNinjas.models.Dojo;
import com.jeffgomez.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepo;
	
	//get all dojos
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}

	//get one
	public Dojo oneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()){
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	//add dojo
	public Dojo saveDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}

}
