import java.util.*;
public class BitMan {
    public static void main(String[] args) {

        // GET BIT MANIPULATION
        // int n =5;
        // int pos = 3;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        // System.out.println("Bit was zero at position 2");
        // }
        // else{
        // System.out.println("Bit was One at position 2");
        // }

        // SET BIT MANIPULATION
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // CLEAR BIT ====>>
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // int notBitMask = ~(bitMask);
        // int newNum = (notBitMask & n);
        // System.out.println(newNum);

        // UPDATE BIT ==>>>>
    int n = 5; 
    int pos = 1;
     int bitMask = 1<<pos;
   

   System.out.println("Enter operation (1) for updating to 1");
    Scanner sc = new Scanner(System.in);
     int oper = sc.nextInt(); //update bit to 1 else update it to 0;

    if(oper == 1 ){
        //set n=5 --> 7
        
        int newNum = bitMask | n ;
        System.out.println(newNum);
    }
    else{
         
        int notBitMask = ~(bitMask);
        int newNum = (notBitMask & n);
        System.out.println(newNum);
        sc.close();
    }
   

    }
}
