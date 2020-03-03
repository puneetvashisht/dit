package com.viva.inherit.entities.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class ContractEmployee extends Employee{
	
	double payPerHour;
	int duration;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(String name, double payPerHour, int duration) {
		super(name);
		this.payPerHour = payPerHour;
		this.duration = duration;
	}
	public double getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", duration=" + duration + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	

}
