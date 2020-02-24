package com.dit.collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("grape");
		
		System.out.println(fruits);

		
		Employee e1 = new Employee(13, "Ravi", 34343.34);
		Employee e3 = e1;
		Employee e2 = new Employee(13, "Ravi", 34343.34);
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		
		System.out.println(employees.contains(new Employee(13, "", 0d)));
		
	}

}
