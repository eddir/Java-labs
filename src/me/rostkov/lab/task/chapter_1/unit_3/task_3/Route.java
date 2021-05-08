package me.rostkov.lab.task.chapter_1.unit_3.task_3;

public class Route {
    private City city;
    private int price;

    public Route(City city, int price) {
        this.city = city;
        this.price = price;
    }

    @Override
    public String toString() {
        return city.getName() + ": " + price;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
