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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public Employee(int id, String name, double salary, Address[] addresses) {
		this(id, name , salary);
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		
//		String addressStr = "";
//		for(Address address: addresses){
//			addressStr +=address.toString();
//		}
		
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses="  + "]";
	}
	
	
	
	public void incrementSalary(double newAmount){
		this.salary+=newAmount;
	}
	
	
	
	
//	public String toString() {
//        return id + name + salary;
//    }
}
