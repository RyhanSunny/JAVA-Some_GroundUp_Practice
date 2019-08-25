package RECURSION_exercise;

public class Recursion {
    public static void main(String[] args) {
        System.out.printf("%d\n%d\n%d", Summation(3), Factorial(5), Exponential(5, 5));
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

    public static int Exponential(int n, int p){
        // BASE CASE:
        if (p <= 0){
            return 1;
        }else{
            // RECURSIVE CASE:
            return n * Exponential(n, p-1);
        }
    }
}
