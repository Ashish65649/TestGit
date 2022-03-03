package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/student")
    public ResponseEntity<?> getStudent() {
        return null;
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
