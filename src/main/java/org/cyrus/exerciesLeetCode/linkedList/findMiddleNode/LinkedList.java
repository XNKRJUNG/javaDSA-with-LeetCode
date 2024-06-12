package org.cyrus.exerciesLeetCode.linkedList.findMiddleNode;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node findMiddleNode() {
//        1 -> 2 -> 3 -> 4 -> 5 -> 6
        int halfValue = length/2;
        Node temp = head;
        if(length%2 != 0) {
            for (int i=0; i < halfValue; i++){
                temp = temp.next;
            }
            return temp;
        } else {
            for (int i=0; i < halfValue; i++){
                temp = temp.next;
            }
            return temp;
        }
    }

    public int getLength() {
        return length;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
