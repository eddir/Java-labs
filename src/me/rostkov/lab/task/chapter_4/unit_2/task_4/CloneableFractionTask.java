package me.rostkov.lab.task.chapter_4.unit_2.task_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;

import java.util.Scanner;

public class CloneableFractionTask extends BaseTask implements Task {
    public CloneableFractionTask() {
        this.id = "4.2.4";
        this.title = "Клонирование дроби";
        this.description = """
                Измените сущность Дробь из 3.4.1. Переопределите метод клонирования,\s
                унаследованный от класса Object, таким образом, чтобы при его вызове возвращался новый объект\s
                Дроби, значения полей которого будут копиями оригинальной Дроби.""";
    }

    @Override
    public void start(Scanner in) {
        FinallyFraction f1 = new FinallyFraction(3, 2);
        FinallyFraction f2 = new FinallyFraction(1, 2);
        System.out.println(f1.equals(f2));

        try {
            f2 = (FinallyFraction) f1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(f1.equals(f2));
    }
}
