package com.dit.oops;

public class TestInheritance {

	public static void main(String[] args) {
		RoadBicycle rb = new RoadBicycle(0);
//		rb.speedUp();
//		System.out.println(rb);
//		rb.brakeDown();
//		System.out.println(rb);
		
		Bicycle mb = new MountainBicycle(0);
//		mb.speedUp();
//		System.out.println(mb);
//		mb.brakeDown();
//		System.out.println(mb);
		
		Bicycle bb = new MountainBicycle(2);
		
		IBicycle bicycles[]= {rb, mb, bb};
		
		for(IBicycle b: bicycles){
			b.speedUp();
			System.out.println(b);
			b.brakeDown();
			System.out.println(b);
			b.gearUp();
		}

	}

}
