import java.util.ArrayList;
import java.util.Scanner;

public class IntegerTryouts {
    public static void main(String[] args) {

        Integer i1 = 34;
        Integer i2 = 35;

        System.out.println(++i1);
        System.out.println(i1 == i2);

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        a1.add(23);
        a2.add(a1.get(0));
        Integer i3 = a1.get(0);
        System.out.println(++i3);
    }
}