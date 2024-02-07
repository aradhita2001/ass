package CollectionsDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Byte>(5);

        arrayList.add(910);
        arrayList.add(3.5);

        // for (Object object : arrayList) {
        //     System.out.println(object);
        // }

        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        list1.add(23);
        list1.add(12);
        list1.add(27);

        list2.add(2);
        list2.add(5);
        list2.add(1);

        list1.addAll(list2);

        System.out.println();
        System.out.println();
        // for (Integer integer : list1) {
        //     System.out.println(integer);
        // }

        System.out.println();
        System.out.println();
        // for (Integer integer : list2) {
        //     System.out.println(integer);
        // }

        System.out.println();
        System.out.println();
        ListIterator iterator = list1.listIterator();
        ListIterator iterator2 = list1.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        

        System.out.println();
        System.out.println();
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
                
    }
}
