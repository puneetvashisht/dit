package com.ibm;

public class A {
	public A(){
		
	}
	
	public A(B b){
		this.b = b;
	}
	
	B b;
	
	public void execute(){
		
		b.execute();
		System.out.println("Execute method in A");
	}

}
