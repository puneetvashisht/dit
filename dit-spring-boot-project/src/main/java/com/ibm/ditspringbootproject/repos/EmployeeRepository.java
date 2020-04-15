package com.ibm.ditspringbootproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.ditspringbootproject.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public Employee findByName(String name);
	public Employee findById(int id);

}
