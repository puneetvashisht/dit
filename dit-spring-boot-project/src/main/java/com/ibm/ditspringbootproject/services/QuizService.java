package com.ibm.ditspringbootproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.ditspringbootproject.entities.Question;
import com.ibm.ditspringbootproject.entities.Quiz;
import com.ibm.ditspringbootproject.repos.QuestionRepository;
import com.ibm.ditspringbootproject.repos.QuizRepository;

@Service
public class QuizService {
	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	QuizRepository quizRepository;
	
//	@Autowired
//	OptionsRepository optionsRepository;

	public Question addQuestions(Question question) {
		return questionRepository.save(question);
		
	}

	@Transactional
	public List<Question> findAllQuestion() {
		List<Question> questions =  questionRepository.findAll();
//		System.out.println(questions);
		return questions;
	}
	
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
		
	}

	public List<Quiz> findAllQuiz() {
		List<Quiz> quizzes =  quizRepository.findAll();
//		System.out.println(quizzes);
		return quizzes;
	}

	public Quiz findQuizByName(String name) {
		return quizRepository.findByName(name);
	}
}
