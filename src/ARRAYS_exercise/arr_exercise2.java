package ARRAYS_exercise;
/*
    2. Write a Java program to sum values of an array

*/
public class arr_exercise2 {
    public static void main(String[] args){

        int[] array = {12,233,234,234,345,35,34,43,545,5,67,678};
        int sum = 0;

        for (int i : array)
            sum += i;

        System.out.println(sum);
    }
}
