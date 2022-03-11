package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerRepo answerRepo ;
    @Autowired
    AadharRepo aadharRepo;
    @Autowired
    PANRepo panRepo;

    @GetMapping("/aadhar")
    public ResponseEntity<?> saveAadhar() {
        PAN pan = PAN.builder().panId(450).panNo("45697KOP").build();
        Aadhar aadhar = Aadhar.builder().aadharId(101).aadharNo("122345698").userName("Ashish Boss").panCard(pan).build();
        pan.setAadharCard(aadhar);
        this.aadharRepo.save(aadhar);

        Optional<Aadhar> optional = this.aadharRepo.findById(101);
        Aadhar aadhar1 = optional.get();

        return new ResponseEntity<>(aadhar1,HttpStatus.OK);
    }

    @GetMapping("/question")
    public ResponseEntity<?> getQuestion() {
        Optional<Question> optional = this.questionRepo.findById(12);
        Question question = optional.get();
        return new ResponseEntity<>(question,HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveAnswer(@RequestBody Map<String,String> map) {
        Answer answer = Answer.builder().ans(map.get("ans")).id(Integer.parseInt(map.get("id"))).postedBy(map.get("name")).build();
        int questionId = Integer.parseInt(map.get("questionId"));
        Optional<Question> optional = this.questionRepo.findById(questionId);
        answer.setQuestion(optional.get());
        this.answerRepo.save(answer);
        return new ResponseEntity<>("Your answer has been saved successfully", HttpStatus.OK);
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
