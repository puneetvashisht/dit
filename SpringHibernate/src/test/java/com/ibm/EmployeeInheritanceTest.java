package com.ibm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ibm.service.EmployeeInheritanceService;
import com.ibm.service.EmployeeService;
import com.viva.inherit.entities.tableperclass.ContractEmployee;
import com.viva.inherit.entities.tableperclass.Employee;
import com.viva.inherit.entities.tableperclass.RegularEmployee;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class EmployeeInheritanceTest {

	@Autowired
	EmployeeInheritanceService employeeService;
	
	@Test
	public void inheritanceTest(){
		Employee toAdd = new Employee("Parent");
//		Employee toAdd = new ContractEmployee("Ravi", 33434.34, 12);
//		Employee toAdd = new RegularEmployee("Priya" ,50000.0, 3);
		employeeService.addEmployee(toAdd);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
