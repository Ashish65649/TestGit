package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Builder@Getter
@Entity
@Table(name = "question")
@NoArgsConstructor@AllArgsConstructor
public class Question {

    @Id
    private int ques_id ;
    private String qName ;

    @OneToOne
    @JoinColumn(name = "FK_answer")    // by default reference column is the PK of referenced class
    @JsonManagedReference
    private Answer my_answer ;

}
