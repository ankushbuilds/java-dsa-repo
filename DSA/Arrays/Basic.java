
import java.util.Scanner;
public class Basic {
    public static void main(String args[]){

        //  defining array -> {1}
        int [] marks1 = new int[3];
        // marks[0] = 63;
        // marks[1] = 36;
        // marks[2] = 99;

        // defining array -> {2}
        int marks2 [] = {52, 56, 32};
  

    // for (int i = 0 ; i<3 ; i++){
    //     System.out.println(marks[i]);
    // }


    // Taking the size of array as input from user ; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    System.out.println("Enter" + size + "elements: ");

    // loop for taking and storing input
    for(int i=0; i<size ; i++){
        numbers[i] = sc.nextInt(); // taking input as per index
    }
        System.out.println("Array elements are : ");

        // Loop for printing the stored array no.
        for(int i=0 ; i<size ; i++){
            System.out.println(numbers[i] + " ");
        }
           sc.close();
    
    
 
    
    
}
}
