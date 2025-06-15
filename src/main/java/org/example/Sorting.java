package org.example;

import java.util.ArrayList;

public class Sorting {

    private static Sorting sorting;

    public static Sorting getObjectSorting() {
        if (sorting == null) {
            sorting = new Sorting();
        }
        return sorting;
    }

    public void alphabetSorting(ArrayList<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            boolean skip = false;
            for (int j = i + 1; j < tasks.size(); j++) {
                if (tasks.get(i).getTask().charAt(0) > tasks.get(j).getTask().charAt(0)) {
                    Task temp = tasks.get(j);
                    tasks.set(j, tasks.get(i));
                    tasks.set(i, temp);
                    skip = true;
                }
            }
            if (!skip) return;
        }
    }
}
