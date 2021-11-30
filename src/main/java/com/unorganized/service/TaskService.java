package com.unorganized.service;

import java.util.List;

import com.unorganized.dto.Task;

public interface TaskService {
	
	public List<Task> findAll();
	public Task findById(int id);
	public void save(Task task);
	public void deleteById(int id);

}
