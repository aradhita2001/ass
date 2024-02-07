package Interface;

public class BankDriver {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        System.out.println(sbi.getRateOfInterest());
    }
}
