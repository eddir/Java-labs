package me.rostkov.lab.task.chapter_1.unit_5.task_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class FractionTask extends BaseTask implements Task {
    public FractionTask() {
        this.id = "1.5.5";
        this.title = "Дроби";
        this.description = "Создайте сущность Дробь";
    }

    @Override
    public void start(Scanner in) {
        Fraction f1 = new Fraction(3, 2);
        Fraction f2 = new Fraction(4, 8);
        Fraction f3 = new Fraction(6, 7);

        System.out.printf("%s + %s = %s%n", f1, f2, f1.sum(f2));
        System.out.printf("%s - %s = %s%n", f1, f2, f1.minus(f2));
        System.out.printf("%s * %s = %s%n", f1, f2, f1.mult(f2));
        System.out.printf("%s / %s = %s%n", f1, f2, f1.div(f2));
        System.out.printf("%s + %s = %s%n", f1, 2, f1.sum(2));
        System.out.printf("%s - %s = %s%n", f1, 3, f1.minus(3));
        System.out.printf("%s * %s = %s%n", f1, 4, f1.mult(4));
        System.out.printf("%s / %s = %s%n", f1, 5, f1.div(5));

        System.out.println(f1.sum(f2).div(f3).minus(5));
    }
}
