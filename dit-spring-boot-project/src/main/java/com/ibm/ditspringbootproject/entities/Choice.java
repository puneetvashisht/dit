package com.ibm.ditspringbootproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Choice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String text;
	Boolean isAnswer;
	public Choice(){
		
	}
	
	public Choice(int id, String text, Boolean isAnswer) {
		super();
		this.id = id;
		this.text = text;
		this.isAnswer = isAnswer;
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
	public Boolean getIsAnswer() {
		return isAnswer;
	}
	public void setIsAnswer(Boolean isAnswer) {
		this.isAnswer = isAnswer;
	}
	
	
	
}
