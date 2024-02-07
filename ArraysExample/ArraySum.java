package ArraysExample;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        long sum = 0;

        for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("The sum of the elements in the array is " + sum);

        sc.close();
    }
}
