package org.cyrus.javaDSA.linkedList.removeLast;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node removeLast() {
        if (head == null) {
            return null;  // The list is empty
        } else if (head.next == null) {
            // There is only one node in the list
            Node removedNode = head;
            head = null;
            tail = null;
            length--;
            return removedNode;
        } else {
            Node temp1 = head;
            Node temp2 = head.next;
            while (temp2.next != null) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            Node removedNode = temp2;
            tail = temp1;
            tail.next = null;
            length--;

            return removedNode;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void checkLength() {
        System.out.println("Length: " + length);
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


}
