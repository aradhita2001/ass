import java.util.Scanner;

public class InputOutput {
    private static String name;
    private static int age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();

        System.out.println("name : " + name);
    }
}
