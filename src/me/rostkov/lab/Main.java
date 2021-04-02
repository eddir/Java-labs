package me.rostkov.lab;

import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.TaskManager;
import me.rostkov.lab.task.chapter_1.unit_1.CoordinatePointTask;
import me.rostkov.lab.task.chapter_1.unit_2.CommentTask;
import me.rostkov.lab.task.chapter_1.unit_3.PersonTask;
import me.rostkov.lab.task.chapter_1.unit_4.NameTask;
import me.rostkov.lab.task.chapter_1.unit_5.TimeTask;
import me.rostkov.lab.task.chapter_1.unit_6.HouseTask;
import me.rostkov.lab.task.chapter_2.unit_1.StraightTask;
import me.rostkov.lab.task.chapter_2.unit_2.NamedPersonTask;
import me.rostkov.lab.task.chapter_2.unit_3.ParentPersonTask;
import me.rostkov.lab.task.chapter_2.unit_4.StaffTask;
import me.rostkov.lab.task.chapter_2.unit_5.NestedCommentTask;
import me.rostkov.lab.task.chapter_2.unit_6.TrackTask;
import me.rostkov.lab.task.chapter_3.unit_1.StudentTask;
import me.rostkov.lab.task.chapter_3.unit_2.GradeBookTask;
import me.rostkov.lab.task.chapter_3.unit_3.CityTask;
import me.rostkov.lab.task.chapter_3.unit_4.LinkedTrackTask;
import me.rostkov.lab.task.extra.extra_1.ExtraInterfaceTask;

import java.util.Scanner;

public class Main {

    private static final boolean testMode = true;
    private static TaskManager taskManager;

    public static void main(String[] args) {
        Main.init();

        System.out.println("Лабораторные работы по совремнному ООП на языке Java.");
        System.out.println("Выполнил студент группы бПИНЖ-21 Ростков Эдуард.");
        System.out.println("Условия задач - задачник по ООП, Ермаков А.В.");
        System.out.println();

        Main.process();

        System.out.println("Завершение...");
    }

    private static void process() {
        Scanner in = new Scanner(System.in);

        if (testMode) {
            run(Main.taskManager.getPinned(), in);
            return;
        }

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

            run(task, in);
            in.nextLine();
        }
    }

    private static void run(Task task, Scanner in) {
//        try {
            task.start(in);
//        } catch (Exception e) {
//            System.out.println("ОШИБКА: " + e.getMessage());
//        }
    }

    private static void init() {
        Main.taskManager = new TaskManager();

        Main.taskManager.addTask(new CoordinatePointTask());
        Main.taskManager.addTask(new CommentTask());
        Main.taskManager.addTask(new PersonTask());
        Main.taskManager.addTask(new NameTask());
        Main.taskManager.addTask(new TimeTask());
        Main.taskManager.addTask(new HouseTask());
        Main.taskManager.addTask(new StraightTask());
        Main.taskManager.addTask(new NamedPersonTask());
        Main.taskManager.addTask(new ParentPersonTask());
        Main.taskManager.addTask(new StaffTask());
        Main.taskManager.addTask(new NestedCommentTask());
        Main.taskManager.addTask(new TrackTask());
        Main.taskManager.addTask(new StudentTask());
        Main.taskManager.addTask(new GradeBookTask());
        Main.taskManager.addTask(new CityTask());
        Main.taskManager.addTask(new LinkedTrackTask());

        Main.taskManager.addTask(new ExtraInterfaceTask(), false);
    }
}
