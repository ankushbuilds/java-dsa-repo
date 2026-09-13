
package functions;
import java.util.Scanner;

public class Recursion {

    // 1. Sum of first N natural no.
    // public static void sumNum(int i , int n , int sum) {
    // if(i == n){
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // sumNum(i+1, n, sum);
    // System.out.println(i);
    // }
    // public static void main(String[] args) {
    // sumNum(1, 5, 0);
    // }

    // 2. Factorial of a no.
    // public static int factorial(int n) {
    // if (n == 1) {
    // return 1;
    // }
    // int fact_nm1 = factorial(n-1);
    // int fact_n = n*fact_nm1;
    // return fact_n;
    // }
    // public static void main(String[] args) {
    // int n = 5;
    // int ans = factorial(n);
    // System.out.println(ans);
    // }

    // 3. Fibonacci series
    // public static void fibonacci(int a, int b, int n){
    // if(n == 0){
    // return;
    // }
    // int c = a + b;
    // System.out.println(c);
    // fibonacci(b, c, n-1);
    // }
    // public static void main(String[] args) {
    // int a = 0;
    // int b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 7;
    // fibonacci(a, b, n-2);
    // }

    // 4. print x^n (stack height = n)
    // public static int printX(int x, int n){
    // if(n == 0){
    // return 1;
    // }

    // int result = printX(x, n-1);
    // return x * result;
    // }// public static void main(String[] args) {
    // System.out.println(printX(2,5));
    // }

    // 5. Print x^n (stack height = logn)
    // public static int calXn(int x, int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (x == 0) {
    // return 0;
    // }
    // // If n is even
    // if (n % 2 == 0) {
    // return calXn(x, n / 2) * calXn(x, n / 2);
    // } else {
    // return x * calXn(x, n / 2) * calXn(x, n / 2);
    // }
    // }
    // public static void main(String[] args) {
    // int result = calXn(2, 5);
    // System.out.println(result);
    // }

    // 6. Tower of Hanaoi
    // public static void hanoi(int n, String src, String helper, String dest ){
    // if(n == 1){
    // System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
    // return;
    // }
    // hanoi(n-1, src, dest, helper);
    // System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
    // hanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    // int n = 3;
    // hanoi(n, "S", "H", "D");
    // }

    // 7. Print a string in reverse

    // public static void printRev(int i, String name) {
    // if (i == -1) {
    // return;
    // }
    // System.out.print(name.charAt(i));
    // printRev(i - 1, name);
    // }
    // public static void main(String[] args) {
    // String name = "abcd";
    // printRev(name.length() - 1, name);
    // System.out.println();
    // }

    // 8. Find 1st and last occurence of an element in string

    // public static int first = -1 ;
    // public static int last = -1;

    // public static void printLet(int i, String str, char element){
    // if(i == str.length() ){
    // System.out.println(first);
    // System.out.println(last);
    // return;
    // }
    // char currentChar = str.charAt(i);
    // if(currentChar == element){
    // if(first == -1){
    // first = i;
    // }
    // else{
    // last = i;
    // }
    // }
    // printLet(i+1, str, element);
    // }

    // public static void main(String[] args) {
    // String str = "abaacdaefaah";
    // char element = 'a';
    // printLet(0,str,element);
    // }

    // 9. Check if array is sorted or not (Strictly increasing )
    // public static boolean isSorted(int arr[], int idx) {

