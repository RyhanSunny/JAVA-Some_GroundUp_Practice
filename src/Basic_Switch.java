import java.util.Scanner;

public class Basic_Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number for the week: ");
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("It'sssssss Saturdayyy my dudees!");
                break;
            case 2:
                System.out.println("Itssssss Sundayyyy my dudees!");
                break;
            case 3:
                System.out.println("Itssssss Mondayyyyyy my dudee!");
                break;
            case 4:
                System.out.println("Itssssss Tuesdayyyyyy my dudees!");
                break;
            case 5:
                System.out.println("Itssssss WEDNESDAY my dudes! AAAAAAAAAAAAAAAAAAAAA");
                break;
            case 6:
                System.out.println("Itssssss Thursday my dudee!");
                break;
            case 7:
                System.out.println("Itssssss Friday my dudee!");
                break;
            default:
                System.out.println("Invalid day number.");
        }

    }
}
