
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table no. :");
        int n = sc.nextInt();
        System.out.println("Table is : ");
        int table = 0;
        for(int i=1 ; i<=10 ; i++){
            table = n * i;
            System.out.println(table);
        }
     
       
    }
}
