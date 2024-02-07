package Inheritance;

public class Cat extends Animal{

    

    public void meow() {
        System.out.println("Cat.meow()");
    }

    @Override
    public String toString() {
        return "This is a Cat";
    }
}
