// CREATION OF LINKED LIST IN JAVA

public class Basic {

    class Node {
        String data;
        Node next;
        private int size;

    Basic(){
        this.size = 0;
    }

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {

        Basic list = new Basic();

        Node first = list.new Node("Ankush");
        Node second = list.new Node("Rahul");
        Node third = list.new Node("Aman");

        // Connecting nodes
        first.next = second;
        second.next = third;

        // Printing linked list
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}