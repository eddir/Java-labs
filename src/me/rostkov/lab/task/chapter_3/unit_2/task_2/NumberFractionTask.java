package me.rostkov.lab.task.chapter_3.unit_2.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;

import java.util.Scanner;

public class NumberFractionTask extends BaseTask implements Task {
    public NumberFractionTask() {
        this.id = "3.2.2";
        this.title = "Дробь это число";
        this.description = """
                Измените сущность Дробь, полученную в задаче 3.1.1. Дробь должна быть\s
                подтипом класса Number. Данный класс входит в стандартную редакцию языка Java.""";
    }

    @Override
    public void start(Scanner in) {
        FinallyFraction fraction = new FinallyFraction(1, 2);
        System.out.println(fraction.floatValue());
    }
}
