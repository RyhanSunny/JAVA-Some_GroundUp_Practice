import java.util.Scanner;

public class SentinelRepitition_whileLoop {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        //total and average grade calculator that you can add indefinite amount of grades and enter -1 to calculate them

        System.out.println("Enter a number or enter -1 to calculate: ");
        double grade = input.nextDouble();

        double sum = 0;
        int counter = 0;
        double avg;

        //as long as user didnt enter -1 continue asking for new numbers
        while(grade != -1){
            sum += grade;
            counter++;
            System.out.println("Enter a number or enter -1 to calculate: ");
            grade = input.nextDouble();
        }

        //if user enters -1 see if they have entered any numbers before to calculate them otherwise say no number is entered
        if (counter != 0){
            avg = sum/(double)counter;
            System.out.printf("The sum is: %.2f%nAnd the average is: %.2f", sum, avg);
        }else{
            System.out.println("You haven't entered any numbers");
        }
    }
}
