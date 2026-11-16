package LinkedList;

public class SinglyLL {
    static class Node{
        int data;
        Node next;

        // ctor
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    // ctor
    public SinglyLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // insert at head
    public void insertAtHead(int data){
        Node newNode = new Node(data);

        // ll is empty
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // insert at tail
    public void insertAtTail(int data){
        Node newNode = new Node(data);

        // ll is empty
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // insert at position
    public void insertAtPosition(int index,int data){

        // invalid index
        if(index <0 || index > size){
            System.out.println("Invalid index");
            return;
        }

        // insert at head
        if(index == 0){
            insertAtHead(data);
            return;
        }

        // insert at tail
        if(index == size){
            insertAtTail(data);
            return;
        }

        // create a new node
        Node newNode = new Node(data);

        Node prev = head;

        // traverse
        for(int i = 1; i < index; i++){
            prev = prev.next;
        }

        // connect new node
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    // traverse
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getHead() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List is empty");
        }
        return head.data;
    }

    public int getTail() {
        if (isEmpty()) {
            throw new IllegalStateException("Linked List is empty");
        }
        return tail.data;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();

        // insert at head
        sll.insertAtHead(1);
        sll.insertAtHead(2);

        // insert at tail
        sll.insertAtTail(4);
        sll.insertAtTail(5);

        // display
        System.out.print("Linked List: ");
        sll.display();

        // Get Head
        System.out.println("Head: " + sll.getHead());

        // Get Tail
        System.out.println("Tail: " + sll.getTail());

        // Get Size
        System.out.println("Size: " + sll.getSize());

        // Insert at Position
        sll.insertAtPosition(2, 25);

        System.out.print("After insertion: ");
        sll.display();

        // Clear Linked List
        sll.clear();

        System.out.print("After clear: ");
        sll.display();

        System.out.println("Size after clear: " + sll.getSize());

    }
}
