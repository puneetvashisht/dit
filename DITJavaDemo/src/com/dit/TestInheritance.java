package com.dit;

public class TestInheritance {
	
	public static void incrementSalary(Employee e, double newSalary){
		e.salary = newSalary;
	}
	

	public static void main(String[] args) {
		Address address  = new Address(33, "Rajpura", "Dehradun");
		
		Employee emp = new Employee(123, "RAvi", 34343.33, address);
		TestInheritance.incrementSalary(emp, 234433);
		System.out.println(emp);
		
//		Address address = new 
		
		Employee emp1 = new Employee(123, "Priya", 34343.33, address);
		System.out.println(emp1);
		
		
		
		
		Employee manager = new Manager(123, "RAvi", 34343.33,3);
		System.out.println(manager);
		TestInheritance.incrementSalary( manager, 3434334);

	}

}
