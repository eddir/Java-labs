package me.rostkov.lab.task.chapter_1.unit_3.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StudentTask extends BaseTask implements Task {
    public StudentTask() {
        this.id = "1.3.1";
        this.title = "Студент";
        this.description = "Необходимо разработать сущность Студент, которая описывается:\n" +
                "•\tИмя: строка\n" +
                "•\tОценки: массив целых чисел.\n" +
                "•\tМожет возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”\n";
    }

    @Override
    public void start(Scanner in) {
        Student vasya = new Student("Вася", new int[]{3, 4, 5});
        Student petya = new Student("Петя", vasya.getMarks());

        petya.changeMark(0, 5);

        System.out.println(vasya);
        System.out.println(petya);

        Student andrey = new Student("Андрей", vasya.getMarks().clone());

        andrey.changeMark(0, 3);

        System.out.println(vasya);
        System.out.println(andrey);
    }
}
