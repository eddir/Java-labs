package me.rostkov.lab.task.chapter_2.unit_2.task_1;

import me.rostkov.lab.task.chapter_2.unit_1.task_3.ExtendableArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private ExtendableArray marks;

    public Student(String name) {
        this.setName(name);
        this.marks = new ExtendableArray();
    }

    public Student(String name, int... marks) {
        this.setName(name);
        this.marks = new ExtendableArray(marks);
    }

    public Student(String name, List<Integer> marks) {
        this.setName(name);
        this.marks = new ExtendableArray(marks);
    }

    public void addMark(int mark) {
        if (Arrays.stream(new int[]{2, 3, 4, 5}).noneMatch(m -> m == mark)) {
            throw new IllegalArgumentException("Недопустимая оценка. Оценка должна быть среди множества [2, 3, 4, 5].");
        }
        this.marks.add(mark);
    }

    public void addMarks(int[] marks) {
        this.marks.add(marks);
    }

    public void addMarks(List<Integer> marks) {
        this.marks.add(marks);
    }

    public List<Integer> getMarks() {
        return Arrays.stream(this.marks.toArray()).boxed().collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Имя студента не может быть пустым.");
        }
        this.name = name;
    }

    public double getAverageMark() {
        return Arrays.stream(this.marks.toArray()).average().orElse(0);
    }

    public boolean isExcellent() {
        return this.marks.getSize() > 0 && Arrays.stream(this.marks.toArray()).allMatch(mark -> mark == 5);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
