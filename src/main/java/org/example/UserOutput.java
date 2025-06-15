package org.example;


public class UserOutput {

    private static UserOutput output = new UserOutput();

    public static UserOutput getOutputObject() {
        return output;
    }

    public void printTasks(String task, Priority priority) {
        System.out.println("TASK: " + task + " [" + priority + ']');
    }

    public void printTasks(String task, String dated) {
        System.out.println("TASK: " + task + " " + dated);
    }

    public void printTasks(String task) {
        System.out.println("TASK: " + task);
    }

    public void outputEnterTask() {
        System.out.println("Enter task");
    }

    public void outputEnterPriority() {
        System.out.println("Enter priority [1 - HIGH, 2 - MIDDLE, 3 - LOW]");
    }

    public void outputEnterIndex() {
        System.out.println("Enter index\n:");
    }

    public void outputMenu () {
        System.out.println("\n\n\n===TASK MANAGER===\n1.Add task\n2.Remove task\n3.Output tasks\n4.Alphabet Sorting\n5.Priority Sorting\n6.Date sorting\n7.Exit");
    }

    public void outputEnterError() {
        System.out.println("Enter error\n");
    }

    public void outputDate() {
        System.out.println("Enter Date in format date/month/year");
    }

    public void outputTaskType() {
        System.out.println("1.Base\n2.Date\n3.Priority");
    }
}
