package org.example;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    private Sorting sort = Sorting.getObjectSorting();
    private UserInput input = UserInput.getInputObject();
    private UserOutput output = UserOutput.getOutputObject();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(new Task(task));
    }

    public void addTask(String task, String date) {tasks.add(new DateTasks(task, date));}

    public void addTask(String task, int priority) {tasks.add(new PriorityTask(task, priority));}

    public void deleteTask() {
        tasks.remove(input.enterIndex());
    }

    public void printTasks() {
        for (Task iterator : tasks) {
            if (iterator instanceof DateTasks) {
                DateTasks dateTasks = (DateTasks) iterator;
                output.printTasks(dateTasks.getTask(), dateTasks.getDate());
            }
            else if (iterator instanceof PriorityTask) {
                PriorityTask priorityTask = (PriorityTask) iterator;
                output.printTasks(priorityTask.getTask(), priorityTask.getPriority());
            }
            else {
                output.printTasks(iterator.getTask());
            }
        }
    }


    public void TaskMenu() {
        while (true) {
            switch (input.enterMenu()) {
                case 1:
                    switch (input.enterTaskType()) {
                        case 1: addTask(input.enterTask()); break;
                        case 2: addTask(input.enterTask(), input.enterDate()); break;
                        case 3: addTask(input.enterTask(), input.enterPriority()); break;
                        default: output.outputEnterError(); continue;
                    }
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    printTasks();
                    break;
                case 4: sort.alphabetSorting(tasks); break;
                case 6: 
                case 7: return;
                default: output.outputEnterError(); break;
            }
        }
    }
}
