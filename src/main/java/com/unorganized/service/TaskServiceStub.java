package com.unorganized.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.unorganized.dto.TaskDTO;

@Component
public class TaskServiceStub implements ITaskService
{

	//Just giving us something to start from 
	@Override
	public TaskDTO fetchBy(int id) {
		
		TaskDTO taskDTO = new TaskDTO();
		taskDTO.setTaskName("Evade taxes");
		taskDTO.setDescription("Commit tax evasion");
		taskDTO.setTaskDate(LocalDate.of(2021, 11, 27));	
		
		taskDTO.setId(69);
		
		return taskDTO;
	}

	@Override
	public void save(TaskDTO taskDTO) {
		// TODO Auto-generated method stub
		
	}
	

}
