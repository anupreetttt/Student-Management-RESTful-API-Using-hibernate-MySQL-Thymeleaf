package com.anupreet.studentmanagementspringbootrestfulapi.repository;

import com.anupreet.studentmanagementspringbootrestfulapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
