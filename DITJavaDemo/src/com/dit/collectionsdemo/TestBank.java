package com.dit.collectionsdemo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestBank {

//	@Test
	public void test() {
//		fail("Not yet implemented");
		int oper1 = 2;
		int oper2 = 4;
		
//		int result = Calc.multiply(oper1, oper2);
		int result = 8;
		
		assertSame("2 X 4 should be 8", 8, result);
		
	}
	
	@Test
	public void testFindAllAtmsOfBank(){
		System.out.println("testFindAllAtmsOfBank");
		
		Branch b1 = new Branch(21, "GK", "Delhi", false);
		Branch b2 = new Branch(223, "GK2", "Delhi", true);
		Branch b3 = new Branch(223, "Malasi", "Dehradun", true);
		List<Branch> iciciBranches= new ArrayList<>(); 
		iciciBranches.add(b1);
		iciciBranches.add(b2);
		iciciBranches.add(b3);
		
		Atm a1 = new Atm(212, "Jangpura", "Delhi");
		Atm a2 = new Atm(2233, "Rajpur", "Dehradun");
		Atm a3 = new Atm(2233, "Raiwala", "Dehradun");
		List<Atm> iciciAtms= new ArrayList<>(); 
		iciciAtms.add(a1);
		iciciAtms.add(a2);
		iciciAtms.add(a3);
		
		Bank iciciBank = new Bank(1, "ICICI", iciciBranches, iciciAtms);
		
		MapDemo.bankMap.put("icici", iciciBank);
		System.out.println(MapDemo.bankMap);
		
		List<Atm> atms = MapDemo.findAllAtmsOfBank("icici", "Dehradun");
		System.out.println(atms.size());
		
		assertTrue(atms!=null);
		assertSame(2, atms.size());
		
	}

}
