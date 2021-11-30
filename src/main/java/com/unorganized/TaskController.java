package com.unorganized;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unorganized.dto.Task;
import com.unorganized.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController 
{	
	
	public TaskService taskService;
	
	public TaskController(TaskService theTaskService)
	{
		taskService = theTaskService;
		
	}
	
	//Mapping for "/list"
	@GetMapping("/list")
	public String listFaculties(Model theModel)
	{
		
		//Retrieve faculties from the database
		List<Task> theTasks = taskService.findAll();
		
		
		//Add Faculties to the Spring Model
		theModel.addAttribute("tasks", theTasks);
		
		return "start";
	}
	
	
	
	
	
	
	
	

}
