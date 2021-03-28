package me.rostkov.lab.task.chapter_1.unit_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

public class PeopleTask extends BaseTask implements Task {

    public PeopleTask() {
        this.id = "1.3";
        this.title = "Человек";
        this.description = "Необходимо разработать сущность Человек, которая описывается:\n" +
                "•\tИмя: строка\n" +
                "•\tРост: целое число\n" +
                "•\tМожет возвращать текстовое представление вида “Имя большой человек”, либо “Имя средний человек”, " +
                "либо “Имя маленький человек”, выбор фразы должен зависеть от роста человека (Например, можно " +
                "использовать следующие правила: рост менее 160 – низкий, выше 185 – высокий, остальные обычные).\n";
    }

    @Override
    public void start() {
        People people1 = new People("Клеопатра", (short) 152);
        People people2 = new People("Пушкин", (short) 167);
        People people3 = new People("Владимир", (short) 189);

        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);
    }
}
