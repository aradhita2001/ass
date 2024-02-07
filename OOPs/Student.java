package OOPs;

public class Student {
    int rollno;
    String name;
    float fee;

    Student (int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display () {
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(fee);
    }
}
