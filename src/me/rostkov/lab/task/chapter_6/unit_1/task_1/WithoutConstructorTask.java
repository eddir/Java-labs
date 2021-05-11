package me.rostkov.lab.task.chapter_6.unit_1.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class WithoutConstructorTask extends BaseTask implements Task {
    public WithoutConstructorTask() {
        this.id = "6.1.1";
        this.title = "Без конструктора";
        this.description = """
                Измените сущность Хранилище из задачи 5.1.2, таким образом, что бы её\s
                можно было создать двумя способами: один должен разрешать сохранять null значение, а другой при\s
                получении null должен бросать исключение.
                """;
    }

    @Override
    public void start(Scanner in) {
        StrictlyStorage<Integer> s1 = StrictlyStorage.valueOf(1);
        StrictlyStorage<Integer> s2 = StrictlyStorage.valueOf(null, 2);
        StrictlyStorage<Integer> s3 = StrictlyStorage.valueOf(null);

        System.out.println(s1.getItem());
        System.out.println(s2.getItem());
        System.out.println(s3.getItem());
    }
}
