package Inheritance;

public class Dog extends Animal {
    String color = "black";

    public void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    
    public Dog () {
        System.out.println("Dog.Dog()");
    }

    public void bark () {
        System.out.println("Dog.bark()");
    }

    @Override
    public String toString() {
        return "THis is a Dog ";
    }
}
