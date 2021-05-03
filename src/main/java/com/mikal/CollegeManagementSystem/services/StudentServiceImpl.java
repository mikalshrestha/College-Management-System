package com.mikal.CollegeManagementSystem.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikal.CollegeManagementSystem.entities.Student;
import com.mikal.CollegeManagementSystem.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
		
	}


	@Override
	public List<Student> getAllStudents() {
		
		List<Student> students= new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	@Override
	public Student getStudent(int id) {
		
		return studentRepository.findById(id);
	}


}
