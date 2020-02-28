package com.ibm.repos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.entities.Employee;

public class EmployeeRepository {
	
	
	public List<Employee> fetchAllEmployees(){
//		1. // Create a session object		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		2. // fire find/get method on session object
		
		Employee emp = session.get(Employee.class, 1);
	
		return null;
	}
	
	public void addEmployee(Employee employee){
		
//		1. // Create a session object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx  = session.beginTransaction();
//		2. // fire save/persist method on session object
		session.save(employee);
		tx.commit();
		
		session.close();
		
	}

	public Employee findEmployee(int id) {
//		1. // Create a session object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee emp = session.get(Employee.class, id);
		
		session.close();
		return emp;
	}

}
