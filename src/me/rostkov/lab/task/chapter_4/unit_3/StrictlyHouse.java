package me.rostkov.lab.task.chapter_4.unit_3;

import me.rostkov.lab.task.chapter_1.unit_6.House;

public class StrictlyHouse {
    private final int floors;

    public StrictlyHouse(int floors) {
        House.checkFloors(floors);
        this.floors = floors;
    }

    public static void checkFloors(int floors) {
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

    public int setFloors(int floors) {
        throw new IllegalStateException("Дому нельзя изменить количество этажей!");
    }

}
