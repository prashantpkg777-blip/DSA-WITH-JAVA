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

    // search
    public boolean search(int target){
        Node temp = head;

        while (temp != null){
            if(temp.data == target){
                return true;
            }
            else {
                temp = temp.next;
            }
        }
        return false;
    }

    public int findPosition(int target){
        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.data == target){
                return index;
            }
            else {
                temp = temp.next;
                index++;

            }
        }
        return -1;
    }

    // update
    public void updateAtPosition(int position, int newData){
        Node temp = head;

        if(position < 0 || position > size){
            System.out.println("Invalid position");
            return;
        }

        for(int i = 0; i < position; i++){
            temp = temp.next;
        }

        temp.data = newData;
    }

    public void updateData(int oldData, int newData){
        Node temp = head;
        while(temp != null){
            if(temp.data == oldData){
                temp.data = newData;
            }
            else {
                temp = temp.next;
            }

        }

    }

    // delete

    public void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    public void deleteAtTail() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }

        size--;
    }

    public void deleteAtPosition(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteAtHead();
            return;
        }

        if (index == size - 1) {
            deleteAtTail();
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }

    public void deleteByValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;

        size--;
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();

        // insert at head
        sll.insertAtHead(1);
        sll.insertAtHead(2);

        // insert at tail
        sll.insertAtTail(40);
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

        // search
        System.out.println(sll.search(25));

        // findPosition
        System.out.println("Position: " + sll.findPosition(25));

        // updateAtPosition
        sll.updateAtPosition(4, 50);
        System.out.print("After update: ");
        sll.display();

        // update data
        sll.updateData(2, 20);
        System.out.print("After update: ");
        sll.display();

        // Delete at Head
        sll.deleteAtHead();
        System.out.print("After Delete Head: ");
        sll.display();

        // Delete at Tail
        sll.deleteAtTail();
        System.out.print("After Delete Tail: ");
        sll.display();

        // Delete at Position
        sll.deleteAtPosition(1);
        System.out.print("After Delete Position 1: ");
        sll.display();

        // Delete by Value
        sll.deleteByValue(40);
        System.out.print("After Delete Value 40: ");
        sll.display();

        System.out.println("Head: " + sll.getHead());
        System.out.println("Tail: " + sll.getTail());
        System.out.println("Size: " + sll.getSize());

//        // Clear Linked List
//        sll.clear();
//
//        System.out.print("After clear: ");
//        sll.display();
//
//        System.out.println("Size after clear: " + sll.getSize());


    }
}
