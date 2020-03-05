package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.entities.Employee;

@Repository
public class EmployeeRepository {
	
	@PersistenceContext
	EntityManager em; //Session session
	
	
@Transactional
	public List<Employee> fetchAllEmployees() {
		TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
		List<Employee> employees=  query.getResultList();
		
//		for(Employee emp : emps){
//			System.out.println(emp.getAddresses());
//		}
		System.out.println(employees);
		
		return employees;
//		return employees;
	}
	
	
	public List<Employee> fetchAllEmployeesByName(String name) {
//		TypedQuery<Employee> query = em.createQuery("select e from Employee e where e.name=:fname", Employee.class);
		TypedQuery<Employee> query = em.createNamedQuery("selectEmployeeByName", Employee.class);
		query.setParameter("fname", name);
		List<Employee> employees =  query.getResultList();
		System.out.println(employees);
		
//		for(Employee e : employees){
//			System.out.println(e.getAddresses());
//		}
		return employees;
	}
	
	@Transactional
	public void addEmployee(Employee toAdd) throws Exception {
//		this.employees.add(toAdd);
		em.persist(toAdd);
//		System.out.println(this.employees);
//		throw new Exception("Any error message");
		
	}
	public Employee findEmployeeById(int id) {
		Employee emp =  em.find(Employee.class, id);
//		emp.getAddresses();
		return emp;
	}
	
	@Transactional
	public void deleteEmployeeById(int id) {
		
		Employee emp = this.findEmployeeById(id);
		em.remove(emp);
		
	}
	@Transactional
	public void updateEmployee(Employee updatedEmployee) {
		Employee emp = this.findEmployeeById(updatedEmployee.getId());
		emp.setSalary(updatedEmployee.getSalary());
	}
	

}
