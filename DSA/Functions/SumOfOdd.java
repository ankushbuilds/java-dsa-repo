package functions;
import java.util.Scanner;
public class SumOfOdd {
    public static int calculateSum(int n){
        int sum = 0;
        for (int i = 0 ; i<=n ; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to which u have to find sum: ");
        int n = sc.nextInt();

        int result = calculateSum(n);
        System.out.println("Sum :" +result);


    }
}
