package com.company.tourist.registration.serviceImple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.tourist.registration.repository.TouristRepository;
import com.company.tourist.registration.service.TouristService;

@ExtendWith(MockitoExtension.class)
class TouristServiceImpleTest {

	TouristService tour;
	
	@Mock
	TouristRepository tourRepo;
	
	@BeforeEach
	void set() {
		this.tour = new TouristServiceImple(this.tourRepo);
	}
	@Test
	void test() {
		tour.getTourist();
		verify(tourRepo).findAll();
	}

}
