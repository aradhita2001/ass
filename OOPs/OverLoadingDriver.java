package OOPs;

public class OverLoadingDriver {
    public static void main(String[] args) {

        OverLoading overLoading = new OverLoading();
        System.out.println(overLoading.add(2.3, 4.5));
        System.out.println(overLoading.add(3, 4));
        System.out.println(overLoading.add(23, 2, 89));
    }
}
