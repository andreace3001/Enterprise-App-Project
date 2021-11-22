package DTO;

import java.util.Date;

public class Task {
	private int taskID;
	private String title;
	private String description;
	//private Date taskDate;
	//will add taskdate later

	public Task(int taskID, String title, String description) {
		this.taskID = taskID;
		this.title = title;
		this.description = description;
		
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}
	*/
	
	
	

}
