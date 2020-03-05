package com.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.entities.Employee;
import com.ibm.service.EmployeeService;

@Controller
public class EmployeeRestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String fetchEmp(){
		return "index";
//		/hello.jsp
	}
	
	@RequestMapping(path="/hello", method=RequestMethod.GET)
//	@GetMapping("/hello")
	public String sayHello(Model model){
		//LOGIC
		model.addAttribute("name", "Ravi");
		return "hello";
//		/hello.jsp
	}
	
	@PostMapping("/employee")
	public String findEmployee(@RequestParam("name") String name, Model model){
		//LOGIC
		
//		String value1 = request.getParameter("value1");
		System.out.println(name);
//		System.out.println();
		List<Employee> employees = employeeService.fetchAllEmployeesByName(name);
		System.out.println(employees);
		if(employees.size()<=0){
			return "index";
		}
		model.addAttribute("emp", employees.get(0));
		return "employee";
//		/employee.jsp
	}
	

}
