package me.rostkov.lab.task.chapter_3.unit_4.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;

import java.util.Scanner;

public class ComparingFractionTask extends BaseTask implements Task {
    public ComparingFractionTask() {
        this.id = "3.4.1";
        this.title = "Сравнение дробей";
        this.description = """
                 Измените сущность Дробь из задачи 3.2.2. Переопределите метод сравнения\s
                объектов по состоянию таким образом, чтобы две дроби считались одинаковыми тогда, когда у них\s
                одинаковые значения числителя и знаменателя.
                """;
    }

    @Override
    public void start(Scanner in) {
        FinallyFraction f1 = new FinallyFraction(3, 7);
        FinallyFraction f2 = new FinallyFraction(8, 4);
        FinallyFraction f3 = new FinallyFraction(8, 4);
        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));
    }
}
