package com.ibm.repos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ibm.entities.Employee;

public class EmployeeRepository {
	
	
	public List<Employee> fetchAllEmployees(String name){
//		1. // Create a session object		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		2. // fire find/get method on session object
		
		Query<Employee> query = session.createQuery("select e from Employee e where e.name=:x", Employee.class);
		query.setParameter("x", name);
		List<Employee> emps = query.getResultList();
	
		return emps;
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
	
		public void updateEmployee(Employee changeEmployee){
		
//		1. // Create a session object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx  = session.beginTransaction();
//		2. // fire save/persist method on session object
//		session.upd
		
		Employee existingEmployee = session.find(Employee.class, changeEmployee.getId());
//		existingEmployee.setSalary(changeEmployee.getSalary());
		existingEmployee.setSalary(111111d);
		
		tx.commit();
		
		session.close();
		
		
		
	}
	
	public void removeEmployee(int id){
		
//		1. // Create a session object
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx  = session.beginTransaction();
//		2. // fire save/persist method on session object
		session.remove(this.findEmployee(id));
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
