package com.unorganized.service;

import com.unorganized.dto.TaskDTO;

/** * 
 * CRUD operations for task
 *
 */
public interface ITaskService 
{
	
	/**
	 * Get a task from persistence layer
	 * @param id
	 * @return A task with a matching ID
	 */
	TaskDTO fetchBy(int id);
	
	/** 
	 * Persist the given DTO
	 * @param TaskDTO
	 * 
	 */
	void save(TaskDTO taskDTO);

}
