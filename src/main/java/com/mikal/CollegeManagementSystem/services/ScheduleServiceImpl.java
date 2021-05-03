package com.mikal.CollegeManagementSystem.services;


import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mikal.CollegeManagementSystem.entities.Schedule;
import com.mikal.CollegeManagementSystem.repositories.ScheduleRepository;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService{
	
private final ScheduleRepository scheduleRepository;

	
	public ScheduleServiceImpl(ScheduleRepository scheduleRepository){
		this.scheduleRepository = scheduleRepository ; 
	}
	
	@Override
	public void addSchedule(Schedule schedule) {
		scheduleRepository.save(schedule);
		
	}

	@Override
	public List<Schedule> getSchedule() {
		List<Schedule> schedules= new ArrayList<>();
		scheduleRepository.findAll().forEach(schedules::add);
		return schedules;
	}

}
