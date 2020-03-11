package com.ibm.ditspringbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ditspringbootproject.entities.Employee;
import com.ibm.ditspringbootproject.repos.EmployeeRepository;



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.findAll();
	}

	public void addEmployee(Employee toAdd) {
		try {
//			employeeRepository.addEmployee(toAdd);
			employeeRepository.save(toAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Employee findEmployeeById(int id) {
		if(id<=0){
			
		}
		return employeeRepository.getOne(id);
		
	}

	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteById(id);
		
	}

	public void updateEmployee(Employee updatedEmployee) {
//		employeeRepository.updateEmployee(updatedEmployee);
		
	}

	public Employee fetchAllEmployeesByName(String name) {
		return employeeRepository.findByName(name);
		
	}

}
