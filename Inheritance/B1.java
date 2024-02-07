package Inheritance;

public class B1  extends A{
    B1 get() {
        return this;
    }

    void message () {
        System.out.println("Welcome to covarient return type");
    }

    public String toString(){
        return "B1 class toString method invoked";
    }

    public static void main(String[] args) {
        new B1().get().message();
        System.out.println(new B1().get());
    }
}
