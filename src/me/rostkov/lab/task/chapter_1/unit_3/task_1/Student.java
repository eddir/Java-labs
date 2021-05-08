package me.rostkov.lab.task.chapter_1.unit_3.task_1;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void changeMark(int position, int mark) {
        try {
            this.marks[position] = mark;
        } catch (IndexOutOfBoundsException ignored) {} // TODO: допустимо?
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
