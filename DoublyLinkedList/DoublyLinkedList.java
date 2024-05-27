package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    void display() {
        Node current = head;
        if(head == null) {
            System.out.println("Empty list");
            return;
        }
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        current = tail;
        System.out.print("Backward: ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
