package OOPs;

public class OverLoadingTryOut {
    void sum (int a, int b) {
        System.out.println("int int");
    }

    void sum (long a, long b){
        System.out.println("long long");
    }

    public static void main(String[] args) {
        OverLoadingTryOut overLoadingTryOut = new OverLoadingTryOut();

        overLoadingTryOut.sum(34, 3l);
    }
}
