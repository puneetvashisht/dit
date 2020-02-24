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
		Employee e5 = new Employee(9, "Rahul", 54343.34);
		List<Employee> employees = new ArrayList<>();
		
//		Set<Employee> employees = new TreeSet<>(new SalaryComparator());
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		System.out.println(employees);
		
		System.out.println(employees);
		
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println(employees.get(employees.size()-1));
		
		
		System.out.println(findBetweenSalaries(employees, 20000, 60000));
		
	}
	
	
	public static Set<Employee> findBetweenSalaries(List<Employee> employees ,double initSalary, double maxSalary ){
		Set<Employee> foundEmployees = new HashSet<>();
		for(Employee e: employees){
			if(e.salary>=initSalary && e.name.startsWith("R")){
				foundEmployees.add(e);
			}
			
		}
		return foundEmployees;
	}

}
