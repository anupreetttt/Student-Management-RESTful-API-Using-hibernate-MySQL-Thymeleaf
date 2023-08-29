package com.anupreet.studentmanagementspringbootrestfulapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSpringBootResTfulApi implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSpringBootResTfulApi.class, args);

		System.out.println("Hello there");
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
