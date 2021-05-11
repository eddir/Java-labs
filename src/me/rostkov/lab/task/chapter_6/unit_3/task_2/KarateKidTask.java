package me.rostkov.lab.task.chapter_6.unit_3.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class KarateKidTask extends BaseTask implements Task {
    public KarateKidTask() {
        this.id = "6.3.2";
        this.title = "Малыш каратист";
        this.description = """
                Создайте сущность Каратист, которая описывается:
                 Имя: строка, неизменяемое
                 Каратист умеет бить ногой. В результате вызова данного метода на экран выводится строка\s
                “Имя: бац!”
                 Каратист умеет бить рукой. В результате вызова данного метода на экран выводится строка\s
                “Имя: кия!”
                 Каратист умеет бить в прыжке. В результате вызова данного метода на экран выводится строка\s
                “Имя: вжух!”
                Реализуйте возможность создавать произвольные комбинации ударов, которые могли бы\s
                выполняться произвольно выбранным Каратистом. Гарантируйте, что комбинация может быть\s
                изменена во время исполнения программы (добавлены или удалены удары, изменен их порядок).""";
    }

    @Override
    public void start(Scanner in) {
        ShotStrategy strategy = new ShotStrategy(new ArrayList<>() {{
            add(Shot.HAND);
            add(Shot.FOOT);
            add(Shot.HAND);
            add(Shot.JUMP);
        }});
        KarateKid kid = new KarateKid("Дэниэл");

        kid.knock(strategy);
    }
}
