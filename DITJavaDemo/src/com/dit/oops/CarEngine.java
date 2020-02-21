package com.dit.oops;

public class CarEngine extends Engine {

	public CarEngine(int cc, String make) {
		super(cc, make);
		
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine ----");
		System.out.println(this);
		
		
	}

	@Override
	public String toString() {
		return "CarEngine [cc=" + cc + ", make=" + make + "]";
	}
	
	
	
	

}
