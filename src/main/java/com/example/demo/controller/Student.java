package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(
        {"name"}
)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @JsonIgnore
    private int roll ;
    private String name ;
    private String college ;
    private String company ;

}
