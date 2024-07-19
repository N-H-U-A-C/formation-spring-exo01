package dev.cb.business.service;

import dev.cb.business.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private final List<Todo> todos;

    public TodoService() {
        todos = new ArrayList<>();
        todos.add((new Todo(1L, "Course", "Acheter des patates", false)));
        todos.add((new Todo(2L, "Sport", "Go muscu", false)));
        todos.add((new Todo(3L, "Sieste", "Taper sa meilleure sieste", true)));
    }

    public List<Todo> getAll() {
        return todos;
    }

    public Todo getById(Long id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElse(null);
    }
}
