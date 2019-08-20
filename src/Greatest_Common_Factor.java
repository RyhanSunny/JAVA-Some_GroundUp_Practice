import java.util.Scanner;

public class Greatest_Common_Factor {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter another positive integer: ");
        int n2 = input.nextInt();

        int divisor;
        if (n1>n2) {
            divisor = n2;
        }else divisor = n1;

        while (n1 % divisor !=0 || n2 % divisor !=0){
            divisor--;
        }

        System.out.println(divisor);
    }
}
