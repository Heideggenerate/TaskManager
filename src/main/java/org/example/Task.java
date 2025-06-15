package org.example;

public class Task {
    private String task;
    private Priority priority;

    /**
     * @return return String task
     */
    public String getTask() {
        return task;
    }

    /**
     * @return int priority
     */
    public Priority getPriority() {return this.priority; }

    /**
     * @param priority Set task priority
     * @param task Set task
     */
    Task(int priority, String task) {
        this.task = task;
        priorityCheck(priority);
    }

    /**
     *
     * @param priority Set task priority in field
     */
    public void priorityCheck(int priority) {
        switch (priority) {
            case 1: this.priority = Priority.HIGH; break;
            case 2: this.priority = Priority.MEDIUM; break;
            case 3: this.priority = Priority.LOW; break;
            default: this.priority = Priority.HAVENT; break;
        }
    }

}

class DateTasks extends Task {
    private String date;

    DateTasks(int priority, String task, String date) {
        super(priority, task);
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}

enum Priority {
    HIGH, MEDIUM, LOW, HAVENT
}