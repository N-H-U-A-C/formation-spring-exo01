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

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
