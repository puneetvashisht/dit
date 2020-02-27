package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entities.Employee;
import com.ibm.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.fetchAllEmployees();
	}

	public void addEmployee(Employee toAdd) {
		employeeRepository.addEmployee(toAdd);
		
	}

}
