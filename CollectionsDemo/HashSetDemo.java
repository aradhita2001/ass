package CollectionsDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * HashSetDemo
 */
public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> hashSet1 = new HashSet<String>();

        hashSet1.add("null");
        hashSet1.add(null);
        hashSet1.add("java");
        hashSet1.add("python");
        

        System.out.println(hashSet1);

        Set<Integer> hashSet2 = new HashSet<Integer>();

        hashSet2.add(12);
        hashSet2.add(34);
        hashSet2.add(36);
        hashSet2.addAll(Arrays.asList(new Integer[] {1,2,3,5,66}));
        System.out.println(hashSet2);

        HashSet set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        HashSet set1 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);

        HashSet union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println(union);

        HashSet intersection = new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println(intersection);

        HashSet diffence = new HashSet<>(set);
        diffence.removeAll(set1);
        System.out.println(diffence);
    }
}