package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        System.out.println("After arithmatic exception try-catch block");

        try {
            System.out.println("Give input other than int to see error");
            int c = sc.nextInt();
            System.out.println("c = " + c);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        System.out.println("After InputMismatchException");

        int[] arr = new int[4];
        int i;
        try {
            i = arr[2];
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        System.out.println("Yaaaaay    I got Executed");
        System.out.println("After ArrayIndexOutOfBound Exception");

    }
}