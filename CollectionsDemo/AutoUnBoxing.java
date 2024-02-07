package CollectionsDemo;

import java.util.ArrayList;

public class AutoUnBoxing {
    public static void main(String[] args) {
        Character ch = 'a';
        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(24);

        int num = arrayList.get(0);

        System.out.println(num);
    }
}
