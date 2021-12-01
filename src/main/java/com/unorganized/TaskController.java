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
@RequestMapping("/")
public class TaskController 
{	
	
	public TaskService taskService;
	
	public TaskController(TaskService theTaskService)
	{
		taskService = theTaskService;
		
	}	
	
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String listTasks(Model theModel)
	{
		
		List<Task> theTasks = taskService.findAll();
		
		theModel.addAttribute("tasks", theTasks);
		
		return "start";
	}
	
	
	
	
	
	
	
	
	

}
