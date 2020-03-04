package com.ibm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibm.entities.Address;
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
		System.out.println(emps);
		
		
//		assertSame("should return three employees", 3, emps.size());
	}
	
//	@Test
	public void testfetchAllEmployeesByName() {
		List<Employee> emps = employeeService.fetchAllEmployeesByName("NewEmployeeToDb");
		System.out.println(emps);
//		assertSame("should return three employees", 3, emps.size());
	}
//	@Test
	public void testaddEmployees() {
		Address address = new Address(34, "Malasi", "Dehradun");
		Address residentialAddress = new Address(34, "Jangpura", "New DElhi");
		List<Address> addresses = new ArrayList<>();
		addresses.add(address); addresses.add(residentialAddress); 
		
		Employee toAdd = new Employee("NewEmployeeToDb", 34333.34, addresses);
		
		employeeService.addEmployee(toAdd);
		
	}
	
	
//	@Test
	public void testfindEmployeeById() {	
		Employee emp = employeeService.findEmployeeById(9);
		System.out.println(emp);
		
	}
//	@Test
	public void testDeleteEmployeeById() {	
		employeeService.deleteEmployeeById(5);
//		System.out.println(emp);
		
	}
//	@Test
	public void testUpdateEmployee() {	
		Employee updatedEmployee = new Employee(4, "Priya", 55555.34);
		
		employeeService.updateEmployee(updatedEmployee);
//		System.out.println(emp);
		
	}
}
