package com.mikal.CollegeManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mikal.CollegeManagementSystem.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	public User findByEmail(String email);
    public User findByEmailEquals(String email);
    public User findById(int id);

    
    @Query("select u from User u where u.userName = :userName")
    User findByUserName(@Param("userName") String userName);

}
