package dev.cb.controller;

import dev.cb.business.domain.Todo;
import dev.cb.business.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/todos")
public class TodoResource {

    private final TodoService todoService;

    public TodoResource(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/list")
    public String getAll(Model model) {
        model.addAttribute("todos", todoService.getAll());
        return "list";
    }

    @GetMapping("/list/json")
    @ResponseBody
    public List<Todo> getAllJson() {
        return todoService.getAll();
    }

    @GetMapping("{id}")
    public String getById(@PathVariable Long id, Model model) {
        model.addAttribute("todo", todoService.getById(id));
        return "detail";
    }
}
