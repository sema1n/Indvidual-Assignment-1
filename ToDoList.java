package ToDoList;

public class ToDoList {
	    private Node head; // Head of the linked list

	    // Constructor to initialize an empty ToDoList
	    public ToDoList() {
	        head = null; // Initially, the list is empty
	    }

	    // Method to add a new task to the ToDoList
	    public void addToDo(Task task) {
	        Node node = new Node(task); // Create a new node with the given task
	        if (head == null) { // If the list is empty
	            head = node; // New node becomes the head
	        } else {
	            Node current = head; // Start from the head
	            while (current.next != null) { // Traverse to the end of the list
	                current = current.next;
	            }
	            current.next = node; // Add the new node to the end of the list
	        }
	    }

	    // Method to mark a task with the given title as completed
	    public void markToDoAsCompleted(String title) {
	        Node current = head; // Start from the head
	        while (current != null) { // Traverse the list
	            if (current.task.getTitle().equals(title)) { // If title matches
	                current.task.markCompleted(); // Mark the task as completed
	                return;
	            }
	            current = current.next; // Move to the next node
	        }
	        // If task with given title is not found
	        System.out.println("The task with title " + title + " is not found.");
	    }

	    // Method to view the ToDoList
	    public void viewToDoList() {
	        Node current = head; // Start from the head
	        if (current == null) { // If the list is empty
	            System.out.println("ToDo List is empty.");
	            return;
	        }
	        System.out.println("ToDo List:");
	        while (current != null) { // Traverse the list
	            String status = current.task.isCompleted() ? "[Completed]" : "[Pending]"; // Check task completion status
	            System.out.println(" " + current.task.getTitle() + " - " + current.task.getDescription() + " " + status); // Print task details
	            current = current.next; // Move to the next node
	        }
	    }

	    // Main method to test the ToDoList functionality
	    public static void main(String[] args) {
	        ToDoList todo = new ToDoList(); // Create a new ToDoList

	        // Add tasks to the ToDoList
	        todo.addToDo(new Task("Finish report", "Finish writing the quarterly report."));
	        todo.addToDo(new Task("Call John", "Call John to discuss the upcoming project."));
	        todo.addToDo(new Task("Buy groceries", "Buy milk, eggs, and bread from the store."));

	        todo.viewToDoList(); // View the ToDoList

	        // Mark tasks as completed
	        todo.markToDoAsCompleted("Finish report");
	        todo.markToDoAsCompleted("Call Michael"); // Task with this title does not exist

	        todo.viewToDoList(); // View the updated ToDoList
	    }
	}
