package com.unorganized.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unorganized.dto.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	public List<Task> findAll();
	
}
