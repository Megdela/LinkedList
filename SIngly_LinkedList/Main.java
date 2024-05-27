package SIngly_LinkedList;


class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(11);
        list.append(22);
        list.append(33);
        list.display();
        list.insertAtStart(44);
        list.display();
        list.deleteAtStart();
        list.display();
        list.deleteAtEnding();
        list.display();
       Node prevNode = SinglyLinkedList.head.next;
        list.insertAfter(prevNode, 89);
        list.display();

        System.out.println(list.searchIndex(11));

}
}
