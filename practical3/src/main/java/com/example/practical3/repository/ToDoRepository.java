package com.example.practical3.repository;

import com.example.practical3.todo.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
