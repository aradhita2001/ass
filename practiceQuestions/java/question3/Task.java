package practiceQuestions.java.question3;

public class Task {
    //  Implement the Task class below

    private String name;
    private String dueDate;
    private String status;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Task(String name, String dueDate, String status) {
        this.name = name;
        this.dueDate = dueDate;
        this.status = status;
    }
    public Task() {
    }

    
    
}
