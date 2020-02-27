package com.ibm.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibm.entities.Employee;

@Repository
public class EmployeeRepository {
	
	List<Employee> employees = new ArrayList<>();
	
	{
		Employee e2 = new Employee(12, "Priya", 44343.34);
		Employee e3 = new Employee(11, "Sumeet", 24343.34);
		Employee e4 = new Employee(9, "Rahul", 54343.34);
		employees.add(e2);employees.add(e3);employees.add(e4);
	}

	public List<Employee> fetchAllEmployees() {
		return employees;
	}

	public void addEmployee(Employee toAdd) {
		this.employees.add(toAdd);
		System.out.println(this.employees);
		
	}

}
