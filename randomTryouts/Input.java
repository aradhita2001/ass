import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.next());
        System.out.println(Integer.parseInt(sc.next()));

        sc.close();
    }
}