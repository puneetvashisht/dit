package com.dit.oops;

public class Plane extends Vehicle{
	
	int altitude;

	public Plane(int speed, int altitude, Engine engine) {
		super(speed, engine);
		this.altitude = altitude;
	}

	@Override
	public void start() {
		this.engine.startEngine();
		System.out.println("Starting plane --- ");
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Plane [altitude=" + altitude + ", speed=" + speed + ", engine=" + engine + "]";
	}
	
	
	
	

}
