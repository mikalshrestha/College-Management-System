package com.mikal.CollegeManagementSystem.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikal.CollegeManagementSystem.entities.Role;
import com.mikal.CollegeManagementSystem.repositories.RoleRepository;

@Service
public class RoleService {
	
@Autowired RoleRepository roleRepository;
	
	public Role addUserRole(Role role) {
		return roleRepository.saveAndFlush(role);
	}

}
