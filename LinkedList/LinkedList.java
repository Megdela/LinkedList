package LinkedList;
 class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=null;
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void display(){
        Node current=head;
        while(current !=null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

}
