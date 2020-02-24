package com.dit.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("apple");
		fruits.add("grape");
		
		System.out.println(fruits);

		
		Employee e1 = new Employee(13, "Ravi", 34343.34);

		Employee e2 = new Employee(12, "Priya", 44343.34);
		Employee e3 = new Employee(11, "Sumeet", 24343.34);
		Employee e4 = new Employee(9, "Rahul", 54343.34);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(employees);
		
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println(employees);
		
		System.out.println(employees.contains(new Employee(13, "", 0d)));
		
	}

}
