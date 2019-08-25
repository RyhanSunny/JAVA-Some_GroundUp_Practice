package RECURSION_exercise;

public class Recursion {
    public static void main(String[] args) {
        System.out.printf("%d\n%d\n%d\n", Summation(3), Factorial(5), Exponential(5, 5));
        System.out.println("Result: " + Multiply(4, 4));
    }

    // RECURSION BELOW
    public static int Summation(int n){
        // BASE CASE:
        if (n <= 0){
            return 0;
        // RECURSIVE CASE:
        }else{
            return n + Summation(n-1);
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
        }
    }

    public static int Factorial(int n){
        // BASE CASE:
        if (n <= 1){
            return 1;
        }else {
            // RECURSIVE CASE:
            return n * Factorial(n-1);
            // Factorial(4) = 4 * Factorial(3)
            // 4 * 3 * Factorial(2)
            // 4 * 3 * 2 * Factorial(1)
            // 4 * 3 * 2 * 1
        }
    }

    public static int Exponential(int n, int p){
        // BASE CASE:
        if (p <= 0){
            return 1;
        }else{
            // RECURSIVE CASE:
            return n * Exponential(n, p-1);
            // 5 * exponentiation(5, 2)
            // 5 * 5 * exponentiation(5, 1)
            // 5 * 5 * 5 * exponentiation(5, 0)
            // 5 * 5 * 5 * 1
        }
    }

    // Multiply 'n' by 'k' using addition:
    public static int Multiply(int n, int m){
        System.out.println("n: " + n);
        // RECURSIVE CASE:
        if (n > 1){
            return m + Multiply(n-1, m);
        }else {
            // BASE CASE: IF N = 1
            return m;
            // done
        }
    }
}
