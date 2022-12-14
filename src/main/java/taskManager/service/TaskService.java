package taskManager.service;

import taskManager.dao.Task;

import java.util.List;

public interface TaskService {


    Task insertSql();
    Task deleteSql();
    Task putSql();
    Task findByName(String name);
    Task find(Long id);
    List<Task> findAll();






}