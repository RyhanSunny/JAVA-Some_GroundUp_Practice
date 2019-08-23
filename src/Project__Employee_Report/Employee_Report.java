package Project__Employee_Report;


//PART D
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Report {

    //1- ATTRIBUTES
    private ArrayList<Hourly_Employee> hempList;
    private ArrayList<Salaried_Employee> sempList;

    //2- ZERO-ARG CONSTRUCTOR
    public Employee_Report(){
        this.hempList = new ArrayList<Hourly_Employee> ();
        this.sempList = new ArrayList<Salaried_Employee>();
    }

    //3- READS DATA FROM FILE
    public void hireEmployee (String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        String typeOfEmployee, name, ssn;
        int hours, rate;
        double salary;

        while(input.hasNext()){
            typeOfEmployee = input.next();
            char Char = typeOfEmployee.charAt(0);
            if (Char == 'H'){
                name = input.next();
                ssn = input.next();
                hours = input.nextInt();
                rate = input.nextInt();

                Hourly_Employee hEmp = new Hourly_Employee(name, ssn, hours, rate);
                double amount = rate*hours;
                hEmp.setSalary(amount);
                hempList.add(hEmp);

            }else if (Char == 'S'){
                name = input.next();
                ssn = input.next();
                salary = input.nextDouble();

                Salaried_Employee sEmp = new Salaried_Employee(name, ssn);
                sEmp.setSalary(salary);
                sempList.add(sEmp);
            }

        }input.close();
    }

    //4-PRINT REPORT
    public void printReport(){
        System.out.println("                    Salaried Employee Report\n" +
                "-------------------------------------------------------------------------------------------");
        if(!sempList.isEmpty()){
            for(Salaried_Employee S : sempList){
                System.out.println(S.toString());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------\n" +
                "                    Hourly Employee Report\n" +
                "-------------------------------------------------------------------------------------------");
        if(!hempList.isEmpty()){
            for(Hourly_Employee S : hempList){
                System.out.println(S.toString());
            }
        }
    }
}