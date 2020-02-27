package com.ibm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibm.entities.Employee;
import com.ibm.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class EmployeeTest {

	@Autowired
	EmployeeService employeeService;
	
	
	@Test
	public void testfetchAllEmployeess() {
		List<Employee> emps = employeeService.fetchAllEmployees();
//		assertSame("should return three employees", 3, emps.size());
	}
	@Test
	public void testaddEmployees() {
		Employee toAdd = new Employee(12, "NewEmployee", 34333.34);
		employeeService.addEmployee(toAdd);
		
	}

}
