package me.rostkov.lab.task.chapter_1.unit_4.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StrictlyPointTask extends BaseTask implements Task {
    public StrictlyPointTask() {
        this.id = "1.4.1";
        this.title = "Сущность точка со строгим конструктором";
        this.description = "В данной задаче необходимо модифицировать сущность Точка из задачи 1.1. В соответствии с " +
                "новыми требованиями создать объект Точки можно только путем указания обеих координат: X и Y. ";
    }

    @Override
    public void start(Scanner in) {
        StrictlyPoint p1 = new StrictlyPoint(3, 5);
        StrictlyPoint p2 = new StrictlyPoint(25, 6);
        StrictlyPoint p3 = new StrictlyPoint(7, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
