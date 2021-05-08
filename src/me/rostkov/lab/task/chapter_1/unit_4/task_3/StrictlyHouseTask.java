package me.rostkov.lab.task.chapter_1.unit_4.task_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StrictlyHouseTask extends BaseTask implements Task {
    public StrictlyHouseTask() {
        this.id = "1.4.3";
        this.title = "Сущность дом со строгим конструктором";
        this.description = "В данной задаче необходимо модифицировать сущность Дом из задачи 1.6. ";
    }

    @Override
    public void start(Scanner in) {
        StrictlyHouse house1 = new StrictlyHouse(2);
        StrictlyHouse house2 = new StrictlyHouse(35);
        StrictlyHouse house3 = new StrictlyHouse(91);

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

        try {
            house1.setFloors(5);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
