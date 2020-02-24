package com.dit.collectionsdemo;

public class Atm {
	
	int id;
	String name;
	String location;
	public Atm(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Atm [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
