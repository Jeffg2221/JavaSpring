package com.jeffgomez.dojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jeffgomez.dojosNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
