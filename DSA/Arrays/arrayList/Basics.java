import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add Elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println("Original List : " + list);

        // Get element
        int elements = list.get(0);
        System.out.println(elements);

        // Add element in between
        list.add(1,5);
        System.out.println("After Adding : " + list);

        //Set Element
        list.set(0,4);
        System.out.println("After Setting :" + list);

        // Delete Element
        list.remove(3);
        System.out.println("After Deletion :" + list);

        // Count or Size
    int size = list.size();
    System.out.println("Size :" + size);

    // Loops
    for(int i = 0; i<list.size(); i++){
        System.out.println(list.get(i));
    }

    // Sorting
    Collections.sort(list);
    System.out.println(list);
    }
}