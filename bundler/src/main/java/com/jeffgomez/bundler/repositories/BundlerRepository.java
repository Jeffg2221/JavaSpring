package com.jeffgomez.bundler.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffgomez.bundler.models.Bundler;

@Repository
public interface BundlerRepository extends CrudRepository<Bundler,Long> {
	List<Bundler> findAll();
}
