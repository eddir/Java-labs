package me.rostkov.lab.task.chapter_1.unit_1.task_4;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Scanner;

public class NameTask extends BaseTask implements Task {
    public NameTask() {
        this.id = "1.4";
        this.title = "Имена";
        this.description = "Необходимо разработать сущность Имя, которая описывается тремя параметрами: Фамилия, " +
                "Личное имя, Отчество. Имя может быть приведено к строковому виду, включающему традиционное " +
                "представление всех трех параметров, например “Иванов Иван Иванович”. Необходимо предусмотреть " +
                "возможность того, что какой-либо из параметров может быть не задан, и в этом случае он не " +
                "учитывается при приведении к текстовому виду. ";
    }

    @Override
    public void start(Scanner in) {
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Александр", "Сергеевич", "Пушкин");
        Name name3 = new Name("Владимир", "Маяковский");

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
