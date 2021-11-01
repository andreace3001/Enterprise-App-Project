package com.unorganized.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.unorganized.dto.TaskDTO;

public class TaskListDAO implements Serializable
{	
	private static Path filePath = Paths.get(System.getProperty("user.dir") + "\\src\\main\\resources\\taskList.ser");	
	private static List<TaskDTO> tasks;	
	
	public static List<TaskDTO> readTasks()
    {                
		if (!Files.exists(filePath))
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
	
	public static void addTask(TaskDTO task)
	{
		tasks.add(task);		
	}
	
	public static List<TaskDTO> getTasks()
	{
		return tasks;		
	}
	
	public static void deleteTask(String name)
	{
		for(TaskDTO task : tasks)
		{
			if(task.getTaskName() == name)
			{
				tasks.remove(task);
			}
		}
	}

    public static void writeTasks()
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
