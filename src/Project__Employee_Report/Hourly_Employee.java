package Project__Employee_Report;

//PART B
//1- INHERITANCE
public class Hourly_Employee extends Employee {

    //2-ATTRIBUTES
    private int hours;
    private int rate;

    //3- Multi-argument constructor 
    public Hourly_Employee(String name, String ssn, int hours, int rate){
        super(name, ssn);
        this.hours = hours;
        this.rate = rate;
    }

    //4- setter implementation
    public void setSalary(double salary){
        this.salary = salary;
    }

    //5- toString()
    @Override
    public String toString(){
        return super.toString()
                + "\n 	Number of working hours is " + hours
                + ", and the rate per hour is " + rate
                + "\n	Employee salary is: " + salary;
    }
}
