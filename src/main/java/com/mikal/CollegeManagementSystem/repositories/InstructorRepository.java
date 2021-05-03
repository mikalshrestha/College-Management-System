package com.mikal.CollegeManagementSystem.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mikal.CollegeManagementSystem.entities.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer>{
	

	Instructor findById(int id) ;

	
//	Instructor findOne(int id) ; 

}
