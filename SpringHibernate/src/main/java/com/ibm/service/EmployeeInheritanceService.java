package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.repo.EmployeeInheritanceRepository;
//import com.ibm.repo.EmployeeRepository;
import com.viva.inherit.entities.tableperclass.Employee;

@Service
public class EmployeeInheritanceService {
	
	@Autowired
	EmployeeInheritanceRepository employeeRepository;
	
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.fetchAllEmployees();
//		employeeRepository.find
	}

	public void addEmployee(Employee toAdd) {
		try {
			employeeRepository.addEmployee(toAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Employee findEmployeeById(int id) {
		if(id<=0){
			
		}
		return employeeRepository.findEmployeeById(id);
		
	}

	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteEmployeeById(id);
	}

	public void updateEmployee(Employee updatedEmployee) {
		employeeRepository.updateEmployee(updatedEmployee);
		
	}

	public List<Employee> fetchAllEmployeesByName(String name) {
		return employeeRepository.fetchAllEmployeesByName(name);
		
	}

	public double fetchTotalSalariesOfEmployees() {
		return employeeRepository.fetchTotalSalaryOfEmployees();
	}

}
