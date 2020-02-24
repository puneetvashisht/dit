package com.dit.collectionsdemo;

public class Branch {
	
	int id;
	String name;
	String location;
	boolean atm;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean hasAtm() {
		return atm;
	}
	public void setAtm(boolean atm) {
		this.atm = atm;
	}
	public Branch(int id, String name, String location, boolean atm) {

		this.id = id;
		this.name = name;
		this.location = location;
		this.atm = atm;
	}
	@Override
	public String toString() {
		return "Atm [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
