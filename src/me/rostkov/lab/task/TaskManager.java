package me.rostkov.lab.task;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public ArrayList<Task> getAllTasks() {
        // TODO: допустимо? Есть ли альтрнативы подходу?
        return this.tasks;
    }

    public Task getTask(String id) {
        for (Task task : this.tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

}
