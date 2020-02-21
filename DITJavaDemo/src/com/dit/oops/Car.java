package com.dit.oops;

public class Car extends Vehicle{
	
	public Car(int speed, Engine engine){
		super(speed, engine);
		
	}

	@Override
	public void start() {
		this.engine.startEngine();
		System.out.println("Starting car --- ");
		System.out.println(this);
		
	}

	
	

}
