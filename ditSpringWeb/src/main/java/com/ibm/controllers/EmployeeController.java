package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entities.Employee;
import com.ibm.service.EmployeeService;

@RestController
@RequestMapping(path="/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(path="/employee/{id}" , method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") int id){
		employeeService.deleteEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> findEmployee(){

		List<Employee> employees = employeeService.fetchAllEmployees();
		return employees;
	}
	

}
