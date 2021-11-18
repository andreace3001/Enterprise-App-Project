package com.unorganized.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TaskDTO
{	
	private String name;
	private String description;
	private LocalDate date;	
	
	public TaskDTO() {}
		
	public TaskDTO(String name, String description, LocalDate taskDate) {		
		this.name = name;
		this.description = description;
		this.date = taskDate;		
	}
	
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
		return date;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.date = taskDate;
	}	
	
	
	@Override
	public String toString() 
	{
		//Not sure if this is needed, will test later
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMM, yyyy", Locale.US);
		return "TaskDTO [taskName=" + name + ", "				
				+ "description=" + description + ", "
				//+ "taskDate=" + formatter.format(taskDate) + "]";
				+ "taskDate=" + date + "]";
	}
	
	
	
	

}
