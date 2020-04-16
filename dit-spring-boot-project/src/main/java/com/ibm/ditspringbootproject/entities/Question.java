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
//	@JoinColumn(name="question_id_fk",referencedColumnName="id")
	List<Option> options;

	public Question(int id, String text, List<Option> options) {
		super();
		this.id = id;
		this.text = text;
		this.options = options;
	}
	
	public Question() {
		super();
	}

	public String getQuestion() {
		return text;
	}

	public void setQuestion(String text) {
		this.text = text;
	}

	
	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", question=" + text + ", options=" + options + "]";
	}
	
}