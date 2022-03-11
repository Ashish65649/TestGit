package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity@Getter
@Table(name = "answer")
@NoArgsConstructor@AllArgsConstructor
@Builder@Setter
public class Answer {

    @Id
    private int id ;
    private String ans ;
    private String postedBy ;

    @ManyToOne
    @JoinColumn(name = "FK_answer")
    @JsonBackReference
    private Question question ;

}
