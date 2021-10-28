package com.unorganized.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TaskDTO
{	
	private String name;
	private String description;
	private LocalDate taskDate;
	private int id;
	
	
	
	public String getTaskName() {
		return name;
	}
	public void setTaskName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTaskDate() {		
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() 
	{
		//Not sure if this is needed, will test later
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMM, yyyy", Locale.US);
		return "TaskDTO [taskName=" + name + ", "
				+ "id=" + id + ", "
				+ "description=" + description + ", "
				//+ "taskDate=" + formatter.format(taskDate) + "]";
				+ "taskDate=" + taskDate + "]";
	}
	
	
	
	

}
