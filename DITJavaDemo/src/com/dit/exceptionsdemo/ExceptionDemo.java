package com.dit.exceptionsdemo;

public class ExceptionDemo {
	
	
	public static void findBook(int isbn){
		// LOGIC TO FIND BOOK
		
		throw new BookNotFoundException("ISBN not found" + isbn);
		
	}
	
	public static void m2(int x, String s){
		s.charAt(0);
//		x/0;
		
		if(x<0){
			throw new RuntimeException("x should be positive value");
			
			
		}
		System.out.println("m2");
	}
	
	public static void m1(int x) {
		
		m2(x, null);
		System.out.println("m1");
	}

	public static void main(String[] args) {
		try{
			m1(-12);
		}
		catch(Exception e){
			e.printStackTrace();
		}

		
	
//			findBook(23232);
		
			
		
		System.out.println("All is well!!");
	}

}
