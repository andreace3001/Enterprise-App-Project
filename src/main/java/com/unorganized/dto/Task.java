package com.unorganized.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="email")
	private Boolean daily;
	
	public Task() {}
		
	public Task(int id, String name, String description, Boolean daily) 
	{		
		this.id = id;
		this.name = name;
		this.description = description;
		this.daily = daily;		
	}	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
	

	public Boolean getDaily() {
		return daily;
	}

	public void setDaily(Boolean daily) {
		this.daily = daily;
	}

	@Override
	public String toString() 	
	{
		
		return "TaskDTO [id= " + id + ", " 
				+ "taskName=" + name + ", "				
				+ "description=" + description + ", "				
				+ "taskDate=" + daily + "]";
	}
	
	
	
	

}
