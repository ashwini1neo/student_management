package com.neosoft.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.student.bean.Student;

public interface StudentRepositiry extends JpaRepository<Student, Long> {

}
