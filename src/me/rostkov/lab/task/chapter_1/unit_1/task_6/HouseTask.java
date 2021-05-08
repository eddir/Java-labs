package me.rostkov.lab.task.chapter_1.unit_1.task_6;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class HouseTask extends BaseTask implements Task {

    public HouseTask() {
        this.id = "1.1.6";
        this.title = "Дом";
        this.description = "Необходимо разработать сущность Дом, которая описывается количеством этажей в виде числа." +
                " У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”, где N " +
                "это число. Гарантировать правильное окончание фразы, в зависимости от количества этажей. Создать и " +
                "вывести на экран дома с 1, 5, 23 этажами.";
    }

    @Override
    public void start(Scanner in) {
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(23);

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }
}
