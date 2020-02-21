package com.dit;

public class Manager extends Employee{

	int numberOfResources;

	public Manager(int id, String name, double salary, int numberOfResources) {
		super(id, name, salary);
		this.numberOfResources = numberOfResources;
	}

	@Override
	public String toString() {
		return "Manager [numberOfResources=" + numberOfResources + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}
