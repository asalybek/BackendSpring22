package com.example.practical3.service;

import com.example.practical3.exception.EntityNotFoundException;
import com.example.practical3.repository.ToDoRepository;
import com.example.practical3.todo.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo findById(String id) {
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }
}
