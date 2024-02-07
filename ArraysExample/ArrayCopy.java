package ArraysExample;

import java.util.Arrays;

/**
 * ArrayCopy
 */
public class ArrayCopy {

    public static void main(String[] args) {
        
        char[] array = {'J', 'A', 'V', 'A', 'P','Y','T','H','O','N'};

        char[] python = new char[6];
        char[] java = new char[4];

        System.arraycopy(array, 0, java, 0, 4);
        System.arraycopy(array, 4, python, 0, 6);

        System.out.println(new String(java));
        System.out.println(new String(python));

        char[] copy = array.clone();
        System.out.println(new String(copy));

    }
}