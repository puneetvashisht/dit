package com.dit.oops;

public abstract class Vehicle {
	
	int speed;
	Engine engine;
	
	public Vehicle(int speed, Engine engine) {
		this.speed = speed;
		this.engine = engine;
	}

	public abstract void start();
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", engine=" + engine + "]";
	}
	

}
