package com.ibm.ditspringbootproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ditspringbootproject.entities.Question;
import com.ibm.ditspringbootproject.entities.Quiz;
import com.ibm.ditspringbootproject.services.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class QuizController {

	@Autowired
	QuizService quizService;

	@PostMapping("/question")
	public ResponseEntity<Void> addQuestion(@RequestBody Question question) {
		quizService.addQuestions(question);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;

	}
	
	@GetMapping("/question")
	public List<Question> findAllQuestions(){
		return quizService.findAllQuestion();
	}
	@GetMapping("/quiz/{name}")
	public Quiz findQuizByName(@PathVariable("name") String name){
		return quizService.findQuizByName(name);
	}
	
	@PostMapping("/quiz")
	public ResponseEntity<Void> addQuiz(@RequestBody Quiz quiz) {
		quizService.addQuiz(quiz);
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.CREATED);
		return re;

	}
	
	@GetMapping("/quiz")
	public List<Quiz> findAllQuiz(){
		return quizService.findAllQuiz();
	}

}
