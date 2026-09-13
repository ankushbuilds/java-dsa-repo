
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the SIze : ");
        int size = sc.nextInt();

        int books[] = new int[size]; // defining an array

        for(int i = 0; i<books.length ; i++){
            books[i] = sc.nextInt(); // storing input in indexes
        }
        System.out.println("Enter no. to find : ");
        int x = sc.nextInt();  // taking input of the no. to be found

        for(int i = 0 ; i<size ; i++){ // iterating over given inputed array to find no.
            if (books[i] == x ){
                System.out.println("Index of found element : " + i);
            }
                        

            
        }
    }
    
}
