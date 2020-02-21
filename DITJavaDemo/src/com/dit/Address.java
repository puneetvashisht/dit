package com.dit;

public class Address {
	
	int houseNumber;
	String location;
	String city;
	public Address(int houseNumber, String location, String city) {
		super();
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", location=" + location + ", city=" + city + "]";
	}
	
	

}
