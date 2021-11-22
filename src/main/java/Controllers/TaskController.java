package Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import DTO.Task;


@Controller
@RequestMapping("/tasks")
public class TaskController {
 
    //Upload faculty info
    private List<Task> tasks; 


    @PostConstruct
    private void loadData() {
        
    	Task task1 = new Task(1, "Title", "thing");
    	Task task2 = new Task(2, "Do homework for Abdou", "Programming");
    	Task task3 = new Task(3, "Get off my butt", "Do something");
    	
    	tasks = new ArrayList<>();
    	
    	tasks.add(task1);
    	tasks.add(task2);
    	tasks.add(task3);
    	
    	
    	

    }
    
  //Map to tasks
	@GetMapping("/task-tasks")
	public String taskList(Model theModel) {
		theModel.addAttribute("tasks", theModel);
		
		return "task-tasks";
	}
    
}