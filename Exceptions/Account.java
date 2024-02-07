package Exceptions;

public class Account {
    
    private static int accno[] = {1000, 1001, 1002, 1003, 1004};
    private static String name[] = {"Athaulla", "Athaulla404", "Athaulla not found", "Athaulla Everywhere", "Athaulla again"};
    private static double balance[] = {4456.45, 43535.45, 234233, 43545.342};

    public static void main(String[] args) {
        try {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");

            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + balance[i]);

                if(balance[i] < 1000){
                    InsufficientBalanceException ibe = new InsufficientBalanceException("Balance is less than 1000");
                    throw ibe;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
