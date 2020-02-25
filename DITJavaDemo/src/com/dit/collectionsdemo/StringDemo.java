package com.dit.collectionsdemo;

public class StringDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String str1 = "ravi";
		String str2 = "ravi";
		
//		StringBuffer str = new StringBuffer("");
		String str = "";
		
		System.out.println(str);
		
		
		for( int i= 0; i<10000000; i++){
			Thread.sleep(200);
			str+=i;
//			str.append(i);
		}
		System.out.println(str);
		
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
