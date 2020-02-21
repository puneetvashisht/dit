package com.dit.oops;

public class MountainBicycle extends Bicycle {

	public MountainBicycle(int speed) {
		super(speed);
	}
	
	public void speedUp(){
		this.speed+=2;
	}
	
	public void brakeDown(){
		this.speed-=2;
	}

	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}

	
}
