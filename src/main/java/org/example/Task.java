package org.example;

public class Task {
    private String task;

    /**
     * @return return String task
     */
    public String getTask() {
        return task;
    }


    /**
     * @param task Set task
     */
    Task(String task) {
        this.task = task;
    }

    /**
     *
     * @param priority Set task priority in field
     */
}

class DateTasks extends Task {
    private String date;

    DateTasks(String task, String date) {
        super(task);
        this.date = date;
    }


    public String getDate() {
        return date;
    }
}

class PriorityTask extends Task {
    private Priority priority;

    PriorityTask(String task, int priority) {
        super(task);
        priorityCheck(priority);
    }

    public Priority getPriority() {return this.priority; }

    public void priorityCheck(int priority) {
        switch (priority) {
            case 1: this.priority = Priority.HIGH; break;
            case 2: this.priority = Priority.MEDIUM; break;
            case 3: this.priority = Priority.LOW; break;
            default: this.priority = Priority.HAVENT; break;
        }
    }
}

enum Priority {
    HIGH, MEDIUM, LOW, HAVENT
}