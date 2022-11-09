package com.company.tourist.registration.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TouristInformation {
	@Id
	private int id;
	private String firstName,lastName;
	private String gender;
	private int age;
	private String fromPlace;
	private int numberOfdaysVisits;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public int getNumberOfdaysVisits() {
		return numberOfdaysVisits;
	}
	public void setNumberOfdaysVisits(int numberOfdaysVisits) {
		this.numberOfdaysVisits = numberOfdaysVisits;
	}
	
	public TouristInformation(int id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfdaysVisits) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfdaysVisits = numberOfdaysVisits;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public TouristInformation() {
		super();
	}
	

}
