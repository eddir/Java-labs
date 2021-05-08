package me.rostkov.lab.task.chapter_1.unit_5.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class GunTask extends BaseTask implements Task {

    public GunTask() {
        this.id = "1.5.1";
        this.title = "Пистолет стреляет";
        this.description = "Создайте сущность Пистолет.";
    }

    @Override
    public void start(Scanner in) {
        Gun gun = new Gun(3);

        for (int i = 0; i < 5; i++) {
            gun.shoot();
        }
    }
}
