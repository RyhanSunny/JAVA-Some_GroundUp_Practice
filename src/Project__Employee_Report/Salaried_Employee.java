package Project__Employee_Report;

//PART C
//1-INHERITANCE
public class Salaried_Employee extends Employee{

    //2- MULTI-ARG CONSTRUCTOR
    public Salaried_Employee(String name, String ssn) {
        super(name, ssn);
    }

    //3- IMPLEMENTATION OF SETTER
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //4- toString()
    @Override
    public String toString(){
        return super.toString()
                +"\n	 Employee salary is " + salary;
    }
}
