package Abstract;

public class TestBank {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println(bank1.getRateOfInterest());

        Bank bank2 = new PNB();
        System.out.println(bank2.getRateOfInterest());
    }
}
