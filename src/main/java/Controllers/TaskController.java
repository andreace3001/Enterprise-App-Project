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
@RequestMapping("/Tasks")
public class TaskController {
 
    //Upload faculty info
    private List<Task> theFaculties; 


    @PostConstruct
    private void loadData() {
        


    }
    
}