package Project__Employee_Report;


//PART D
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee_Report {

    //1- ATTRIBUTES
    private ArrayList<HourlyEmployee> hempList;
    private ArrayList<SalariedEmployee> sempList;

    //2- ZERO-ARG CONSTRUCTOR
    public EmployeeReport(){
        this.hempList = new ArrayList<HourlyEmployee> ();
        this.sempList = new ArrayList<SalariedEmployee>();
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

                HourlyEmployee hEmp = new HourlyEmployee(name, ssn, hours, rate);
                double amount = rate*hours;
                hEmp.setSalary(amount);
                hempList.add(hEmp);

            }else if (Char == 'S'){
                name = input.next();
                ssn = input.next();
                salary = input.nextDouble();

                SalariedEmployee sEmp = new SalariedEmployee(name, ssn);
                sEmp.setSalary(salary);
                sempList.add(sEmp);
            }

        }input.close();
    }x` `

    //4-PRINT REPORT
    public void printReporot(){
        System.out.println("                    Salaried Employee Report\n" +
                "-------------------------------------------------------------------------------------------");
        if(!sempList.isEmpty()){
            for(SalariedEmployee S : sempList){
                System.out.println(S.toString());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------\n" +
                "                    Hourly Employee Report\n" +
                "-------------------------------------------------------------------------------------------");
        if(!hempList.isEmpty()){
            for(HourlyEmployee S : hempList){
                System.out.println(S.toString());
            }
        }
    }
}