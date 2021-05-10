package me.rostkov.lab.task.chapter_1.unit_6.task_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class RechargeableGunTask extends BaseTask implements Task {
    public RechargeableGunTask() {
        this.id = "1.6.5";
        this.title = "Перезарядка пистолета";
        this.description = "Измените сущность Пистолет из задачи 1.5.1.";
    }

    @Override
    public void start(Scanner in) {
        RechargeableGun gun = new RechargeableGun(7);
        gun.recharge(3);
        gun.shoot();
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
