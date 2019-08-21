package ARRAYS_exercise;

import java.util.Arrays;

/*

    1. Write a Java program to sort a numeric array and a string array

 */

public class arr_exercise1 {
    public static void main(String[] args) {

        int[] numeric_array = {123,12,312,3123,123,12,3124,234,24,34,534};
        String[] string_array = {"java", "python", "c", "c++", "ruby" };

        System.out.println("Numeric Array: " + Arrays.toString(numeric_array));
        Arrays.sort(numeric_array);
        System.out.println("Sorted: " + Arrays.toString(numeric_array));

        System.out.println("String array: " + Arrays.toString(string_array));
        Arrays.sort(string_array);
        System.out.println("Sorted: " + Arrays.toString(string_array));
    }
}
