package com.example.demo;

import com.example.demo.controller.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setName("Ashish Ranjan");
		student.setRoll(45);
		System.out.println(student);

	}
}
