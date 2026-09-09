package patterns;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int i, j, k;
        // for (i=1 ; i<=4;i++){
        // for(j=4;j>=i ; j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }


        // inverted half pyramid rotated
        int n = 4;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
