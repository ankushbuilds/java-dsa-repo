
package functions;
import java.util.Scanner;
public class Product {
    public static int calculateProduct(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber : ");
        int a = sc.nextInt();
        System.out.println("Enter second NO. : ");
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("Product : " + product);
        
    }
    
}
