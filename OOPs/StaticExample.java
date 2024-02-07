package OOPs;

public class StaticExample {
    
    int i1;
    static int i2;
    public int getI1() {
        return i1;
    }
    public void setI1(int i1) {
        this.i1 = i1;
    }
    public static int getI2() {
        return StaticExample.i2;
    }

    public static void setI2(int i2) {
        StaticExample.i2 = i2;
    }
    
    public void display() {
        System.out.println("i1 = " + i1 + "  i2 = " + i2);
    }
    
    
}
