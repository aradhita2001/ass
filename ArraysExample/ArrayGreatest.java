package ArraysExample;

import java.util.Scanner;

public class ArrayGreatest {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        int greatest = a[0];

        for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            greatest = greatest > a[i] ? greatest : a[i];
        }

        System.out.println("The greatest of the elements in the array is " + greatest);

        sc.close();
    }

}
