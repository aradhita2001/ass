package OOPs;

import java.util.Scanner;

public class CustomerRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nEnter Customer Name : ");
        String name = sc.nextLine();

        System.out.printf("\nEnter Customer Email : ");
        String email = sc.nextLine();

        System.out.printf("\nEnter Customer Type : ");
        String type = sc.nextLine();
        
        System.out.printf("\nEnter Customer Location : ");
        String location = sc.nextLine();

        sc.close();
        
        Customer customer = new Customer(name, email, type, location);

        System.out.println();
        System.out.println();

        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerEmail());
        System.out.println(customer.getCustomerType());
        System.out.println(customer.getCustomerLocation());
    }
}
