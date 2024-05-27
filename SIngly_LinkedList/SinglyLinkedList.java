package SIngly_LinkedList;
 public class SinglyLinkedList {
     static Node head;
     public SinglyLinkedList(){
        head=null;
     }
     void append(int value){
         Node newNode = new Node(value);
         if (head == null) {
             head = newNode;
             return;
         }
         Node current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newNode;
     }
     void display() {
         Node current = head;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     }
     void insertAtStart(int value){
         Node newNode=new Node(value);
         newNode.next=head;
         head=newNode;
     }
     void deleteAtStart() {
         if(head != null) {
             Node current = head;
             head = head.next;
             current.next = null;
         }
     }
     void deleteAtEnding() {
         if(head == null) {
             System.out.println("empty list");
             return;
         }

         if(head.next == null) {
             head = null;
             return;
         }
         Node current = head;
         while(current.next.next != null) {
             current = current.next;
         }
         current.next = null;
     }
     public void insertAfter(Node prevNode, int newData) {
         if (prevNode != null) {

             Node newNode = new Node(newData);
             if (prevNode.next == null) {
                 newNode.next = null;

                 prevNode.next = newNode;
             }
             else {
                 newNode.next = prevNode.next;
                 prevNode.next = newNode;
             }
         }
     }
     public int searchIndex(int value){
                 Node current = head;
        // System.out.println(head.data);
                 int index=0;
                 while (current != null) {
                  //   System.out.println(current.value);
                     if (current.data == value) {
                         return index;
                     }
                     current = current.next;
                     index++;
                 }
                 return -1;


         }
}



