package functions;
import java.util.Scanner;
public class Sum {
   public static int SumOfNumber(int a , int b){
    int sum = a+b;
    return sum;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = sc.nextInt();
        System.out.println("Enter Second no. : ");
        int b = sc.nextInt();
        System.out.println(SumOfNumber(a,b));
        int sum = SumOfNumber(a, b);

        System.out.println("Sum = " + sum);
        sc.close();
    }
    
}
