package me.rostkov.lab.task.chapter_1.unit_2.task_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_1.task_4.Name;

import java.util.Scanner;

public class ParentPersonTask extends BaseTask implements Task {
    public ParentPersonTask() {
        this.id = "1.2.3";
        this.title = "Человек с родителем";
        this.description = "Необходимо модифицировать сущность Человек из задачи 2.2 добавив ему возможность " +
                "задавать третий параметр: Отец, где Отец - это тоже Человек. ";
    }

    @Override
    public void start(Scanner in) {
        ParentPerson ivan = new ParentPerson(new Name("Иван", "Чудов"), (short) 186);
        ParentPerson petr = new ParentPerson(new Name("Петр", "Чудов"), (short) 184);
        ParentPerson boris = new ParentPerson(new Name("Борис"), (short) 177);

        petr.setParent(ivan);
        boris.setParent(petr);

        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
    }
}
