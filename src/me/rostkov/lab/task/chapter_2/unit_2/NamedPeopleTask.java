package me.rostkov.lab.task.chapter_2.unit_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_4.Name;

public class NamedPeopleTask extends BaseTask implements Task {
    public NamedPeopleTask() {
        this.id = "2.2";
        this.title = "Человек с именем";
        this.description = "Необходимо объединить сущности Человек из задачи 1.3 и Имя из задачи 1.4 таким образом, " +
                "чтобы имя человека задавалось с использованием сущности 1.4, а не строки. ";
    }

    @Override
    public void start() {
        NamedPeople people1 = new NamedPeople(new Name("Клеопатра"), (short) 152);
        NamedPeople people2 = new NamedPeople(new Name("Александр", "Сергеевич", "Пушкин"), (short) 167);
        NamedPeople people3 = new NamedPeople(new Name("Владимир", "Маяковский"), (short) 189);

        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);
    }
}
