package com.jeffgomez.mvcDemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jeffgomez.mvcDemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {
	// this method retrieves all the donations from the database
    List<Donation> findAll();// they need to follow jpa documentation. we will get more in depth tomorrow.
}
