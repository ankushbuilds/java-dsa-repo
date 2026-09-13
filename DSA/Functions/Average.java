
import java.util.Scanner;
public class Average {
 public static float calculateAverage(float a, float b, float c){
    float avg = (a+b+c) / 3 ;
    return avg;
  
 }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No. : ");
        float a = sc.nextFloat();
        System.out.println("Enter second No. : ");
        float b = sc.nextFloat();
        System.out.println("Enter Third no. : ");
        float c = sc.nextFloat();

        float result = calculateAverage(a, b, c);
        System.out.println("Average is : " +result);
        sc.close();
    }
}