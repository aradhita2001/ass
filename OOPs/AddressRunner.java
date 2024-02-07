package OOPs;

import java.util.Scanner;

public class AddressRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Address address = new Address();

        address.street = sc.nextLine();
        address.city = sc.nextLine();
        address.pincode = sc.nextInt();     sc.nextLine();
        address.country = sc.nextLine();

        sc.close();

        address.displayAddress();
    }
}
