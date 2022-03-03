package com.example.demo.controller;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    private int ans_id ;
    private String my_ans ;
    private String postedBy ;

}
