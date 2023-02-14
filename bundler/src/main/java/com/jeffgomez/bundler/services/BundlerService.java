package com.jeffgomez.bundler.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffgomez.bundler.models.Bundler;
import com.jeffgomez.bundler.repositories.BundlerRepository;

@Service
public class BundlerService {
	
	@Autowired
	BundlerRepository bundlerRepo;
	
    // return all
	public List<Bundler> allBundlers(){
		return bundlerRepo.findAll();
	}


    // retrive one
	public Bundler getOne(Long id) {
		Optional<Bundler> optBundler = bundlerRepo.findById(id);
		if(optBundler.isPresent()) {
			return optBundler.get();
		} else return null;
	}

    // create
	public Bundler create(Bundler b) {
		return bundlerRepo.save(b);
	}

    // update one by ID
	public Bundler updateBundler(Bundler b) {
		return bundlerRepo.save(b);
	}

    // delete one by ID
	public void deleteBundler(Long id) {
		bundlerRepo.deleteById(id);
	}

}
