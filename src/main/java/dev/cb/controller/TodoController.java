package dev.cb.controller;

import dev.cb.business.domain.Todo;
import dev.cb.business.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("todos", todoService.getAll());
        return "todos/list";
    }

    @GetMapping("/json")
    @ResponseBody
    public List<Todo> getAllJson() {
        return todoService.getAll();
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getById(id));
        return "todos/detail";
    }
}
