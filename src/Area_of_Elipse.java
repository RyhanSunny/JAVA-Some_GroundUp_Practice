import java.util.Scanner;

public class Area_of_Elipse {

    public static void main (String []args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Semi-major Axis: ");
        int a = input.nextInt();
        System.out.println("Enter length of semi-minor axis: ");
        int b = input.nextInt();

        double area = (Math.PI * a * b);
        System.out.printf("It's Area = %.1f%n", area);
        System.out.print(area > 150 ? "Ellipse is large.":"Ellipse is small.");

    }
}
