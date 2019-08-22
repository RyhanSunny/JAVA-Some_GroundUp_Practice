package Project__Students_and_Grades;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //arraylist is a dynamic indefinite list of objects (reference types only not primitive data types)
        ArrayList<Students> java101 = new ArrayList<>();

        //adding new items to the list
        //each item is a ne instance of the object students which invokes the 2-argument constructor in Students class
        java101.add(new Students("Ali", 20));
        java101.add(new Students("Ahmed", 25));
        java101.add(new Students("Omar", 30));
        java101.add(new Students("Ali2", 20));
        java101.add(new Students("Ahmed2", 25));
        java101.add(new Students("Omar2", 30));

        //add Amr on top of the list (position 0)
        java101.add(0, new Students("Amr", 29));
        //remove Ahmed from the list (we dont know its position
        //java101.remove("Ahmed");
        //remove index 3 (we dont know the name
        java101.remove(1);

        System.out.println("Hello Java101 class. These are your grades:");

        //to print each elements of ArrayList using for-each loop
        for (Students s: java101){
            System.out.println(s.toString());
        }
    }
}
