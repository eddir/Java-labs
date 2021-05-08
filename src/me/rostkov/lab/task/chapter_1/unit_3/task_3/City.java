package me.rostkov.lab.task.chapter_1.unit_3.task_3;

import java.util.Arrays;

public class City {
    private String name;
    private Route[] routes;

    public City(String name) {
        this.name = name;
    }

    public City(String name, Route[] routes) {
        this.name = name;
        this.routes = routes;
    }

    public void addRoute(Route route) {
        if (this.routes == null) {
            this.routes = new Route[]{route};
        } else {
            this.routes = Arrays.copyOf(this.routes, this.routes.length + 1);
            this.routes[this.routes.length - 1] = route;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(name + ":\n");

        for (int i = 0, routesLength = routes.length; i < routesLength; i++) {
            Route route = routes[i];
            str.append(String.format("   %d. %s \n", i, route.toString()));
        }

        return str.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Route[] getRoutes() {
        return routes;
    }

    public void setRoutes(Route[] routes) {
        this.routes = routes;
    }
}
