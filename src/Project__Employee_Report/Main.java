package Project__Employee_Report;

//MAIN METHOD
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ryhan Sunny
 */
public class Main {
    public static void main(String[] args) {
        //1- DECLARE AND INSTANTIATE M251
        Employee_Report M251 = new Employee_Report();

        //2- INVOKE hireEmployee()
        try {
            M251.hireEmployee("C:\\employee.txt"); // store eployee.txt file into C Drive
        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!");
        }

        //3- INVOKE printReport()
        M251.printReport();
    }
}