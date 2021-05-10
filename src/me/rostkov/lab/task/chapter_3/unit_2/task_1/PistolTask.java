package me.rostkov.lab.task.chapter_3.unit_2.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class PistolTask extends BaseTask implements Task {
    public PistolTask() {
        this.id = "3.2.1";
        this.title = "Оружие";
        this.description = "Измените сущность Пистолет, полученную в задаче 1.6.5 таким образом, что бы она \n" +
                "наследовалась от класса Weapon описанного на рисунке 3.9.";
    }

    @Override
    public void start(Scanner in) {
        Pistol gun = new Pistol(7);
        gun.recharge(3);
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.recharge(8);
        gun.shoot();
        gun.shoot();
        gun.discharge();
        gun.shoot();
    }
}
