package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	public A(){
		
	}
	
	public A(B b){
		this.b = b;
	}
	@Autowired
	B b;
	
	public void execute(){
		
		b.execute();
		System.out.println("Execute method in A");
	}

}
