package me.rostkov.lab.task.chapter_5.unit_1.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class BoxTask extends BaseTask implements Task {
    public BoxTask() {
        this.id = "5.1.1";
        this.title = "Обобщённая коробка";
        this.description = """
                Создайте сущность Коробка, которая обладает следующими\s
                характеристиками:
                 Может хранить один произвольный объект в один момент времени.
                 Объект можно получить и разместить на хранение в любой момент времени.
                 Если объект забирают из коробки – ссылку на этот объект необходимо обнулить.
                 Если объект кладут в коробку, но она не пуста – необходимо выкинуть исключение.
                 Имеет метод проверки на заполненность.
                 Методы класса должны работать с тем типом данных, который был указан во время создания\s
                объекта
                """;
    }

    @Override
    public void start(Scanner in) {
        Box<Integer> box = new Box<>();
        box.put(3);
        System.out.println(square(box));
    }

    private int square(Box<Integer> box) {
        return (int) Math.pow(box.pick(), 2);
    }
}
