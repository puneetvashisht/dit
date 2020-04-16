package com.ibm.ditspringbootproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.ditspringbootproject.entities.Quiz;



public interface QuizRepository extends JpaRepository<Quiz, Integer>{
	public Quiz findByName(String name);

}