package me.rostkov.lab.task.chapter_3.unit_3;

import me.rostkov.lab.task.BaseTask;
import me.rostkov.lab.task.Task;

import java.util.Arrays;
import java.util.Scanner;

public class CityTask extends BaseTask implements Task {
    public CityTask() {
        this.id = "3.3";
        this.title = "Города";
        this.description = "Необходимо разработать сущность Город, которая будет представлять собой точку на карте.";
    }

    @Override
    public void start(Scanner in) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F");

        a.addRoute(new Route(b, 5));
        a.addRoute(new Route(d, 6));
        a.addRoute(new Route(f, 1));
        b.addRoute(new Route(a, 5));
        b.addRoute(new Route(c, 3));
        c.addRoute(new Route(b, 3));
        c.addRoute(new Route(d, 4));
        d.addRoute(new Route(c, 4));
        d.addRoute(new Route(e, 2));
        d.addRoute(new Route(a, 6));
        e.addRoute(new Route(f, 2));
        f.addRoute(new Route(b, 1));
        f.addRoute(new Route(e, 2));

        City current = a;

        while (true) {
            System.out.println("Вы находитесь в городе:");
            System.out.println(current);
            System.out.println("Выберите путь...");

            String input = in.nextLine();

            if (!input.equals("q")) {
                try {
                    Route nextRoute = current.getRoutes()[Integer.parseInt(input)];
                    current = nextRoute.getCity();
                } catch (IndexOutOfBoundsException | NumberFormatException ex) {
                    System.out.println("Маршрут не найден. Используйте q для выхода.");
                }
            } else {
                return;
            }
        }
    }
}
