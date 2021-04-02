package me.rostkov.lab.task;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks;

    private Task pinned;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void addTask(Task task, boolean pin) {
        this.addTask(task);
        this.pinned = task;
    }

    public ArrayList<Task> getAllTasks() {
        // TODO: допустимо? Есть ли альтрнативы подходу?
        return this.tasks;
    }

    public Task getTask(String id) {
        for (Task task : this.tasks) {
            if (task.getId().contains(id)) {
                return task;
            }
        }
        return null;
    }

    public Task getPinned() {
        return pinned;
    }
}
