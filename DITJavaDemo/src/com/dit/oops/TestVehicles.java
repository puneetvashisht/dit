package com.dit.oops;

public class TestVehicles {

	public static void main(String[] args) {
		Engine carEngine = new CarEngine(1000, "ford");
		
		Vehicle car = new Car(300, carEngine);
		car.start();
		
		
		PlaneEngine planeEngine = new PlaneEngine(99999, "airbus");
		Plane plane = new Plane(1000, 10000, planeEngine);
		plane.start();

	}

}
