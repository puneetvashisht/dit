package com.ibm.ditspringbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.ditspringbootproject.entities.Question;
import com.ibm.ditspringbootproject.repos.QuestionRepository;

@Service
public class QuizService {
	@Autowired
	QuestionRepository questionRepository;
	
//	@Autowired
//	OptionsRepository optionsRepository;

	public Question addQuestions(Question question) {
		return questionRepository.save(question);
		
	}

	public List<Question> findAllQuestion() {
		return questionRepository.findAll();
	}
}
