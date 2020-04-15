package com.ibm.ditspringbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ditspringbootproject.entities.Employee;
import com.ibm.ditspringbootproject.services.EmployeeService;



@RestController
@CrossOrigin("*")
@RequestMapping(path="/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(path="/employee/{id}" , method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id){
		ResponseEntity<Void> re= null;
		try{
			employeeService.deleteEmployeeById(id);
			re = new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
		
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee){
		
		employeeService.addEmployee(employee);
		ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.CREATED);
		return re;
	}
	
	@PutMapping("/employee")
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee){
		
		employeeService.updateEmployee(employee);
		ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.ACCEPTED);
		return re;
	}
	
	@GetMapping("/employee")
	public List<Employee> findEmployee(){

		List<Employee> employees = employeeService.fetchAllEmployees();
		return employees;
	}
	
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable("id") int id){

		Employee employee = employeeService.findEmployeeById(id);
		return employee;
	}
	

}
