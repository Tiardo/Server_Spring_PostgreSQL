package taskManager.controller;

import org.springframework.web.bind.annotation.*;
import taskManager.dao.Task;
import taskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@RestController
public class TaskController {


    @Autowired
    private TaskService taskService;


    @GetMapping(value = "/tasks", produces = "text/plain; charset=utf-8")
    public Task insertSql() {
        Task tasko = taskService.insertSql();

        return tasko;
    }

    @DeleteMapping(value = "/tasks", produces = "text/plain; charset=utf-8")
    public Task deleteSql() {
        Task taski = taskService.deleteSql();

        return taski;
    }


    @PutMapping(value = "/tasks", produces = "text/plain; charset=utf-8")
    public Task putSql() {
        Task taskn = taskService.putSql();

        return taskn;
    }

    @GetMapping("/tasks/name/{taskName}")
    public String getTask(@PathVariable String taskName) {
        Task task = taskService.findByName(taskName);

        return task.toString();
    }

    @GetMapping("/tasks/id/{taskId}")
    public String getTask(@PathVariable Long taskId) {
        Task task = taskService.find(taskId);

        return task.toString();
    }

    @GetMapping(value = "/tasks/all/", produces = "text/plain; charset=utf-8")
    public String getTask() {
        List<Task> tasks = taskService.findAll();

        return tasks.toString();
    }


}