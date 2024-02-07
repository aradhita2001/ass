package Assignment.day1.session2;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number of days remaining to end your subscription : ");
            int days = sc.nextInt();

            if(days == 0){
                System.out.println("Your subscription has ended. Please renew.");
            }
            else if( days <= 5){
                System.out.println("Your subscription is about to end. Please consider renewing.");
            }
            else if(days <= 30) {
                System.out.println("Your subscription is active.");
            }
            else{
                System.out.println( "Invalid input. Please enter a number between 0 and 30.");
            }

            sc.close();
    }
}
