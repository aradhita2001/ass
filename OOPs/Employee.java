package OOPs;

public class Employee {
    String empName;
    int empId;
    char empType;

    double calculateBonus(float basicSalary){
        return basicSalary * 1.56;
    }

    double calculateBonus(double dailyWages, int numberOfDays){
        return dailyWages * numberOfDays * .23;
    }
}
