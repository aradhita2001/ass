package OOPs;

public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerType;
    private String customerLocation;

    public Customer(String a, String b, String c, String d) {
        customerName = a;
        customerEmail = b;
        customerType = c;
        customerLocation = d;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }
}
