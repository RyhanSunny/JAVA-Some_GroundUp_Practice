package ARRAYS_exercise;

import java.util.Arrays;

/*
 * Calculate the average value of array elements
 */

public class arr_exercise3 {
    public static void main(String[] args) {
        int[] a = new int[]{12,324,45,65,678,978,0,3};

        //sum
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        //avg
        System.out.printf("The array: %s%nTheir Average: %d", Arrays.toString(a), sum/a.length);
    }
}
