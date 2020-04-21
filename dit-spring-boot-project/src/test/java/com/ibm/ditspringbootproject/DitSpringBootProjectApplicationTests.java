package com.ibm.ditspringbootproject;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ibm.ditspringbootproject.services.QuizService;

//@SpringBootTest

@RunWith(SpringRunner.class)
@SpringBootTest
public class DitSpringBootProjectApplicationTests {

	
	public DitSpringBootProjectApplicationTests(){
		
	}
	
	@Autowired
	private QuizService service;
	
	
	@Test
	public void contextLoads() {
		
		assertThat(service).isNotNull();

	}
	
	@Test
	public void testService(){
		System.out.println(service.findAllQuiz());
	}
	
	

}
