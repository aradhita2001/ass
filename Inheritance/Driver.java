package Inheritance;

public class Driver {
    public static void main(String[] args) {
        
        Programmer p  = new Programmer(30000, 7800);
        p.display();

        Employee e = new Employee("aradhita", "aradhita@gmail.in", "kolkata", 99999999);
        e.display();
    }   
}
