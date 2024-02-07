package Inheritance;

public class AnimalDriver {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        Cat cat = new Cat();

        babyDog.weep();
        babyDog.bark();
        babyDog.eat();

        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.printColor();
    }
}
