package com.mikal.CollegeManagementSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mikal.CollegeManagementSystem.entities.Role;
import com.mikal.CollegeManagementSystem.services.RoleService;

@Controller
public class RoleController {
	 @Autowired RoleService roleService;	
		
	    //add user role
		public Role addUserRole(Role role) {
			return roleService.addUserRole(role);
		}

}
