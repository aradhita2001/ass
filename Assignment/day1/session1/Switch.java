package Assignment.day1.session1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        do{

        displayMenu();
        
        option = scanner.nextInt();
        
            switch (option) {
                case 1:
                    System.out.print("\nEnter Customer's Age : ");
                    int age = scanner.nextInt();
                    System.out.println("\nEnter the total sum assured: ");
                    double sum = scanner.nextDouble();

                    if(age < 25) System.out.println("Premium = " + (sum * .05));
                    else if (age <= 40) System.out.println("Premium = " + (sum * .1));
                    else System.out.println("Premium = " + (sum * .2));
                    break;
                case 2:
                    System.out.print("\nEnter insurance premium : ");
                    double premium = scanner.nextDouble();
                    System.out.print("\nEnter policy term : ");
                    int term = scanner.nextInt();
                    System.out.print("\nEnter annual interest rate : ");
                    double rate = scanner.nextDouble();

                    System.out.println("Maturity amount = " + premium*term*(1 + rate/100));
                    break;
                case 3:
                    System.out.println("Enter policy details : ");
                    String policyDetails = scanner.nextLine();
                    System.out.println(policyDetails.toUpperCase());
                    break;
                case 4:
                    System.out.println("Enter policy details : ");
                    policyDetails = scanner.nextLine();
                    System.out.println(policyDetails.toUpperCase());
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    System.out.println("Choose again");
                    break;
            }
        } while(option != 5);

        scanner.close();
    }

    static void displayMenu(){
        System.out.println("Choose what to do from menu: -");
        System.out.println("Case 1 - Premium Calculation");
        System.out.println("Case 2 - Maturity Amount Calculation");
        System.out.println("Case 3 - Convert Policy Details to Upper Case");
        System.out.println("Case 4 - Convert Policy Details to Lower Case");
        System.out.println("Case 5 - Exit");
    }
}
