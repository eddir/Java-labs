package me.rostkov.lab.task.chapter_6.unit_2.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;

import java.util.Scanner;

public class SumStringTask extends BaseTask implements Task {
    public SumStringTask() {
        this.id = "6.2.1";
        this.title = "Сложение чисел со строками";
        this.description = """
                Необходимо реализовать возможность передать в метод\s
                сложения целых чисел (из задачи 3.3.1) строки. Числовая форма строки высчитывается как количество\s
                символов в строке.""";
    }

    @Override
    public void start(Scanner in) {
        NumberFloat f1 = new NumberFloat(2);
        NumberFloat f2 = new NumberFloat(3.6);
        FinallyFraction f3 = new FinallyFraction(3, 5);
        StringFloat f4 = new StringFloat("3.4");

        System.out.println(sum(f1, f2));
        System.out.println(sum(f2, f3));
        System.out.println(sum(f3, f4));
        System.out.println(sum(f4, f4));
        System.out.println(sum(f4, f2));
        System.out.println(sum(f4, f1));
    }

    public static float sum(Floatable ... nums) {
        float sum = 0;
        for (Floatable n : nums) {
            sum += n.floatValue();
        }
        return sum;
    }
}
