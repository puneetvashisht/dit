package com.viva.inherit.entities.tableperclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee{
	
	double salary;
	int noticePeriod;
	public RegularEmployee() {
		super();
	}
	public RegularEmployee(String name, double salary, int noticePeriod) {
		super(name);
		this.salary = salary;
		this.noticePeriod = noticePeriod;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", noticePeriod=" + noticePeriod + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	
	
	

}
