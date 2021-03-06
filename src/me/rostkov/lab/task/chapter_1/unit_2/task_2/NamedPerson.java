package me.rostkov.lab.task.chapter_1.unit_2.task_2;

import me.rostkov.lab.task.chapter_1.unit_1.task_4.Name;

public class NamedPerson {
    private Name name;
    private short height;

    public NamedPerson(Name name, short height) {
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

}
