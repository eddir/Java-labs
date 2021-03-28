package me.rostkov.lab;

import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.TaskManager;
import me.rostkov.lab.task.chapter_1.unit_1.point.CoordinatePointTasks;
import me.rostkov.lab.task.extra_1.ExtraInterfaceTask;

import java.util.Scanner;

public class Main {

    private final boolean testMode = true;
    private static TaskManager taskManager;

    public static void main(String[] args) {
        Main.init();

        System.out.println("Лабораторные работы по совремнному ООП на языке Java.");
        System.out.println();

        Main.process();

        System.out.println("Завершение...");
    }

    private static void process() {
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("\nВыберите номер работы или q для выхода:");

            for (Task task : Main.taskManager.getAllTasks()) {
                System.out.format("%s %s\n", task.getId(), task.getTitle());
            }
            Task task = null;

            while (task == null) {
                String input = in.nextLine().toUpperCase();

                if (input.equals("Q")) {
                    return;
                }

                task = Main.taskManager.getTask(input);

                if (task == null) {
                    System.out.println("Указанная задача не найдена. Повторите попытку.");
                }
            }

            try {
                task.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void init() {
        Main.taskManager = new TaskManager();
        Main.taskManager.addTask(new CoordinatePointTasks());
        Main.taskManager.addTask(new ExtraInterfaceTask());
    }
}
