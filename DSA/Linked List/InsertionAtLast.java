public class InsertionAtLast {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node temp;

    // Function for insertion
    public void addLast(String data) {

        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
            return;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            ptr.next = temp.next;
            temp.next = ptr;

        }
    }

    // Function for printing
    public void printList() {
        if(head == null){
            System.out.println("List is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        

        InsertionAtLast list = new InsertionAtLast();
        Node first = list.new Node("My");
        Node second = list.new Node("Name");

        

        list.head = first;
        first.next = second;
       

        list.addLast("is");
        list.addLast("Ankush Thakur");
        list.printList();

    }

}
