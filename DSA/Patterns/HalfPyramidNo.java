package patterns;
public class HalfPyramidNo {
    public static void main(String[] args) {
        int i, j;
        // for(i=1; i<=5;i++){
        //     for(j=1; j<=i ; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Inverted Half pyramid number pattern
        for(i=5; i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
