package me.rostkov.lab.task.chapter_1.unit_1.task_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class PersonTask extends BaseTask implements Task {

    public PersonTask() {
        this.id = "1.1.3";
        this.title = "Человек";
        this.description = "Необходимо разработать сущность Человек, которая описывается:\n" +
                "•\tИмя: строка\n" +
                "•\tРост: целое число\n" +
                "•\tМожет возвращать текстовое представление вида “Имя большой человек”, либо “Имя средний человек”, " +
                "либо “Имя маленький человек”, выбор фразы должен зависеть от роста человека (Например, можно " +
                "использовать следующие правила: рост менее 160 – низкий, выше 185 – высокий, остальные обычные).\n";
    }

    @Override
    public void start(Scanner in) {
        Person person1 = new Person("Клеопатра", (short) 152);
        Person person2 = new Person("Пушкин", (short) 167);
        Person person3 = new Person("Владимир", (short) 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
