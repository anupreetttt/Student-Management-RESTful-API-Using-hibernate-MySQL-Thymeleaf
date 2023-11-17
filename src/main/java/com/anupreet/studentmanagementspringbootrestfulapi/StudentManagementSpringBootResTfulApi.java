package com.anupreet.studentmanagementspringbootrestfulapi;

import com.anupreet.studentmanagementspringbootrestfulapi.entity.Student;
import com.anupreet.studentmanagementspringbootrestfulapi.repository.StudentRepository;
import com.anupreet.studentmanagementspringbootrestfulapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSpringBootResTfulApi implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSpringBootResTfulApi.class, args);

		System.out.println("Hello there");
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("hello", "world", "anu@email.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("john", "Cena", "sam@email.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Peaky", "Blinders", "sam@easdadmail.com");
//		studentRepository.save(student3);
	}
}
