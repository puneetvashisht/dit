package com.dit;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Address address;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public Employee(int id, String name, double salary, Address address) {
		this(id, name , salary);
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
//	public String toString() {
//        return id + name + salary;
//    }
}
