package com.example.demo.manytomany;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data@Entity
public class Employee {

    @Id
    private int empId ;
    private String empName ;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employee_project",
            joinColumns = { @JoinColumn(name = "empId") },
            inverseJoinColumns = { @JoinColumn(name = "projectId") }
    )
    private List<Project> projects = new ArrayList<>();

}
