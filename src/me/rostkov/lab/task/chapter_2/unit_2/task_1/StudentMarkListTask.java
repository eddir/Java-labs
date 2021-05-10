package me.rostkov.lab.task.chapter_2.unit_2.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarkListTask extends BaseTask implements Task {
    public StudentMarkListTask() {
        this.id = "2.2.1";
        this.title = "Список оценок студента";
        this.description = """
                В данной задаче необходимо модифицировать сущность Студент из\s
                задачи 1.6.9. На текущий момент Студент представляет собой неизменяемую сущность, так как оценки\s
                добавляются при инициализации объекта и в дальнейшем не могут быть изменены. Необходимо так\s
                изменить Студента, что бы оценки можно было добавлять в течении жизни объекта.""";
    }

    @Override
    public void start(Scanner in) {
        Student student1 = new Student("Петя");
        student1.addMark(5);
        System.out.println(student1);

        Student student2 = new Student("Коля");
        student2.addMarks(new ArrayList<Integer>(){{
            add(4);
            add(4);
            add(4);
            add(3);
            add(3);
            add(5);
        }});
        System.out.println(student2);

        System.out.printf("%s %s. Средняя оценка - %.2f.%n",
                student1.getName(), student1.isExcellent() ? "отличник" : "не отличник", student1.getAverageMark());
        System.out.printf("%s %s. Средняя оценка - %.2f.%n",
                student2.getName(), student2.isExcellent() ? "отличник" : "не отличник", student2.getAverageMark());
    }
}
