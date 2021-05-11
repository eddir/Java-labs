package me.rostkov.lab.task.chapter_5.unit_3.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FunctionTask extends BaseTask implements Task {
    public FunctionTask() {
        this.id = "5.3.1";
        this.title = "Функция";
        this.description = """
                Разработайте такой метод, который будет принимать список значений типа T, и объект\s
                имеющий единственный метод apply. Данный метод надо применить к элементам списка, и вернуть
                новый список значений типа P, при этом типы T и P могут совпадать, а могут не совпадать.""";
    }

    @Override
    public void start(Scanner in) {
        List<String> list1 = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> list2 = Arrays.asList(1, -3, 7);
        List<Integer[]> list3 = Arrays.asList(
                new Integer[] {1, 2, 3},
                new Integer[] {3, 1, 3},
                new Integer[] {8, -1, 4},
                new Integer[] {4, 9, -3},
                new Integer[] {-3, -1, -3}
        );

        System.out.println(this.<String, Integer>foo(list1));
        System.out.println(this.<Integer, Integer>foo(list2));
        System.out.println(this.<Integer[], Integer>foo(list3));
    }

    @SuppressWarnings("unchecked")
    public <T, P> List<P> foo(List<T> values) {
        Apply app = new Apply();
        List<P> newValues = new ArrayList<>();

        for (T value : values) {
            if (value instanceof String) {
                newValues.add((P) app.apply((String) value));
            } else if (value instanceof Integer) {
                newValues.add((P) app.apply((Integer) value));
            } else if (value instanceof Integer[]) {
                newValues.add((P) app.apply((Integer[]) value));
            }
        }

        return newValues;
    }
}
