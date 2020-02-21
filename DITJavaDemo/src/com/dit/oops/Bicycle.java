package com.dit.oops;

public abstract class Bicycle implements IBicycle {
	
	int speed;
	int gear;

	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public void gearUp(){
		this.gear++;
	}
	
	public void gearDown(){
		this.gear--;
	}
	
	

	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + "]";
	}
	
	

}
