package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ibm.entities.Employee;
import com.ibm.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	@RequestMapping(path="/hello", method=RequestMethod.GET)
	@GetMapping("/hello")
	public String sayHello(Model model){
		//LOGIC
		model.addAttribute("name", "Ravi");
		return "hello";
//		/hello.jsp
	}
	
	@GetMapping("/employee")
	public String findEmployee(Model model){
		//LOGIC
		List<Employee> employees = employeeService.fetchAllEmployees();
		model.addAttribute("emp", employees.get(0));
		return "employee";
//		/employee.jsp
	}
	

}
