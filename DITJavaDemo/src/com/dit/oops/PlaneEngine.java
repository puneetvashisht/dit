package com.dit.oops;

public class PlaneEngine extends Engine{

	public PlaneEngine(int cc, String make) {
		super(cc, make);
		
	}

	@Override
	public void startEngine() {
		System.out.println("Starting plane engine ----");
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "PlaneEngine [cc=" + cc + ", make=" + make + "]";
	}
	
	

}
