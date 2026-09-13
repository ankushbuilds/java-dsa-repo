package patterns;
public class SolidRhombus {
    public static void main(String[] args) {
        int i, j;
        int n=5;
        //  Left Part
        for(i=1;i<=5;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(j=1; j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        
       
    }
}
