//package com.jeffgomez.dojosAndNinjas.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jeffgomez.dojosAndNinjas.models.Dojo;
//import com.jeffgomez.dojosAndNinjas.repositories.DojoRepository;
//
//@Service
//public class DojoService {
//	@Autowired
//	DojoRepository dojoRepository;
//
//	public List<Dojo> allDojos() {
//		return dojoRepository.findAll();
//		
//	}
//	
//	public Dojo createDojo(Dojo dojo) {
//		return dojoRepository.save(dojo);
//	}
//	
//	public Dojo findDojo(Long id) {
//		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
//		if(optionalDojo.isPresent()) {
//			return optionalDojo.get();
//		}else {
//			return null;
//		}
//	}
//
//}
