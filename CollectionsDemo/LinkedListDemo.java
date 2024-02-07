package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("ll");
        ll.add(12);
        ll.add(ll);

        System.out.println(ll);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        //boolean b = linkedList.remove(2);
        linkedList.remove(new Integer("2"));

        System.out.println(linkedList);
    }


}
