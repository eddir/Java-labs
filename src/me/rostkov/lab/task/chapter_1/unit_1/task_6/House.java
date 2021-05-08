package me.rostkov.lab.task.chapter_1.unit_1.task_6;

public class House {

    private int floors;

    public House(int floors) {
        House.checkFloors(floors);
        this.floors = floors;
    }

    public static void checkFloors(int floors) {
        // TODO: https://softwareengineering.stackexchange.com/questions/329806/why-did-it-not-become-a-common-pattern-to-use-setters-in-the-constructor

        if (floors < 1) {
            throw new IllegalArgumentException("Слишком мало этажей.");
        }
    }

    public String toString() {
        if (this.floors == 1) {
            return "дом с " + this.floors + " этажом";
        }
        return "дом с " + this.floors + " этажами";
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        House.checkFloors(floors);
        this.floors = floors;
    }
}
