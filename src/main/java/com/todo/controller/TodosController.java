package com.todo.controller;

import com.todo.entity.Todos;
import com.todo.model.AddTodoRequest;
import com.todo.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TodosController {

    @Autowired
    TodosService service;

    @PostMapping("/add-todo")
    public List<Todos> addTodo(@RequestBody() AddTodoRequest addTodoRequest) {

        return service.addTodo(addTodoRequest);
    }

    @GetMapping("/get-todos")
    public List<Todos> getTodos() {
        System.out.println("Get todos API Called");
        return service.getAllTodos();
    }

    @DeleteMapping("/delete-todo/{id}")
    public List<Todos> deleteTodos(@PathVariable Integer id) {return service.deleteTodo(id);
    }
}
