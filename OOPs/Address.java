package OOPs;

public class Address {
    String street;
    String city;
    String country;
    int pincode;

    public void displayAddress() {
        System.out.println("Street : " + street);
        System.out.println("City : " + city);
        System.out.println("Pincode : " + pincode);
        System.out.println("Country : " + country);
    }
}
