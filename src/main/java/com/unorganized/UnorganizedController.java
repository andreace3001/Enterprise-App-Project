package com.unorganized;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unorganized.dto.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/tasks")
public class UnorganizedController 
{
	private List<Task> tasks;	
	
	@PostConstruct
	private void loadData()
	{				
		
		
		Task task1 = new Task(1, "Poop", "Go to the bathroom", true);
		Task task2 = new Task(2, "Eat", "Eat dinner", false);
		Task task3 = new Task(3, "Tomfoolery", "Commit tomfoolery", true);
		Task task4 = new Task(4, "Christmas", "Commit christmas", false);
		Task task5 = new Task(5, "Evade taxes","Commit tax evasion",true);
		
		tasks = new ArrayList<>();
		
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);	
		
	}	
	
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String test(Model model) 
	{
		Task task = new Task(1, "Poop", "Go to the bathroom", true);
		model.addAttribute("taskDTO", task);
				
		return "start";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String read(Model model) 
	{						
		model.addAttribute("taskList", tasks);	
				
		return "list-tasks";
	}		
	
	
	
	
	

}
