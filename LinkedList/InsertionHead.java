package LinkedList;

// Node class: just data and next pointer
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class: has head and methods
class LinkedList {
    private Node head;

    // Insert a new node at the head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to run the example
public class InsertionHead {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtHead(10);
        linkedList.insertAtHead(20);
        linkedList.insertAtHead(30);
        linkedList.insertAtHead(40);

        linkedList.printList();  
    }
}
