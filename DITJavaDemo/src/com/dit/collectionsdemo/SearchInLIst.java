package com.dit.collectionsdemo;

import java.util.ArrayList;

class Fruit{
	String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	@Override
	 public boolean equals(Object obj) {
		Fruit f = (Fruit)obj;
		return this.name.equals(f.name);
	 }
	
	
}

public class SearchInLIst {

	public static void main(String[] args) {
		ArrayList<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Banana"));
		
//		System.out.println(fruits);
		
		Fruit f1 = new Fruit("Pineapple");
		f1.equals(new Fruit("Pineapple"));
		
//		System.out.println(fruits.contains(new Fruit("Apple")));
		
		
		Employee e1 = new Employee(13, "Ravi", 34343.34);
		Employee e3 = e1;
		Employee e2 = new Employee(13, "Ravi", 34343.34);
		
		System.out.println(e1.equals(e2));
		
		

	}

}
