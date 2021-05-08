package me.rostkov.lab.task.chapter_1.unit_4.task_5;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class StrictlyNameTask extends BaseTask implements Task {
    public StrictlyNameTask() {
        this.id = "4.5";
        this.title = "Сущность Время со строгим конструктором";
        this.description = "В данной задаче необходимо модифицировать сущность Имя из задачи 1.4. ";
    }

    @Override
    public void start(Scanner in) {
        StrictlyName name1 = new StrictlyName("Клеопатра");
        StrictlyName name2 = new StrictlyName("Александр", "Сергеевич", "Пушкин");
        StrictlyName name3 = new StrictlyName("Владимир", "Маяковский");
        StrictlyName name4 = new StrictlyName("Христофор", "Бонифатьевич");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
