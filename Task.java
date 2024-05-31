package ToDoList;

public class Task {
	    // Fields to store the task's title, description, and completion status
	    private String title;
	    private String description;
	    private boolean completed;

	    // Constructor to initialize a task with a title and description
	    public Task(String title, String description) {
	        this.title = title;
	        this.description = description;
	        this.completed = false; // Initially, the task is not completed
	    }

	    // Getter method to retrieve the title of the task
	    public String getTitle() {
	        return title;
	    }

	    // Getter method to retrieve the description of the task
	    public String getDescription() {
	        return description;
	    }

	    // Method to check if the task is completed
	    public boolean isCompleted() {
	        return completed;
	    }

	    // Method to mark the task as completed
	    public void markCompleted() {
	        completed = true; // Set the completed status to true
	    }
	}