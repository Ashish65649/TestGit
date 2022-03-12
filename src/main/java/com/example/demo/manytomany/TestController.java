package com.example.demo.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired private EmployeeRepo employeeRepo;
    @Autowired private ProjectRepo projectRepo;

    @GetMapping("/manytomany")
    public ResponseEntity<?> getData() {

        Employee emp1 = new Employee();
        emp1.setEmpId(12);
        emp1.setEmpName("Ashish Ranjan");

        Employee emp2 = new Employee();
        emp2.setEmpId(13);
        emp2.setEmpName("Universe Boss");

        Project project1 = new Project();
        project1.setProjectId(17);
        project1.setProjectName("Blogging Project");

        Project project2 = new Project();
        project2.setProjectId(19);
        project2.setProjectName("API Project");

        List<Employee> employees = new ArrayList<>() {{
            add(emp1);
            add(emp2);
        }};

        List<Project> projects = new ArrayList<>() {{
            add(project1);
            add(project2);
        }};

        emp1.setProjects(projects); // emp1 works on 2 projects

//        project1.setEmployees(employees); // multiple employees are working on project1

        this.employeeRepo.save(emp1);

        return new ResponseEntity<String>("Ashish is testing many to many", HttpStatus.OK);
    }

}
