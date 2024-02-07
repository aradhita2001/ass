package Inheritance;

public class Employee extends Person {
    float salary = 50000;

    public Employee(){
        System.out.println("Conustructor from Employee class");
    }

    public Employee (int salary){
        System.out.println("Employee.Employee(int salary)");
        this.salary = salary;
    }

    public Employee (String name, String email, String address, int salary){
        super(name, email, address);
        this.salary = salary;
    }

    public void display(){
        super.display();
        System.out.println("Employee salary is  " + salary);
    }
}
