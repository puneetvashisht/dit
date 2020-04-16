package com.ibm.ditspringbootproject.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String text;
	@OneToMany(cascade=CascadeType.ALL)
	List<Choice> choices;
	public Question(int id, String text, List<Choice> choices) {
		super();
		this.id = id;
		this.text = text;
		this.choices = choices;
	}
	public Question() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettext() {
		return text;
	}
	public void settext(String text) {
		this.text = text;
	}
	public List<Choice> getChoices() {
		return choices;
	}
	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", choices=" + choices + "]";
	}

	
	
}
