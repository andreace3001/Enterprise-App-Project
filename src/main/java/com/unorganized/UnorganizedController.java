package com.unorganized;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unorganized.dao.TaskListDAO;
import com.unorganized.dto.TaskDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/")
public class UnorganizedController {
	private List<TaskDTO> tasks;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String test(Model model) {

		TaskDTO task1 = new TaskDTO("Poop", "Go to the bathroom", LocalDate.of(2021, 11, 27));
		TaskDTO task2 = new TaskDTO("Eat", "Eat dinner", LocalDate.of(2021, 10, 15));
		TaskDTO task3 = new TaskDTO("Tomfoolery", "Commit tomfoolery", LocalDate.of(2021, 4, 20));
		TaskDTO task4 = new TaskDTO("Christmas", "Commit christmas", LocalDate.of(2021, 12, 24));
		TaskDTO task5 = new TaskDTO("Evade taxes", "Commit tax evasion", LocalDate.of(2021, 11, 27));

		tasks = new ArrayList<>();

		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
		model.addAttribute("taskDTO", tasks);

		return "start";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String read(Model model) {
		// model.addAttribute("taskList", TaskListDAO.getTasks());
		model.addAttribute("taskList", tasks);

		return "start";
	}

}
