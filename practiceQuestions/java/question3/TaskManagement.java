package practiceQuestions.java.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagement {

    public static List<Task> taskList = new ArrayList<Task>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
 
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
 
            switch (choice) {
 
                // complete the implementation here and call below given function respectively
                
            }
        } while (choice != 5);
 
        scanner.close();
    }


    public static void displayMenu(){
        System.out.println("Choose what you want to do from the menu below : ");
        System.out.println("Enter 1 to view the list of tasks.");
        System.out.println("Enter 2 to add a new task");
        System.out.println("Enter 3 to change the status of a task");
        System.out.println("Enter 4 to remove a task from the list");
        System.out.println("Enter 5 to Exit");
        System.out.print("Enter your choice : ");
    }

    public static void displayList() {
        
    }

    public static void addTaskToList(Task task) {
        
    }

    public static void changeTaskStatus(String taskName, String updatedStatus) {
        
    }

    public static void deleteTask(String taskName) {
        
    }
}
