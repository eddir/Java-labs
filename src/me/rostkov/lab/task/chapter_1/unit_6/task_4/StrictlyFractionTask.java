package me.rostkov.lab.task.chapter_1.unit_6.task_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StrictlyFractionTask extends BaseTask implements Task {
    public StrictlyFractionTask() {
        this.id = "1.6.4";
        this.title = "Строгие дроби.";
        this.description = """
                Измените сущность Дробь из задачи 1.5.5. Реализуйте следующие требования:
                 Дробь не может быть изменена после создания
                 Необходимо корректно обрабатывать отрицательные значения. Учтите, что знаменатель не\s
                может быть отрицательным.""";
    }

    @Override
    public void start(Scanner in) {

        StrictlyFraction f1 = new StrictlyFraction(3, 2);
        StrictlyFraction f2 = new StrictlyFraction(-4, 8);
        StrictlyFraction f3 = new StrictlyFraction(6, 7);

        System.out.printf("%s - %s = %s%n", f1, f2, f1.minus(f2));
        System.out.printf("%s + %s = %s%n", f1, f2, f1.sum(f2));
        System.out.printf("%s / %s = %s%n", f1, f2, f1.div(f3));
        System.out.printf("%s * %s = %s%n", f1, f2, f1.mult(f2));
        System.out.printf("%s - %s = %s%n", f1, 3, f1.minus(3));
        System.out.printf("%s + %s = %s%n", f1, 2, f1.sum(2));
        System.out.printf("%s / %s = %s%n", f1, 5, f1.div(5));
        System.out.printf("%s * %s = %s%n", f1, 4, f1.mult(4));

        System.out.println(f1.sum(f2).div(f3).minus(5));
    }
}
