public class InsertionAtFirst {
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }


        Node head;

        // Function for insertion 
        public void addFirst(String data){
        Node ptr = new Node(data);
        if(head == null){
         head = ptr;
         return;
        }
        else {
            ptr.next = head;
            head = ptr;
        }
    }
public void printList(){
    Node temp = head;
       while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    
    //  MAIN FUNCTION
    public static void main(String[] args) {
    
        InsertionAtFirst list = new InsertionAtFirst();
        list.addFirst("is");
        list.addFirst("a");

        list.printList();


    //     Node first = list.new Node(10);
    //     Node second = list.new Node(20);
    //     Node third = list.new Node(30);
    //     Node newNode = list.new Node(15);

    //     // Connecting Nodes
    //     first.next = second;
    //     second.next = third;
   
    //     // Logic for insertion at first==>
       
    //    newNode.next = first;
    //    first = newNode;

    //      Node temp = first;

    //       System.out.println("Linked List After Insertion : ");
    //     while(temp != null){
    //         System.out.print(temp.data + " -> ");
    //         temp = temp.next;
    //     }
    //     System.out.println("NULL");
    


}

}
