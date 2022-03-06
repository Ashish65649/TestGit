package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    QuestionRepo questionRepo;

    @Autowired
    AnswerRepo answerRepo ;

    @GetMapping("/question")
    public ResponseEntity<?> getQuestion() {
        Optional<Question> optional = this.questionRepo.findById(12);
        Question question = optional.get();
        return new ResponseEntity<>(question,HttpStatus.OK);

//        Optional<Answer> optional = this.answerRepo.findById(14);
//        Answer answer = optional.get();
//        return new ResponseEntity<>(answer,HttpStatus.OK);
    }

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        return new ResponseEntity<String>("Ashish Boss test is my new name", HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        return new ResponseEntity<String>("Universe Boss", HttpStatus.OK);
    }

    @GetMapping("/collegeName")
    public ResponseEntity<String> getCollegeName() {
        return new ResponseEntity<String>("LNCT College is best post", HttpStatus.CREATED);
    }

}
