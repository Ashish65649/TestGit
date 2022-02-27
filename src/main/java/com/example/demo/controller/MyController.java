package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        return new ResponseEntity<String>("Ashish is my new name", HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<String> getName() {
        return new ResponseEntity<String>("Universe Boss", HttpStatus.OK);
    }

}
