package com.dhyanahitha.studentportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.dhyanahitha.controller")
public class StudentportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentportalApplication.class, args);
	}

}
