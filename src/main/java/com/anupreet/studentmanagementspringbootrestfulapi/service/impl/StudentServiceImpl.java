package com.anupreet.studentmanagementspringbootrestfulapi.service.impl;

import com.anupreet.studentmanagementspringbootrestfulapi.entity.Student;
import com.anupreet.studentmanagementspringbootrestfulapi.repository.StudentRepository;
import com.anupreet.studentmanagementspringbootrestfulapi.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
