package com.mikal.CollegeManagementSystem.services;

import java.util.List;

import com.mikal.CollegeManagementSystem.entities.Schedule;

public interface ScheduleService {
	
void addSchedule(Schedule schedule);
	
	List<Schedule> getSchedule() ; 

}
