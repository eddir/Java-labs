package me.rostkov.lab.task.chapter_1.unit_3;

public class People {

    private String name;
    private short height;

    public People(String name, short height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        if (height < 160) {
            return name + " маленький человек";
        } else if (height <= 185) {
            return name + " средний человек";
        }
        return name + " большой человек";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }
}
