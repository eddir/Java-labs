package me.rostkov.lab.task.chapter_3.unit_1.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class FinallyFractionTask extends BaseTask implements Task {
    public FinallyFractionTask() {
        this.id = "3.1.1";
        this.title = "Запретная дробь";
        this.description = "Измените сущность Дробь, полученную в задаче 1.6.4. Гарантируйте, что \n" +
                "невозможно создать такой подвид дроби, который позволял бы создавать Дроби с изменяемым \n" +
                "состоянием.\n";
    }

    @Override
    public void start(Scanner in) {

        FinallyFraction f1 = new FinallyFraction(1, 8);
        FinallyFraction f2 = new FinallyFraction(-1, 5);
        FinallyFraction f3 = new FinallyFraction(1, 16);

        System.out.printf("%s + %s = %s%n", f1, f2, f1.sum(f2));
        System.out.printf("%s + %s = %s%n", f1, 2, f1.sum(2));
        System.out.printf("%s - %s = %s%n", f1, f2, f1.minus(f2));
        System.out.printf("%s - %s = %s%n", f1, 3, f1.minus(3));
        System.out.printf("%s * %s = %s%n", f1, f2, f1.mult(f2));
        System.out.printf("%s * %s = %s%n", f1, 4, f1.mult(4));
        System.out.printf("%s / %s = %s%n", f1, f2, f1.div(f3));
        System.out.printf("%s / %s = %s%n", f1, 5, f1.div(5));

        System.out.println(f1.sum(f2).div(f3).minus(5));
    }
}
