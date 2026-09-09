package functions;
import java.util.Scanner;
public class Greatest {
    public static int findGreatest(int a , int b){
        if(a>b){
         return a;        
        }
        else{
             return b;
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first: ");
        int a = sc.nextInt();
        System.out.println("Second : ");
        int b = sc.nextInt();

        int result = findGreatest(a,b);
        System.out.println("Greatest : " +result);
        sc.close();

    }
}
