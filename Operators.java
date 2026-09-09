public class Operators {
    public static void main(String[] args) {

        // Post increment => first use the value and assign it and then increase by 1
        int a = 10;
        int b = 0;
        b = a++;
      
        System.out.println(a);
         System.out.println(b);

        //  Pre Increment => first change the value then use it
         int x = 10;
        int y = 0;
        y = ++x;
      
        System.out.println(x);
         System.out.println(y);

        //  Bitwise Operator 
        // 1. Binary AND => &
        // 2. Binary OR => |
        // 3. Binary XOR => ^ ---> return false for same value and true for different value
        // 4. Binary one's Complement =>  ~
        // 5. Binary Left Shift => << ---> for shifting left (A<<1)
        // 6. Binary Right Shift 
    }
}