    // if (idx == arr.length - 1) {
    // return true;
    // }
    // if (arr[idx] < arr[idx + 1]) {
    // // array is sorted till now
    // return isSorted(arr, idx + 1);
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5 };
    // System.out.println(isSorted(arr, 0));

    // }

    // 10. Move all X's to the end
    // public static void moveAllX(String str, int i, int count, String newString){
    // if(i == str.length()){
    // for( i = 0; i<count; i++){
    // newString += 'x';
    // }
    // System.out.println(newString);
    // return;
    // }
    // char currentChar = str.charAt(i);
    // if(currentChar == 'x'){
    // count++;
    // moveAllX(str, i+1, count, newString);
    // }
    // else{
    // newString = newString + currentChar;
    // moveAllX(str, i+1, count, newString);
    // }

    // }
    // public static void main(String[] args) {
    // String str = "axbcxxd";
    // moveAllX(str, 0, 0, "");
    // }

    // 11. Remove duplicates in a String

    // public static boolean [] map = new boolean[26];
    // public static void removeClone(String str, int idx, String newStr){
    // if(idx == str.length()){
    // System.out.println(newStr);
    // return;
    // }
    // char currentChar = str.charAt(idx);
    // if(map[currentChar - 'a']){
    // removeClone(str, idx+1, newStr);
    // }
    // else{
    // newStr += currentChar;
    // map[currentChar - 'a'] = true;
    // removeClone(str, idx+1, newStr);

    // }
    // }
    // public static void main(String[] args) {
    // String str = "abbccda";
    // removeClone(str, 0, "");
    // }

    // 12. Print all the subsequesnces of a String
    // public static void printSub(int idx, String str, String newStr){
    // if(idx == str.length()){
    // System.out.println(newStr);
    // return;
    // }
    // char currentChar = str.charAt(idx);
    // // to be
    // printSub(idx+1, str, newStr+currentChar);

    // // not to be
    // printSub(idx+1, str, newStr);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printSub(0, str, "");
    // }

    // 13. Print all unique subsequences "aaa"

    // public static void printSub(int idx, String str, String newStr,
    // HashSet<String>set){
    // if(idx == str.length()){
    // if(set.contains(newStr)){
    // return;
    // }
    // else{
    // System.out.println(newStr);
    // set.add(newStr);
    // return;
    // }

    // }
    // char currentChar = str.charAt(idx);
    // // to be
    // printSub(idx+1, str, newStr + currentChar, set);

    // // not to be
    // printSub(idx+1, str, newStr, set);
    // }

    // public static void main(String[] args) {
    // String str = "a";
    // HashSet<String> set = new HashSet<>();
    // printSub(0, str, "", set);
    // }

    // 14. Print keypad combination
    // public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno",
    // "pqrs","tu", "vwx", "yz"};

    // public static void printKeypad(String str, int idx, String combination){
    // if(idx == str.length()){
    // System.out.println(combination);
    // return;
    // }
    // char currentChar = str.charAt(idx);
    // String mapping = keypad[currentChar - '0'];
    // for(int i = 0; i<mapping.length(); i++){
    // printKeypad(str, idx+1, combination + mapping.charAt(i));
    // }

    // }
    // public static void main(String[] args) {
    // System.out.println("Enter no. (0-9)");
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();

    // printKeypad(str, 0, "");
    // sc.close();
    // }

    // 15. Print all permutations of a string
    // public static void printPerm(String str, String permutations) {
    // if(str.length() == 0){
    // System.out.println(permutations);
    // return;
    // }
    // for(int i = 0; i<str.length(); i++){
    // char currChar = str.charAt(i);
    // // abc -> "ab"/ "bc"/ "ab"
    // String newStr = str.substring(0, i) + str.substring(i+1);
    // printPerm(newStr, permutations+currChar);
    // }

    // }
    // public static void main(String[] args) {
    // String str = "abc";
    // printPerm(str, "");
    // }

    // 16. Count total paths in a maze to move from (0,0) to (n,m) -> n=3 , m = 3
    // public static int countPaths(int i, int j, int n, int m){
    // if(i == n || j==m){
    // return 0;
    // }
    // if(i == n-1 && j == m-1){
    // return 1;
    // }

    // // move downwards
    // int downPaths = countPaths(i+1, j, n, m);
    // // move right
    // int rigthPaths = countPaths(i, j+1, n, m);

    // return downPaths + rigthPaths;
    // }
    // public static void main(String[] args) {
    // int n = 3, m = 3;
    // int totalPaths = countPaths(0, 0, n, m);
    // System.out.println(totalPaths);

    // 17. Place tiles of size 1*m in a floor of size n*m => n =4 , m =2

    // public static int placeTiles(int n, int m ){
    // if(n == m ){
    // return 2;
    // }
    // if(n < m){
    // return 1;
    // }

    // // Vertically
    // int vertPlacements = placeTiles(n-m, m);
    // // Horizontally
    // int horizPlacements = placeTiles(n-1, m);

    // return vertPlacements + horizPlacements;
    // }
    // public static void main(String[] args) {
    // int totalWays = placeTiles(4,2);
    // System.out.println(totalWays);
    // }

    // 18. Find the number of ways in which you can invite n people to your party ,
    // single or in pairs -> n = 4;

    // public static int invitePeople(int n) {
    //     if(n == 1){
    //         return 1;
    //     }
    //     if(n == 2){
    //         return 2;
    //     }
    //     // For Single
    //     int single = invitePeople(n - 1);
    //     // For pairs
    //     int pairs = (n - 1) * invitePeople(n - 2);

    //     return single + pairs;
    // }
    // public static void main(String[] args) {
    //     int totalWays = invitePeople(4);
    //     System.out.println(totalWays);
    // }

