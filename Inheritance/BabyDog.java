package Inheritance;

public class BabyDog extends Dog{
    
    public BabyDog () {
        System.out.println("BabyDog.BabyDog()");
    }

    public void weep() {
        System.out.println("BabyDog.weep()");
    }

    @Override
    public String toString() {
        return "This is a BabyDog";
    }
}
