package me.rostkov.lab.task.chapter_5.unit_1.task_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StorageTask extends BaseTask implements Task {
    public StorageTask() {
        this.id = "5.1.2";
        this.title = "Без null";
        this.description = """
                Создайте сущность Хранилище, которая обладает следующими характеристиками:
                 Может хранить один произвольный объект в один момент времени.
                 Хранилище неизменяемо.
                 Объект кладется в Хранилище при его создании. В качестве объекта может быть сохранено\s
                также и значение null.
                 Хранилище может вернуть ссылку на Объект.
                 Если вместо объекта хранится null, необходимо вернуть какое-либо альтернативное значение.
                 Метод получения значения должен работать с тем типом данных, который был указан во\s
                время создания объекта""";
    }

    @Override
    public void start(Scanner in) {
        Storage<String> storage = new Storage<>(null, "hello");
        System.out.println(prepare(storage));
    }

    private String prepare(Storage<String> storage) {
        return String.format("Извлечено из хранилища - %s", storage.getItem());
    }
}
