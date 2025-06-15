package org.example;


public class UserOutput {

    public void printTasks(String task, Priority priority) {
        System.out.println("TASK: " + task + '[' + priority + ']');
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
        System.out.println("\n\n\n===TASK MANAGER===\n1.Add task\n2.Remove task\n3.Output tasks\n4.Exit");
    }

    public void outputEnterError() {
        System.out.println("Enter error\n");
    }
}
