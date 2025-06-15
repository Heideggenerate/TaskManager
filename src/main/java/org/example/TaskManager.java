package org.example;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private UserInput input = new UserInput();
    private UserOutput output = new UserOutput();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask() {
        tasks.add(new Task(input.enterPriority(), input.enterTask()));
    }

    public void deleteTask() {
        tasks.remove(input.enterIndex());
    }

    public void printTasks() {
        for (Task iterator : tasks) {
            output.printTasks(iterator.getTask(), iterator.getPriority());
        }
    }

    public void TaskMenu() {
        while (true) {
            switch (input.enterMenu()) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    printTasks();
                    break;
                case 4:
                    return;
            }
        }
    }
}
