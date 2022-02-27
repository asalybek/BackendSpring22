package com.example.practical3.controller;

import com.example.practical3.service.ToDoService;
import com.example.practical3.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody ToDo toDo){
        toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody ToDo toDo){
        toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }
}
