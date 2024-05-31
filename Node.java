package ToDoList;

public class Node {
	    Task task; // Task associated with the node
	    Node next; // Reference to the next node in the linked list

	    // Constructor to initialize a node with a task
	    public Node(Task task) {
	        this.task = task; // Assign the given task to the node
	        this.next = null; // Initially, the next node is null
	    }
	}
