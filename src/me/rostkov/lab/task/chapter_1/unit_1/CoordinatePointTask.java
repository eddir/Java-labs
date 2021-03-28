package me.rostkov.lab.task.chapter_1.unit_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

public class CoordinatePointTask extends BaseTask implements Task {

    public CoordinatePointTask() {
        this.id = "1.1";
        this.title = "Сущность Точка";
        this.description = "Необходимо разработать сущность Точка, расположенную на двумерной плоскости, которая описывается:\n" +
                "•\tКоордината Х: число\n" +
                "•\tКоордината Y: число\n" +
                "•\tМожет возвращать текстовое представление вида “{X;Y}”\n" +
                "Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление.\n";
    }

    public void start() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(-1, -2);
        Point p3 = new Point();

        p3.setX(9000);
        p3.setY(-20000);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}
