package me.rostkov.lab.task.chapter_2.unit_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_4.Name;

public class NamedPersonTask extends BaseTask implements Task {
    public NamedPersonTask() {
        this.id = "2.2";
        this.title = "Человек с именем";
        this.description = "Необходимо объединить сущности Человек из задачи 1.3 и Имя из задачи 1.4 таким образом, " +
                "чтобы имя человека задавалось с использованием сущности 1.4, а не строки. ";
    }

    @Override
    public void start() {
        NamedPerson person1 = new NamedPerson(new Name("Клеопатра"), (short) 152);
        NamedPerson person2 = new NamedPerson(new Name("Александр", "Сергеевич", "Пушкин"), (short) 167);
        NamedPerson person3 = new NamedPerson(new Name("Владимир", "Маяковский"), (short) 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
