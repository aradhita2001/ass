package OOPs;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Adsd");
        person.setAge(34);
        person.setCountry("sdvd");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getCountry());
    }
}
