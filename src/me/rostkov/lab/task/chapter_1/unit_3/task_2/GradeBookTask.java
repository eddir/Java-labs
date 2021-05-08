package me.rostkov.lab.task.chapter_1.unit_3.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class GradeBookTask extends BaseTask implements Task {
    public GradeBookTask() {
        this.id = "3.2";
        this.title = "Зачётка";
        this.description = "Необходимо разработать сущность Зачетка.";
    }

    @Override
    public void start(Scanner in) {
        GradeBook vasya = new GradeBook(171896, "Вася", new GradeRecord[]{
                new GradeRecord("Информатика", "Ермаков", 5),
                new GradeRecord("Математика", "Петрова", 4),
                new GradeRecord("Физика", "Сидоров", 5),
        });

        vasya.records[2] = new GradeRecord("Английский язык", "Буров", 4);

        GradeBook petya = new GradeBook(173654, "Петя", vasya.records.clone());

        System.out.println(vasya);
        System.out.println(petya);

        petya.records[1] = petya.records[1].clone();
        petya.records[1].setMark(5);

        System.out.println(petya);
        System.out.println(vasya);
    }
}
