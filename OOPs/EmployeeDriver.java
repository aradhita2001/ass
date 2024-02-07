package OOPs;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println(employee.calculateBonus(5000, 12));
        System.out.println(employee.calculateBonus(500000));
    }
}
