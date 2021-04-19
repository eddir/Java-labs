package me.rostkov.lab.task.chapter_4.unit_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_5.Time;

import java.util.Scanner;

public class StrictlyTimeTask extends BaseTask implements Task {
    public StrictlyTimeTask() {
        this.id = "4.4";
        this.title = "Сущность Время со строгим конструктором";
        this.description = "В данной задаче необходимо модифицировать сущность Время из задачи 1.5. ";
    }

    @Override
    public void start(Scanner in) {
        StrictlyTime time1 = new StrictlyTime(10000);
        StrictlyTime time2 = new StrictlyTime(2, 3, 5);

        System.out.println(time1);
        System.out.println(time2);
    }
}