// 19. Print all the subsets of a set of first n natural numbers -> n = 3
    // public static void printSubset(ArrayList<Integer>subset){
    //     for(int i = 0; i<subset.size(); i++){
    //         System.out.print(subset.get(i) + "");
    //     }
    //     System.out.println();
    // }
// public static void findSubsets(int n, ArrayList<Integer>subset){
//         if(n == 0){
//             printSubset(subset);
//             return;
//         }
//         // add hoga
//         subset.add(n);
//         findSubsets(n-1, subset);

//         // add nahi hoga
//         subset.remove(subset.size()-1);
//         findSubsets(n-1, subset);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         ArrayList<Integer> subset = new ArrayList<>();
//         findSubsets(3,subset);
//     }



// BACK-TRACKING
// 1. Print all permutations 
// public static void printPermutation(String str, String Permutations , int idx){
//     if( str.length() == 0){
//         System.out.println(Permutations);
//         return;
//     }
//     for(idx = 0; idx<str.length(); idx++){
//         char currchar = str.charAt(idx);
//         String newStr = str.substring(0, idx) + str.substring(idx+1);
       
//         printPermutation(newStr, Permutations + currchar, idx+1);

//     }

// }
// public static void main(String[] args) {
//     String str = "ABC";
//     printPermutation(str, "", 0);
// }


// 2. N queens problem
    // static int n;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of N: ");
    //     n = sc.nextInt();
    //     char[][] board = new char[n][n];
    //     // Initialize board with '.'
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             board[i][j] = '.';
    //         }
    //     }
    //     solve(board, 0);
    // }

    // // Backtracking function
    // static void solve(char[][] board, int row) {

    //     // Base case
    //     if (row == n) {
    //         printBoard(board);
    //         System.out.println();
    //         return;
    //     }

    //     // Try placing queen in every column
    //     for (int col = 0; col < n; col++) {
    //         if (isSafe(board, row, col)) {
    //             board[row][col] = 'Q';   // Place queen
    //             solve(board, row + 1);   // Recur for next row
    //             board[row][col] = '.';   // Backtrack
    //         }
    //     }
    // }

    // // Check whether queen can be placed
    // static boolean isSafe(char[][] board, int row, int col) {

    //     // Check upper column
    //     for (int i = 0; i < row; i++) {
    //         if (board[i][col] == 'Q')
    //             return false;
    //     }

    //     // Check upper-left diagonal
    //     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (board[i][j] == 'Q')
    //             return false;
    //     }

    //     // Check upper-right diagonal
    //     for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
    //         if (board[i][j] == 'Q')
    //             return false;
    //     }
    //     return true;
    // }

    // // Print board
    // static void printBoard(char[][] board) {
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

// 3.Soduko Solver

}
