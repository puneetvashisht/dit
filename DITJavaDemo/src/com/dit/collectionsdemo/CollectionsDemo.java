package com.dit.collectionsdemo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
	
	public static void printList(Collection<String> list){
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("sdgklsdkl");
		list.add("gsd");
//		list.get(0)
		list.add(1, "another string");
		
//		for(Object element : list){
//			System.out.println(element);
//			String str = (String)element;
//			System.out.println(str.charAt(0));
//			
//		}
		
		for(String str: list){
			System.out.println(str.charAt(0));
		}
		
		System.out.println(list);
	}

}
