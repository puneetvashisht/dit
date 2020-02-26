package com.dit.threads;

import com.dit.Employee;

public class MyTask implements Runnable{

	Employee e;
	
	public MyTask(Employee e){
		this.e=e;
	}
	
	@Override
	public void run() {
		// totalAmountWithOrganization - e.salary
		
		synchronized (SomeMoreThreads.class) {
			SomeMoreThreads.TOTAL_AMOUNT_WITH_ORG = SomeMoreThreads.TOTAL_AMOUNT_WITH_ORG - e.getSalary();	
		}
//		System.out.println(SomeMoreThreads.TOTAL_AMOUNT_WITH_ORG);
//	
//		decrementAmount();
		System.out.println("This is going to be run by a thread " + Thread.currentThread().getName());
		
	}
	
	public synchronized  void decrementAmount(){
		
	}

}
