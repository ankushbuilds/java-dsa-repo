public class DeletionFromFirst {
    class node {
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = next;
        }
    }
    node head;
    node temp;

// Print List
public void printList(){
    node temp = head;
       while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public void deletefirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
        }
        else {
            
            temp = head;
            head = head.next;

        }
    }


    public static void main(String[] args) {
        DeletionFromFirst list = new DeletionFromFirst();
        node first =  list.new node(10);
        node second =  list.new node(20);
        node third =  list.new node(30);
        // Connectiong nodes

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = null;


         System.out.print("Before deletion : ");
         list.printList();
       
        list.deletefirst();

        System.out.print("After Deletion : ");
        list.printList();
    }
}