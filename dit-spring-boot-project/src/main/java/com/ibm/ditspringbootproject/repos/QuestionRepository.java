package com.ibm.ditspringbootproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.ditspringbootproject.entities.Question;



public interface QuestionRepository extends JpaRepository<Question, Integer>{

}