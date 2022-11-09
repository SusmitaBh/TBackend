package com.company.tourist.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.tourist.registration.entity.TouristInformation;
import com.company.tourist.registration.repository.TouristRepository;
import com.company.tourist.registration.service.TouristService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("tourist/")
public class TouristController {
		
	@Autowired
	private TouristRepository repo;
	
	@PostMapping("/tourist")
	public ResponseEntity<TouristInformation> registerTourist(@RequestBody TouristInformation tourist) {
		
		return ResponseEntity.ok(repo.save(tourist));
	}
	
	@RequestMapping("getTourist")
	public List<TouristInformation> getTourist(){
		return this.repo.findAll();
	}

}
