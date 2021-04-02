package me.rostkov.lab.task.chapter_1.unit_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class TimeTask extends BaseTask implements Task {

    public TimeTask() {
        this.id = "1.5";
        this.title = "Время";
        this.description = "Необходимо разработать сущность Время, которое будет описывать текущее время суток " +
                "в 24-х часовом формате. Время описывается числом секунд, прошедшим с начала суток. Время может быть " +
                "приведено к текстовой форме следующего формата: “ЧЧ:ММ:СС”";
    }

    @Override
    public void start(Scanner in) {
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
