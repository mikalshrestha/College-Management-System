package com.mikal.CollegeManagementSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.mikal.CollegeManagementSystem.entities.User;
import com.mikal.CollegeManagementSystem.services.UserServices;

@Controller
public class UserController {
	

	@Autowired UserServices userServices;
	
	@PostMapping("/createUser")
	public User createUser(User user) {
		return userServices.createUser(user);
	}
	
	/*
	//get user by id
	public User findById(int id) {
		return userServices.findUserById(id);
			
	}
	
	*/

}
