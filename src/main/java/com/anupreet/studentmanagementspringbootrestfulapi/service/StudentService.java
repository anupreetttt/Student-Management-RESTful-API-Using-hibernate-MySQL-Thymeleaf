package com.anupreet.studentmanagementspringbootrestfulapi.service;

import com.anupreet.studentmanagementspringbootrestfulapi.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
