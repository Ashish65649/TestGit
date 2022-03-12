package com.example.demo;

import com.example.demo.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication(scanBasePackages = "com.example.demo.manytomany")
public class DemoApplication implements CommandLineRunner {

	@Autowired
	QuestionRepo questionRepo;
	@Autowired
	AnswerRepo answerRepo;
	@Autowired
	PANRepo panRepo;
	@Autowired
	AadharRepo aadharRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

//		Aadhar aadhar = Aadhar.builder().aadharId(458).aadharNo("14785236").userName("Ashish Ranjan").build();
//		PAN pan = PAN.builder().panId(259).panNo("DAD-PR3987K").aadharCard(aadhar).build();
//		aadhar.setPanCard(pan);
//		this.aadharRepo.save(aadhar);

//		Optional<Aadhar> optional = this.aadharRepo.findById(458);
//		Aadhar aadhar1 = optional.get();
//		System.out.println(aadhar1.getAadharNo());
//		System.out.println(aadhar1.getAadharId());
//		System.out.println(aadhar1.getUserName());
//		PAN pan1 = aadhar1.getPanCard();
//		System.out.println(pan1.getPanId());
//		System.out.println(pan1.getPanNo());
//		System.out.println(pan1.getAadharCard().getAadharId());

//		Question question = Question.builder().ques_id(12).qName("What is Java ?").build();
//		Answer answer = Answer.builder().id(14).ans("Java is a programming language").postedBy("Ashish").
//				question(question).build();
//		Answer answer1 = Answer.builder().id(15).ans("A way to code projects").postedBy("Universe Boss").
//				question(question).build();
//		Answer answer2 = Answer.builder().id(16).ans("Java provides many APIs to work with").postedBy("V Putin").
//				question(question).build();
//		List<Answer> list = List.of(answer, answer1, answer2);
//		question.setMy_answer(list);
//		this.questionRepo.save(question);

//		Optional<Question> optional = this.questionRepo.findById(12);
//		Question question = optional.get();

//		System.out.println(question.getQues_id());
//		System.out.println(question.getQName());
//		Answer answer = question.getMy_answer();
//		System.out.println(answer.getId());
//		System.out.println(answer.getAns());
//		System.out.println(answer.getPostedBy());
//		Question question1 = answer.getQuestion();
//		System.out.println(question1.getQues_id());
//		System.out.println(question1.getQName());

//		Optional<Answer> optional = this.answerRepo.findById(14);
//		Answer answer = optional.get();
//		System.out.println(answer.getId());
//		System.out.println(answer.getPostedBy());
//		System.out.println(answer.getAns());
//		System.out.println(answer.getQuestion().getQName());

	}
}
