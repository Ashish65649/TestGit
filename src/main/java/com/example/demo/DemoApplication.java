package com.example.demo;

import com.example.demo.controller.Answer;
import com.example.demo.controller.AnswerRepo;
import com.example.demo.controller.Question;
import com.example.demo.controller.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.AbstractCollection;
import java.util.Optional;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	QuestionRepo questionRepo;
	@Autowired
	AnswerRepo answerRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

//		Answer answer = Answer.builder().id(14).ans("Java is a programming language").postedBy("Ashish").build();
//		Question question = Question.builder().ques_id(12).qName("What is Java ?").my_answer(answer).build();
//
//		answerRepo.save(answer);
//		questionRepo.save(question);

//		Optional<Question> optional = this.questionRepo.findById(12);
//		Question question = optional.get();
//
//		System.out.println(question.getQues_id());
//		System.out.println(question.getQName());
//		Answer answer = question.getMy_answer();
//		System.out.println(answer.getId());
//		System.out.println(answer.getAns());
//		System.out.println(answer.getPostedBy());
//		Question question1 = answer.getQuestion();
//		System.out.println(question1.getQues_id());
//		System.out.println(question1.getQName());

		Optional<Answer> optional = this.answerRepo.findById(14);
		Answer answer = optional.get();
		System.out.println(answer.getId());
		System.out.println(answer.getPostedBy());
		System.out.println(answer.getAns());
		System.out.println(answer.getQuestion().getQName());

	}
}
