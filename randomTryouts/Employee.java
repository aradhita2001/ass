import java.io.*;
import java.util.*;
import java.lang.Math;


public class Employee {
    private int empId;
    private String empName;
    private double empBasicSalary;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getEmpBasicSalary() {
        return empBasicSalary;
    }
    public void setEmpBasicSalary(double empBasicSalary) {
        this.empBasicSalary = empBasicSalary;
    }
    
    public Employee(int empId, String empName, double empBasicSalary) /*throws Exception*/{
        this.empId = empId;
        this.empName = empName;
        this.empBasicSalary = empBasicSalary;
    }
    public Employee() {
    }


    @Override
    public String toString() {
        return "Employee [id=" + empId + ", name=" + empName + ", salary=" + empBasicSalary +  "]";
    }
    public void display () throws Exception{

        System.out.println(this.empId);
        System.out.println(this.empName);
        System.out.println(this.empBasicSalary);
    }

    public static void displaySortByName(List<Employee> employees) {
        
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return -e1.getEmpName().compareTo(e2.getEmpName());
            }
        });

        // Collections.sort(employees, new NameCompare());

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public static void displaySortBySalary(List<Employee> employees) {

        Collections.sort(employees, new SalaryCompare());
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();

    List<Employee> employees = new ArrayList<Employee>();

        for(int i = 0; i < n; i++){
            int id = scan.nextInt();
            String name = scan.next();
            double salary = scan.nextDouble();
            employees.add( new Employee(id, name, salary));
        }

        System.out.println("Employee List:");
        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println("List sorted by name in descending order:");
        displaySortByName(employees);
    
        System.out.println("List sorted by salary in ascending order:");
        displaySortBySalary(employees);
    }
}

class SalaryCompare implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if (e1.getEmpBasicSalary() > e2.getEmpBasicSalary()) return 1;
        if (e1.getEmpBasicSalary() < e2.getEmpBasicSalary()) return -1;
        return 0;
    }
}

class NameCompare implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        // System.out.println(e1.getEmpName().compareTo(e2.getEmpName()));
        return -e1.getEmpName().compareTo(e2.getEmpName());
    }
}
