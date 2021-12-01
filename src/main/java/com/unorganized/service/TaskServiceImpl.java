package com.unorganized.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unorganized.dao.TaskRepository;
import com.unorganized.dto.Task;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;
	
	@Autowired
	public TaskServiceImpl(TaskRepository theTaskRepository)
	{
		taskRepository = theTaskRepository;
	}
	
	@Override
	public List<Task> findAll() {
		
		return taskRepository.findAll();
	}

	@Override
	public Task findById(int id) {
		
		Optional<Task> taskId = taskRepository.findById(id);
		
		Task theTask = null;
		
		if(taskId.isPresent())
		{
			theTask = taskId.get();
		}
		else
		{
			throw new RuntimeException("The Faculty ID you've entered is invalid - " + id);
		}

		return theTask;
	}

	@Override
	public void save(Task task) {
		
		taskRepository.save(task);

	}

	@Override
	public void deleteById(int id) {
		
		taskRepository.deleteById(id);
	}

}
