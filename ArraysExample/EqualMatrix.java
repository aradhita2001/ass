package ArraysExample;

import java.util.Scanner;

public class EqualMatrix {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter m1 & n1 : ");

        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.println("Enter m2 & n2 : ");

        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int [][] matrix1 = new int[m1][n1];
        int [][] matrix2 = new int[m2][n2];

        System.out.println("Enter the first matrix : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("row " + (i+1) + " col " + (j+1));
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print("row " + (i+1) + " col " + (j+1));
                matrix2[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        boolean flag = true;

        if(m1 != m2 || m2 != n2) flag = false;

        for (int i = 0; flag && i < matrix2.length; i++) {
                for (int j = 0; flag && j < matrix2.length; j++) {
                    if(matrix1[i][j] != matrix2[i][j]) flag = false;
                }
        }

        if(flag) System.out.println("Matrices are equal");
        else System.out.println("matrices are not equal");
    }
}
