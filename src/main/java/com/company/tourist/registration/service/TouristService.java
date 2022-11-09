package com.company.tourist.registration.service;

import java.util.List;

import com.company.tourist.registration.entity.TouristInformation;

public interface TouristService {

	public List<TouristInformation> getTourist();
	public void setTourist(TouristInformation tourist);
}
