package me.rostkov.lab.task.chapter_5.unit_2.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_3.unit_1.task_1.FinallyFraction;
import me.rostkov.lab.task.chapter_5.unit_1.task_2.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumTask extends BaseTask implements Task {
    public MaximumTask() {
        this.id = "5.2.2";
        this.title = "Поиск максимума";
        this.description = """
                Создайте метод, принимающий набор Хранилищ из задачи 5.1.2 и\s
                возвращающий максимальное из их значений в формате double. Принимаемые методом Хранилища\s
                могут быть параметризованы любыми видами чисел.
                """;
    }

    @Override
    public void start(Scanner in) {
        List<Storage<? extends Number>> storages = new ArrayList<>(){{
           add(new Storage<>(2));
           add(new Storage<>(4.0));
           add(new Storage<>(new FinallyFraction(12, 2)));
        }};
        System.out.println(getMax(storages));
    }

    public double getMax(List<Storage<? extends Number>> storages) {
        return storages.stream().mapToDouble(v -> v.getItem().doubleValue()).max().orElse(0);
    }
}
