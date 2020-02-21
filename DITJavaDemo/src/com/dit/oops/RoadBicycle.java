package com.dit.oops;

public class RoadBicycle extends Bicycle {

	public RoadBicycle(int speed) {
		super(speed);
	}
	
	public void speedUp(){
		this.speed++;
	}
	
	public void brakeDown(){
		this.speed--;
	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}
	
	

	
}
