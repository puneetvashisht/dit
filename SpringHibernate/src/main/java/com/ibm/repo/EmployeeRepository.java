package com.ibm.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.entities.Employee;

@Repository
public class EmployeeRepository {
	
	@PersistenceContext
	EntityManager em; //Session session
	
	List<Employee> employees = new ArrayList<>();
	
	{
		Employee e2 = new Employee(12, "Priya", 44343.34);
		Employee e3 = new Employee(11, "Sumeet", 24343.34);
		Employee e4 = new Employee(9, "Rahul", 54343.34);
		employees.add(e2);employees.add(e3);employees.add(e4);
	}

	public List<Employee> fetchAllEmployees() {
		return employees;
	}
	@Transactional
	public void addEmployee(Employee toAdd) throws Exception {
//		this.employees.add(toAdd);
		em.persist(toAdd);
		System.out.println(this.employees);
		throw new Exception("Any error message");
		
	}

}
