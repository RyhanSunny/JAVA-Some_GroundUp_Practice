package RECURSION_exercise;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(Summation(3));
    }

    // RECURSION BELOW
    public static int Summation(int n){
        // BASE CASE:
        if (n <= 0){
            return 0;
        // RECURSIVE CASE:
        }else{
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n){
        // BASE CASE:
        if (n <= 1){
            return 1;
        }else {
            // RECURSIVE CASE:
            return n * Factorial(n-1);
        }
    }
}
