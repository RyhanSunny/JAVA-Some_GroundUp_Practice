package Project__Employee_Report;

/**
 * @author Ryhan Sunny
 */

//PART A
public abstract class Employee {

    //1- ATTRIBUTES
    private String name;
    private String ssn;
    protected double salary;

    //2- TWO-ARG CONSTRUCTOR
    public Employee(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        salary = 0;
    }
    //3- ABSTRACT SETTER METHOD
    public abstract void setSalary(double salary);


}