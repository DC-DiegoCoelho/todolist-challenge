package com.diego.todolist_challenge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.todolist_challenge.model.Task;
import com.diego.todolist_challenge.service.TaskService;

@RestController 
@RequestMapping(value = "api/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/id/{id}")
    public Optional<Task> geTaskById(@PathVariable("id") Long id){
        return taskService.getTaskById(id); 
    }
    
}

