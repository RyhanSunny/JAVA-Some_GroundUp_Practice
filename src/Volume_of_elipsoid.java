import java.util.Scanner;

public class Volume_of_elipsoid {

    public static void main(String[] args) {

        String error = "please enter a positive number greater than 0! \n";

        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check = true) {
            System.out.println("Enter value a: ");
            int a = input.nextInt();
            if (a <= 0) {
                System.out.println(error);
            } else {
                System.out.println("Enter value b: ");
                int b = input.nextInt();
                if (b <= 0) {
                    System.out.println(error);
                } else {
                    System.out.println("Enter value c: ");
                    int c = input.nextInt();
                    if (c <= 0) {
                        System.out.println(error);
                    } else {
                        double vol = (double) (4 / 3) * Math.PI * a * b * c;
                        System.out.printf("The volume is: %.3f%n", vol);
                        input.close();
                        System.exit(0);
                    }
                }
            }
        }
    }
}