package com.unorganized.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.unorganized.dto.TaskDTO;

public class TaskListDAO implements ITaskListDAO
{	
	private static Path filePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\taskList.ser");	
	private List<TaskDTO> tasks;
	
	public List<TaskDTO> readTasks()
    {                
		if(!Files.exists(filePath))
		{
			tasks = new ArrayList<>();
			return tasks;
		}
		else
		{
			try 
	        {            
	            FileInputStream fileIn = new FileInputStream(filePath.toFile());
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            List<TaskDTO> tasks = (List<TaskDTO>) in.readObject();
	            
	            in.close();
	            fileIn.close();
	            
	            return tasks;   
	        } 
	        catch (IOException | ClassNotFoundException ex) 
	        {
	        	System.out.println("Object reading failed");
	            ex.printStackTrace();
	            return null;
	        }			
		}	
        
        
    }
	
	public void addTask(TaskDTO task)
	{
		tasks.add(task);		
	}
	
	public List<TaskDTO> getTasks()
	{
		return tasks;		
	}
	
	public void deleteTask(String name)
	{
		tasks.removeIf(task -> Objects.equals(task.getTaskName(), name));
	}

    public void writeTasks()
    {    	
                             
        try (FileOutputStream fileOut = new FileOutputStream(filePath.toFile())) 
        {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(tasks);
            out.close();
        }    
        catch (IOException ex) 
        {
            System.out.println("Writing failed");
            ex.printStackTrace();
        }
    }  

}
