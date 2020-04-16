package com.ibm.ditspringbootproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Option {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String text;
	boolean isAns;


	public Option(int id, String text, boolean isAns) {
	super();
	this.id = id;
	this.text = text;
	this.isAns = isAns;
}
	
	public Option() {
	super();
}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public boolean isAns() {
		return isAns;
	}

	public void setAns(boolean isAns) {
		this.isAns = isAns;
	}
	@Override
	public String toString() {
		return "Options [id=" + id + ", options=" + text + ", isAns=" + isAns + "]";
	}


	
}