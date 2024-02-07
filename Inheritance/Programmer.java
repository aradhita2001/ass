package Inheritance;

public class Programmer extends Employee{
    int bonus  = 15000;

    public Programmer(){
        System.out.println("Child class constructor");
    }

    public Programmer(int salary, int bonus){
        super(salary);
        System.out.println("Programmer.Programmer(int bonus)");
        this.bonus = bonus;
    }

    public void display(){
        super.display();
        System.out.println("Bonus is  " + bonus);
    }

    
}
