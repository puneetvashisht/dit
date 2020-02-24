package com.dit.collectionsdemo;

import java.util.List;

public class Bank {
	int id;
	String name;
	List<Branch> branches;
	List<Atm> atms;
	public Bank(int id, String name, List<Branch> branches, List<Atm> atms) {
		super();
		this.id = id;
		this.name = name;
		this.branches = branches;
		this.atms = atms;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branches=" + branches + ", atms=" + atms + "]";
	}
	
	

}
