package Inheritance;

public class Animal {

    public String toString() {
        return "This is a animal";
    }

    String color = "white";
    
    public Animal() {
        System.out.println("Animal.Animal()");
    }

    public void eat() {
        System.out.println("Animal.eat()");
    }
}
