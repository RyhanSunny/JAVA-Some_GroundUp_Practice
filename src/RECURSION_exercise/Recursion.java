package RECURSION_exercise;

public class Recursion {
    public static void main(String[] args) {

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
}
