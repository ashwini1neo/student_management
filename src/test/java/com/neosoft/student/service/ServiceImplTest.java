package com.neosoft.student.service;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neosoft.student.bean.Project;
import com.neosoft.student.bean.Role;
import com.neosoft.student.bean.Student;
import com.neosoft.student.repository.StudentRepositiry;

@SpringBootTest
public class ServiceImplTest {

	
	@Autowired
	private StudentRepositiry repo;
	
	
	@Test
	public void testAddStudent() {
		

		Set<Project> projects=new HashSet<>();
		Project Project1=Project.builder().projName("P1").duration(1).build();
		Project Project2=Project.builder().projName("P2").duration(10).build();
		Project Project3=Project.builder().projName("P3").duration(2).build();
	
		projects.add(Project1);
		projects.add(Project2);
		projects.add(Project3);
	
		
		Student student=Student.builder()
				.firsName("Ashwini")
				.lastName("Sharma")
				.email("AS@gmail.com")
				.role("student")
				.projects(projects)
				.build();
		
		
		repo.save(student);
		}
}
