package Student_Singly_LinkedList;

public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList() {
        head = null;
    }
    void append(Student value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
// otherwise traverse to the end
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
