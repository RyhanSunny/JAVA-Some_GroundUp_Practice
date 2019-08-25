package Project__Students_and_Grades;

public class Students {
    private String name;
    private double grade;

    //constructor
    public Students(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    //getters
    public String getName(){
        return name;
    }
    public double getGrade(){
        return grade;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }

    //to display
    @Override
    public String toString(){
        return String.format("%s:\t\t\t%.2f", this.name, this.grade);
    }
    // see main class
}
