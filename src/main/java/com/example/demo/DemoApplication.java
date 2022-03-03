package com.example.demo;

import com.example.demo.controller.Answer;
import com.example.demo.controller.AnswerRepo;
import com.example.demo.controller.Question;
import com.example.demo.controller.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	Repo repo;

	@Autowired
	AnswerRepo answerRepo ;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Answer answer = new Answer();
		answer.setMy_ans("Java is language");
		answer.setPostedBy("Ashish Ranjan");

		this.answerRepo.save(answer);

		Question question = Question.builder().qName("What is Java ?").answer(answer).build();
		this.repo.save(question);

	}
}
