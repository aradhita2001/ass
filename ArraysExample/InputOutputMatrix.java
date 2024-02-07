package ArraysExample;

import java.util.Scanner;

public class InputOutputMatrix {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter m & n : ");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int [][] matrix1 = new int[m][n];

        System.out.println("Enter the first matrix : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("row " + (i+1) + " col " + (j+1) + " : ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
