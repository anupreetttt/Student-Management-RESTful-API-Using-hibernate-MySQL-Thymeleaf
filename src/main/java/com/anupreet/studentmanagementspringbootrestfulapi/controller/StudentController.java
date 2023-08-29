package com.anupreet.studentmanagementspringbootrestfulapi.controller;

import com.anupreet.studentmanagementspringbootrestfulapi.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler methods to handle list students and return model and view

    @GetMapping("/students")
    public String listOfStudent(Model model) {

        model.addAttribute("students", studentService.getAllStudents());
        return "students";

    }
}
