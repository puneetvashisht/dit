package com.dit;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	Address addresses[];
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public Employee(int id, String name, double salary, Address[] addresses) {
		this(id, name , salary);
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		
		String addressStr = "";
		for(Address address: addresses){
			addressStr +=address.toString();
		}
		
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses=" + addressStr + "]";
	}
	
	
	
	
	
	
	
	
//	public String toString() {
//        return id + name + salary;
//    }
}
