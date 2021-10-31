package com.unorganized.dao;

import com.unorganized.dto.TaskDTO;
import java.util.List;

public interface ITaskListDAO {
    List<TaskDTO> getTasks();
    void addTask(TaskDTO task);
    void deleteTask(String taskName);
}
