package me.rostkov.lab.task.chapter_3.unit_3.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;

import java.util.Scanner;

public class SumTask extends BaseTask implements Task {
    public SumTask() {
        this.id = "3.3.1";
        this.title = "Сложение";
        this.description = "Разработайте метод, который принимает набор числовых значений и возвращает их \n" +
                "сумму в вещественной форме.";
    }

    @Override
    public void start(Scanner in) {
        System.out.println(sum(2, new FinallyFraction(3, 5), 2.3));
        System.out.println(sum(3.6, new FinallyFraction(49, 12), 3,
                new FinallyFraction(3, 2)));
        System.out.println(sum(new FinallyFraction(1, 3), 1));
    }

    public static float sum(Number ... nums) {
        float sum = 0;
        for (Number n : nums) {
            sum += n.floatValue();
        }
        return sum;
    }
}
