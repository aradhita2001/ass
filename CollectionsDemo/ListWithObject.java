package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;

import Inheritance.Animal;
import Inheritance.BabyDog;
import Inheritance.Cat;
import Inheritance.Dog;

public class ListWithObject {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Animal());

        LinkedList<Animal> animalLinkedList = new LinkedList<Animal>();
        animalLinkedList.add(new BabyDog());
        animalLinkedList.addAll(animals);

        System.out.println(animalLinkedList);
    }
}
