package com.unorganized;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unorganized.dto.TaskDTO;
import com.unorganized.service.ITaskService;

@Controller
public class UnorganizedController 
{
	
	@Autowired
	private ITaskService taskServiceStub;
	
	
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String read(Model model) 
	{
		TaskDTO taskDTO = taskServiceStub.fetchBy(69);
		model.addAttribute("taskDTO", taskDTO);
				
		return "start";
	}
	
	@RequestMapping(value="/start",method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJson() 
	{
		return "start";
	}
	
	
	@RequestMapping(value="/start",method=RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView readSilver() 
	{
		TaskDTO taskDTO = taskServiceStub.fetchBy(43);
		taskDTO.setId(85);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");		
		modelAndView.addObject("taskDTO", taskDTO);
		return modelAndView;
	}
	
	
	
	@PostMapping("/start")
	public String create() 
	{
		return "start";
	}
	
	/**
	 * Handle the /index endpoint
	 * @return
	 *
	 */
	@RequestMapping("/")
	public String index() 
	{
		return "start";
	}
	
	
	

}
