package com.mikal.CollegeManagementSystem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mikal.CollegeManagementSystem.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
