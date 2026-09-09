import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        // String Declaration
        String name = " Ankush Thakur";
        System.out.println(name);

        // Taking input from user ; 
//         Scanner sc = new Scanner(System.in);
//         String book = sc.nextLine();

//         System.out.println(book);
// sc.close();

// Concatenation --------------->
        // String firstName = "hi";
        // String lastName = " hello";
        // String fulName = firstName + lastName;
        // System.out.println(fulName);

        // // Printing length of the string
        // System.out.println(fulName.length());

        // // Printing Each Letter of the String ----> charAt();
        // for(int i = 0; i<fulName.length(); i++){
        //     System.out.println(fulName.charAt(i));
            
        // }


        // Comparing Two strings
        // 1 -> s1 > s2 : +ve value
        // 2 -> s1 == s2 : 0
        // 3 -> s1 < s2 -> -ve value

        // String name1 = "Ankush";
        // String name2 = "Ankush";
        // if (name1.compareTo(name2) == 0 ){
        //     System.out.println("equal");
        // }
        // else {
        //     System.out.println("not equal");
        // }

        //  Substring -> stringName.substring();
        String sentence = "My name is Ankush";
        String subSentence = sentence.substring(3,7);
    System.out.println(subSentence);
    }
}
