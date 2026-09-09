
public class BubbleSort {
    // Function for Printing Array
    public static void printArray(int arr[]) {
        System.out.print("Sorted Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {

        // Bubble Sort logic
        // Time Complexity --> 0(n^2)
        int arr[] = {7,8,3,1,2};
        for (int i = 0; i <arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
        
    }
}
