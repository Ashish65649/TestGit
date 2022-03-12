package com.example.demo.manytomany;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data@Entity
public class Project {
    @Id
    private int projectId ;
    private String projectName ;
    @ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();

}
