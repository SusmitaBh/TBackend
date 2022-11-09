package com.company.tourist.registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.tourist.registration.entity.TouristInformation;

@Repository
public interface TouristRepository extends JpaRepository<TouristInformation, Integer> {
	
	//List<TouristInformation> findAllByOrderByNameDesc();

}
