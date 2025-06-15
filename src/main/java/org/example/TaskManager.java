package org.example;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    private UserInput input = UserInput.getInputObject();
    private UserOutput output = UserOutput.getOutputObject();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(int priority, String task) {
        tasks.add(new Task(priority, task));
    }

    public void addTask(int priority, String task, String date) {tasks.add(new DateTasks(priority, task, date));}

    public void deleteTask() {
        tasks.remove(input.enterIndex());
    }

    public void printTasks() {
        for (Task iterator : tasks) {
            if (iterator instanceof DateTasks) {
                DateTasks dateTasks = (DateTasks) iterator;
                output.printTasks(dateTasks.getTask(), dateTasks.getPriority(), dateTasks.getDate());
            }
            else {
                output.printTasks(iterator.getTask(), iterator.getPriority());
            }
        }
    }


    public void TaskMenu() {
        while (true) {
            switch (input.enterMenu()) {
                case 1:
                    switch (input.enterDT()) {
                        case 1: addTask(input.enterPriority(), input.enterTask()); break;
                        case 2: addTask(input.enterPriority(), input.enterTask(), input.enterDate()); break;
                        default: output.outputEnterError(); continue;
                    }
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    printTasks();
                    break;
                case 4:
                    return;
                default: output.outputEnterError(); break;
            }
        }
    }
}
