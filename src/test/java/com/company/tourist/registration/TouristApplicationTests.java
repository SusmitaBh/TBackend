package com.company.tourist.registration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.tourist.registration.entity.TouristInformation;
import com.company.tourist.registration.repository.TouristRepository;

@SpringBootTest
class TouristApplicationTests {
	
	@Autowired
	TouristRepository toutristrepo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testSet() {
		TouristInformation t = new TouristInformation();
		t.setId(4);
		t.setFirstName("Susmita");
		t.setLastName("Bhattacharjee");
		t.setGender("Female");
		t.setFromPlace("Arambagh");
		t.setNumberOfdaysVisits(5);
		t.setAge(23);
		toutristrepo.save(t);
		assertNotNull(toutristrepo.findById(4).get());
	}


	
	}
