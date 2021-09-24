package com.neosoft.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.student.bean.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
