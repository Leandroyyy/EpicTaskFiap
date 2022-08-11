package br.com.fiap.epictaskapi.controller;


import br.com.fiap.epictaskapi.dto.Task;
import br.com.fiap.epictaskapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> find(){
        return taskService.listAll();
    }

}
