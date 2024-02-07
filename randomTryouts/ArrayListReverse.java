import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);

        list.add(6);
        list.add(1);
        
        Collections.reverse(list);
        System.out.println(list);

    }
}
