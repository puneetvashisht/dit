package com.dit.collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	
	static Map<String, Bank> bankMap= new HashMap<>();
	
	public static void main(String[] args) {
		
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
		
		bankMap.put("icici", iciciBank);
		System.out.println(bankMap);
		
		
//		Map<Long, Employee> employeeMap = new TreeMap<>();
//		
//		Employee e2 = new Employee(12, "Priya", 44343.34);
//		Employee e3 = new Employee(11, "Sumeet", 24343.34);
//		Employee e4 = new Employee(9, "Rahul", 54343.34);
//		
//		employeeMap.put(9999888777l, e2);
//		employeeMap.put(9999888776l, e3);
//		employeeMap.put(9999888775l, e4);
//		
//		System.out.println(employeeMap);
//		
//		Set<Long> keys = employeeMap.keySet();
//		System.out.println(keys);
//		for(Long key : keys){
////			System.out.println(employeeMap.get(key));
//		}
//		
//		Set<Entry<Long, Employee>> entrySet = employeeMap.entrySet();
//		
//		for(Entry<Long, Employee> entry: entrySet){
//			System.out.println(entry);
//			System.out.println();
//		}
////		
////		System.out.println(entrySet);
//		
//		
//		System.out.println(employeeMap.get(9999888775l));
		
		System.out.println(findAllAtmsOfBank("icici", "Dehradun"));
		

	}
	
	public static List<Atm> findAllAtmsOfBank(String bankName, String location){
		List<Atm> foundAtms = new ArrayList<>();
		
	
		
		Bank bank = bankMap.get(bankName);
		List<Atm> atms = bank.atms;
		for(Atm atm: atms){
			if(atm.location.equals(location)){
				foundAtms.add(atm);
			}
		}

		return foundAtms;
	}

}
