package org.cyrus.javaDSA.linkedList.constructor;

public class LinkedList {

    // Class variables of LinkedList
    private Node head;
    private Node tail;
    private int length;

    // Class Node: The instance of Node class is made when you want to create a new Node.
    class Node {

        // Class variables of Node
        int value;
        Node next; // this would be null

        // Constructor Node: takes in a value and assigns it to the Node class variable, value
        Node(int value) {
            this.value = value;
        }
    }

    // Constructor LL: It creates an instance of Node that takes in value as an argument
    // Assigns head (pointer) to the newly created newNode
    // Assigns tail (pointer) to the newly created newNode
    // Sets value of length to 1, as the length of the LL would be 1 when a new node is created
    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void getHeadAndTailStatus() {
        System.out.println(head.value);
        System.out.println(tail.value);
        System.out.println(length);

    }

}
