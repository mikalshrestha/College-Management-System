package com.mikal.CollegeManagementSystem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mikal.CollegeManagementSystem.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Student findById(int id); 

}
