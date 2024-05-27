package Student_Singly_LinkedList;


class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(new Student("Mekdelawit",90));
        list.append(new Student("Haymanot",98));
        list.append(new Student("Finoteloza",94));
        list.append(new Student("Jabez",97));
        list.display();

    }
}
