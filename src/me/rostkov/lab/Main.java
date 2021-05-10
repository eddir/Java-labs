package me.rostkov.lab;

import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.TaskManager;
import me.rostkov.lab.task.chapter_1.unit_1.task_1.CoordinatePointTask;
import me.rostkov.lab.task.chapter_1.unit_1.task_2.CommentTask;
import me.rostkov.lab.task.chapter_1.unit_1.task_3.PersonTask;
import me.rostkov.lab.task.chapter_1.unit_1.task_4.NameTask;
import me.rostkov.lab.task.chapter_1.unit_1.task_5.TimeTask;
import me.rostkov.lab.task.chapter_1.unit_1.task_6.HouseTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_1.StraightTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_2.NamedPersonTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_3.ParentPersonTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_4.StaffTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_5.NestedCommentTask;
import me.rostkov.lab.task.chapter_1.unit_2.task_6.TrackTask;
import me.rostkov.lab.task.chapter_1.unit_3.task_1.StudentTask;
import me.rostkov.lab.task.chapter_1.unit_3.task_2.GradeBookTask;
import me.rostkov.lab.task.chapter_1.unit_3.task_3.CityTask;
import me.rostkov.lab.task.chapter_1.unit_3.task_4.LinkedTrackTask;
import me.rostkov.lab.task.chapter_1.unit_3.task_5.ArticleTask;
import me.rostkov.lab.task.chapter_1.unit_4.task_1.StrictlyPointTask;
import me.rostkov.lab.task.chapter_1.unit_4.task_2.StrictlyStraightTask;
import me.rostkov.lab.task.chapter_1.unit_4.task_3.StrictlyHouseTask;
import me.rostkov.lab.task.chapter_1.unit_4.task_4.StrictlyTimeTask;
import me.rostkov.lab.task.chapter_1.unit_4.task_5.StrictlyNameTask;
import me.rostkov.lab.task.chapter_1.unit_5.task_1.GunTask;
import me.rostkov.lab.task.chapter_1.unit_5.task_5.FractionTask;
import me.rostkov.lab.task.chapter_1.unit_6.task_1.HouseAboveGroundTask;
import me.rostkov.lab.task.chapter_1.unit_6.task_4.StrictlyFractionTask;
import me.rostkov.lab.task.chapter_1.unit_6.task_5.RechargeableGunTask;
import me.rostkov.lab.task.chapter_2.unit_1.task_1.ImmutableArrayTask;
import me.rostkov.lab.task.chapter_2.unit_1.task_2.NonExtendedArrayTask;
import me.rostkov.lab.task.chapter_2.unit_1.task_3.ExtendableArrayTask;
import me.rostkov.lab.task.chapter_2.unit_2.task_1.StudentMarkListTask;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFractionTask;
import me.rostkov.lab.task.chapter_3.unit_2.task_1.PistolTask;
import me.rostkov.lab.task.chapter_3.unit_2.task_2.NumberFractionTask;
import me.rostkov.lab.task.chapter_3.unit_3.task_1.SumTask;
import me.rostkov.lab.task.chapter_3.unit_4.task_1.ComparingFractionTask;
import me.rostkov.lab.task.chapter_4.unit_2.task_4.CloneableFractionTask;
import me.rostkov.lab.task.chapter_5.unit_1.task_1.BoxTask;
import me.rostkov.lab.task.chapter_5.unit_1.task_2.StorageTask;
import me.rostkov.lab.task.chapter_5.unit_2.task_2.MaximumTask;
import me.rostkov.lab.task.extra.extra_1.ExtraInterfaceTask;
import me.rostkov.lab.task.extra.extra_2.CalendarTask;

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

        System.out.println("\nЗавершение...");
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
        if (testMode) {
            task.start(in);
            return;
        }

        try {
            task.start(in);
        } catch (Exception e) {
            System.out.println("ОШИБКА: " + e.getMessage());
        }
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
        Main.taskManager.addTask(new ArticleTask());
        Main.taskManager.addTask(new StrictlyPointTask());
        Main.taskManager.addTask(new StrictlyStraightTask());
        Main.taskManager.addTask(new StrictlyHouseTask());
        Main.taskManager.addTask(new StrictlyTimeTask());
        Main.taskManager.addTask(new StrictlyNameTask());
        Main.taskManager.addTask(new GunTask());
        Main.taskManager.addTask(new HouseAboveGroundTask());
        Main.taskManager.addTask(new ImmutableArrayTask());
        Main.taskManager.addTask(new NonExtendedArrayTask());
        Main.taskManager.addTask(new ExtendableArrayTask());
        Main.taskManager.addTask(new StudentMarkListTask());
        Main.taskManager.addTask(new FractionTask());
        Main.taskManager.addTask(new StrictlyFractionTask());
        Main.taskManager.addTask(new FinallyFractionTask());
        Main.taskManager.addTask(new RechargeableGunTask());
        Main.taskManager.addTask(new PistolTask());
        Main.taskManager.addTask(new SumTask());
        Main.taskManager.addTask(new NumberFractionTask());
        Main.taskManager.addTask(new ComparingFractionTask());
        Main.taskManager.addTask(new CloneableFractionTask());
        Main.taskManager.addTask(new BoxTask());
        Main.taskManager.addTask(new StorageTask());
        Main.taskManager.addTask(new MaximumTask());

        Main.taskManager.addTask(new ExtraInterfaceTask(), false);
        Main.taskManager.addTask(new CalendarTask(), false);
    }
}
