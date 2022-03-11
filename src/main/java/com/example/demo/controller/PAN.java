package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Setter@AllArgsConstructor@Builder
@NoArgsConstructor@Getter
public class PAN {

    @Id
    private int panId;
    private String panNo ;
    @OneToOne
    @JoinColumn(name = "aadhar_no")
    @JsonBackReference
    private Aadhar aadharCard ;
}
