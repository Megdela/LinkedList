package Task_Manager;

public class TaskManager {
    private Node head;
    public TaskManager() {
        head = null;
    }
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if(head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsComplted(String title) {
        Node current = head;
        while(current != null) {
            if(current.task.getTitle().equals(title)) {
                current.task.markComplted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found");
    }
    public void viewTasks() {
        Node current = head;
        System.out.println("Task List: ");
        while(current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
