package com.company.tourist.registration.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.tourist.registration.entity.TouristInformation;
import com.company.tourist.registration.repository.TouristRepository;
import com.company.tourist.registration.service.TouristService;

@Service
public class TouristServiceImple implements TouristService {
	
	@Autowired
	private TouristRepository tr;

	

	@Override
	public List<TouristInformation> getTourist() {
		
		//return tr.findAllByOrderByNameDesc();
		return tr.findAll();
	}

	@Override
	public void setTourist(TouristInformation tourist) {
		tr.save(tourist);
		
	}
	
	public TouristServiceImple(TouristRepository tourRepo) {
		this.tr = tourRepo;
	}
}
