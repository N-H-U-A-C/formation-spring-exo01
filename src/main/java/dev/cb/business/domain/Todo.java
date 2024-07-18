package dev.cb.business.domain;

public class Todo {

    private Long id;
    private String label;
    private String description;
    private Boolean completed;

    public Todo() {
    }

    public Todo(String label, String description, Boolean completed) {
        this.label = label;
        this.description = description;
        this.completed = completed;
    }

    public Todo(Long id, String label, String description, Boolean completed) {
        this(label, description, completed);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
