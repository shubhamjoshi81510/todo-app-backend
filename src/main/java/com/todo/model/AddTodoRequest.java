package com.todo.model;

public class AddTodoRequest {
    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "AddTodoRequest{" +
                "task='" + task + '\'' +
                '}';
    }
}
