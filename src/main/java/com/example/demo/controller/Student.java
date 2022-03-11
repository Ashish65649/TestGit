package com.example.demo.controller;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data

public class Student extends People {

    private int roll;
    private String collegeName ;
    private Address address ;

}
