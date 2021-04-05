package me.rostkov.lab.task.extra.extra_2;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTask extends BaseTask implements Task {
    public CalendarTask() {
        this.id = "E.2";
        this.title = "Календарь";
        this.description = "Необходимо разработать сущность Календарь";
    }

    @Override
    public void start(Scanner in) {
        Calendar calendar = new Calendar();

        calendar.addEvent(new Event(
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 9, 45),
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 11, 15),
                "Практика - ИВС",
                "Практическое занятие по дисциплине 'Игровые виды спорта'",
                "СГТУ имени Ю.А. Гагарина"
        ));
        calendar.addEvent(new Event(
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 11, 30),
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 13, 0),
                "Практика - современное ООП",
                "Практическое занятие по дисциплине 'Современное ООП'",
                "СГТУ имени Ю.А. Гагарина"
        ));
        calendar.addEvent(new Event(
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 9, 0),
                new GregorianCalendar(2021, GregorianCalendar.MARCH, 3, 15, 0),
                "Пары",
                "Пары",
                "СГТУ имени Ю.А. Гагарина"
        ));

        System.out.println("Ближайщие меропрития:\n");
        System.out.println(calendar);
    }
}
