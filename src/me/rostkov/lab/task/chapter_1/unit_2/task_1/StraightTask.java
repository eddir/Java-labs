package me.rostkov.lab.task.chapter_1.unit_2.task_1;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;
import me.rostkov.lab.task.chapter_1.unit_1.task_1.Point;

import java.util.Scanner;

public class StraightTask extends BaseTask implements Task {
    public StraightTask() {
        this.id = "2.1";
        this.title = "Прямая";
        this.description = "Необходимо разработать сущность Линия, расположенную на двумерной плоскости которая описывается:\n" +
                "•\tКоордината начала: Точка\n" +
                "•\tКоордината конца: Точка\n" +
                "•\tМожет возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”\n";
    }

    @Override
    public void start(Scanner in) {
        // Устанавливаем 2 независимые линии и одну с точками от предыдущих
        Straight line1 = new Straight(new Point(1, 3), new Point(23, 8));
        Straight line2 = new Straight(new Point(5, 10), new Point(25, 10));
        Straight line3 = new Straight(line1.getPoint1(), line2.getPoint2());

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        // Проверяем как меняются точки в 3 линии при изменении в первых 2
        line1.getPoint1().setX(6);
        line2.getPoint2().setX(0);

        System.out.println();
        System.out.println(line1);
        System.out.println(line3);

        // Отвязываем координаты первой линии от третьей так, чтобы они не менялись
        line1.setPoint1(line1.getPoint1().clone());
        line1.setPoint2(line1.getPoint2().clone());
        line1.getPoint1().setX(99);

        System.out.println();
        System.out.println(line1);
        System.out.println(line3);
    }
}
