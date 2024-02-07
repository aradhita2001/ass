package ArraysExample;

public class EqualsDemo {

    public static void main(String[] args) {
        String str1 = "Java";

        StringBuffer sb1 = new StringBuffer(str1);

        System.out.println(str1.equals("Java"));
        System.out.println(str1.contentEquals(sb1));
        System.out.println(str1.equals(sb1));

        
    }
}