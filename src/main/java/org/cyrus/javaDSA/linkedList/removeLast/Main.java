package org.cyrus.javaDSA.linkedList.removeLast;

public class Main {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);

        ll.display();
        ll.checkLength();

        ll.removeLast();

        ll.display();
        ll.checkLength();

    }
}
