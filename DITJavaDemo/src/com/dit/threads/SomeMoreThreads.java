package com.dit.threads;

import java.util.ArrayList;
import java.util.List;

import com.dit.Employee;

public class SomeMoreThreads {
	
	public static Double TOTAL_AMOUNT_WITH_ORG = new Double(325535d); 

	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "RAvi", 54343.33);
		Employee emp2 = new Employee(13, "Rahul", 344343.33);
		Employee emp3 = new Employee(3, "Ajit", 34343.33);
		
		List<Employee> emps = new ArrayList<>(); 
		emps.add(emp1);emps.add(emp2);emps.add(emp3);
		
		
		for(Employee e : emps){
			MyTask task = new MyTask(e);
			Thread t = new Thread(task);
			t.start();
		}
		System.out.println("At the end : " + Thread.currentThread().getName());
	}

}
