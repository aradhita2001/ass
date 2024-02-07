package OOPs;

public class StaticExampleRunner {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;

        StaticExample se1 = new StaticExample();
        StaticExample se2 = new StaticExample();

        se1.setI1(i1);
        se1.setI2(i2);

        se2.setI1(i3);
        se2.setI2(i4);

        se1.display();
        se2.display();
    }
}
