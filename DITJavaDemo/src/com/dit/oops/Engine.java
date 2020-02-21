package com.dit.oops;

public abstract class Engine {
	
	int cc;
	String make;
	
	
	
	public Engine(int cc, String make) {
		super();
		this.cc = cc;
		this.make = make;
	}



	public abstract void startEngine();

}
