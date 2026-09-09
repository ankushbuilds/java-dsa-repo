package patterns;
import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first no. : ");
        // int a = sc.nextInt();
        // System.out.println("Enter second no. : ");
        // int b = sc.nextInt();

        // if (a>b) {
        // System.out.println("a is greater than b");
        // }
        // else if (a<b) {
        // System.out.println("b is greater than a");
        // }
        // else {
        // System.out.println("a is equal to b");
        // }

        System.out.println("Enter the button number(1-3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("good  morning");
                break;

            case 2:
                System.out.println("good afternoon");
                break;

            case 3:
                System.out.println("good evening");
                break;
            default:
                System.out.println("invalid button");
        }

        sc.close();
    }
}