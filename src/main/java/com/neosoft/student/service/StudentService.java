package com.neosoft.student.service;

import java.util.List;

import com.neosoft.student.bean.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	
	public List<Student> getAll();
	
//	/public Student getById(Long id);

	public Student getStudentById(Long id);

}
