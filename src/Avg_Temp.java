import java.util.Scanner;

public class Avg_Temp {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);
        System.out.print("Temperature of how many cities?\n ");
        int n = input.nextInt();
        System.out.print("\nEnter their temperatures one by one :\n ");

        double temp;
        double sum = 0;

        for (int i = 1; i <= n; i++){
            temp = input.nextDouble();
            sum += temp;
        }
        double avg = sum / n;
        System.out.printf("\nThe average temperature of the %d cities is: %.2f", n, avg);
    }
}
