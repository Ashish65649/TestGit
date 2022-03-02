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

		Student student = Student.builder().name("Apple").college("IIT Bombay").roll(45).company("Infosys").build();

		System.out.println(student);

	}
}
