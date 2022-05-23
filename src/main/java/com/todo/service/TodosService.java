package com.todo.service;

import com.todo.entity.Todos;
import com.todo.model.AddTodoRequest;
import com.todo.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodosService {

    @Autowired
    TodosRepository repository;

    public List<Todos> addTodo(AddTodoRequest addTodoRequest) {
        Todos newTodo = new Todos();
        newTodo.setTask(addTodoRequest.getTask());
        newTodo.setCreatedAt(LocalDate.now());
        repository.save(newTodo);

        return repository.findAll();
    }

    public List<Todos> getAllTodos() {
        return repository.findAll();
    }

    public List<Todos> deleteTodo(Integer id) {
       repository.deleteById(id);

       return repository.findAll();
    }
}
