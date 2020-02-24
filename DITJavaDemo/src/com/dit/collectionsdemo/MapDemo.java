package com.dit.collectionsdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Long, Employee> employeeMap = new TreeMap<>();
		
		Employee e2 = new Employee(12, "Priya", 44343.34);
		Employee e3 = new Employee(11, "Sumeet", 24343.34);
		Employee e4 = new Employee(9, "Rahul", 54343.34);
		
		employeeMap.put(9999888777l, e2);
		employeeMap.put(9999888776l, e3);
		employeeMap.put(9999888775l, e4);
		
		System.out.println(employeeMap);
		
		Set<Long> keys = employeeMap.keySet();
		System.out.println(keys);
		for(Long key : keys){
//			System.out.println(employeeMap.get(key));
		}
		
		Set<Entry<Long, Employee>> entrySet = employeeMap.entrySet();
		
		for(Entry<Long, Employee> entry: entrySet){
			System.out.println(entry);
		}
//		
//		System.out.println(entrySet);
		
		
		System.out.println(employeeMap.get(9999888775l));
		

	}

}
