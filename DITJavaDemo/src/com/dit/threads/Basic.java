package com.dit.threads;

import java.util.ArrayList;
import java.util.List;

import com.dit.Employee;

class MyRunnable implements Runnable{
  
	Employee e;
	MyRunnable(Employee e){
		this.e = e;
	}
	
	@Override
	public void run() {
		System.out.println("*****" + Thread.currentThread().getName());
		this.e.incrementSalary(5000);
		System.out.println(e);
	}
	
}


public class Basic {
	


	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "RAvi", 54343.33);
		Employee emp2 = new Employee(13, "Rahul", 344343.33);
		Employee emp3 = new Employee(3, "Ajit", 34343.33);
		
		List<Employee> emps = new ArrayList<>(); 
		emps.add(emp1);emps.add(emp2);emps.add(emp3);
		
		for(Employee e : emps){
			Thread t = new Thread(new MyRunnable(e));
			t.start();
		}
		
		
		System.out.println("Alls well .." + Thread.currentThread().getName());

	}

}
