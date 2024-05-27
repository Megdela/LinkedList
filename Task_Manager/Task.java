package Task_Manager;

public class Task {
    private String title, description;
    private boolean completed;
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public boolean isComplted() {
        return completed;
    }
    public void markComplted() {
        completed = true;
    }
    public String toString() {
        return "Title: " + title + ", Description: " +

                description + ", Complted: " + completed;
    }}

