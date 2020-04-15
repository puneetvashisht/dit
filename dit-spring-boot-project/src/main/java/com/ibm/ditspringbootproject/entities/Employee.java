package com.ibm.ditspringbootproject.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="selectEmployeeByName", query="select e from Employee e where e.name=:fname")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="EMP_NAME")
	String name;
	Double salary;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	List<Address> addresses;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public Employee(){
		
	}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	

//public List<Address> getAddresses() {
//		return addresses;
//	}
//	public void setAddresses(List<Address> addresses) {
//		this.addresses = addresses;
//	}
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address="  + "]";
	}
	//	@Override
//	public boolean equals(Object obj){
//	Employee emp = (Employee) obj;
//		return this.id == emp.id;
//		
//	}
//	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	

}

