package me.rostkov.lab.task.chapter_1.unit_6.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_4.task_3.StrictlyHouse;

import java.util.Scanner;

public class HouseAboveGroundTask extends BaseTask implements Task {
    public HouseAboveGroundTask() {
        this.id = "1.6.1";
        this.title = "Дом над землей";
        this.description = "Измените сущность Дом из задачи 1.4.3. Гарантируйте, что у дома всегда будет \n" +
                "положительное количество этажей. В случае попытки указать отрицательное количество этажей \n" +
                "должна выбрасываться соответствующая ошибка. Продемонстрируйте работоспособность решения на \n" +
                "примерах.";
    }

    @Override
    public void start(Scanner in) {
        StrictlyHouse house;

        house = new StrictlyHouse(5);
        System.out.println(house);
        
        house = new StrictlyHouse(-4);
        System.out.println(house);
    }
}
