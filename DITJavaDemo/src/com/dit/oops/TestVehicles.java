package com.dit.oops;

public class TestVehicles {

	public static void main(String[] args) {
		Engine carEngine = new CarEngine(1000, "ford");
		
		Vehicle car = new Car(300, carEngine);
		car.start();

	}

}
