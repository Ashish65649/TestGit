package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder@Getter@Setter
@Entity
@Table(name = "question")
@NoArgsConstructor@AllArgsConstructor
public class Question {

    @Id
    private int ques_id ;
    private String qName ;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL) // by default reference column is the PK of referenced class
    @JsonManagedReference
    private List<Answer> my_answer ;

}
