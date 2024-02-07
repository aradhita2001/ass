package Inheritance;

public class Person {
    String name;
    String email;
    String address;

    public Person(){

    }

    public  Person(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void display() {
        System.out.println("name : " + this.name);
        System.out.println("email : " + this.email);
        System.out.println("address : " + this.address);
    }
}
