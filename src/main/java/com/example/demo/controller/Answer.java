package com.example.demo.controller;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ans_id ;
    private String my_ans ;
    private String postedBy ;

}
