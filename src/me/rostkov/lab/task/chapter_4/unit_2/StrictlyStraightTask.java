package me.rostkov.lab.task.chapter_4.unit_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_4.unit_1.StrictlyPoint;

import java.util.Scanner;

public class StrictlyStraightTask extends BaseTask implements Task {
    public StrictlyStraightTask() {
        this.id = "4.2";
        this.title = "Сущность прямая со строгим конструктором";
        this.description = "В данной задаче необходимо модифицировать сущность Линия из задачи 2.1. ";
    }

    @Override
    public void start(Scanner in) {
        StrictlyStraight line1 = new StrictlyStraight(new StrictlyPoint(1, 3), new StrictlyPoint(23, 8));
        StrictlyStraight line2  = new StrictlyStraight(5, 10, 25, 10);
        StrictlyStraight line3 = new StrictlyStraight(line1.getPoint1(), line2.getPoint2());

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
