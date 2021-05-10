package me.rostkov.lab.task.chapter_5.unit_1.task_1;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public Box() {
    }

    public T pick() {
        T item = this.item;
        this.item = null;
        return item;
    }

    public void put(T item) {
        if (this.item != null) {
            throw new IllegalStateException("В коробке уже лежит предмет.");
        }
        this.item = item;
    }

    public boolean isFilled() {
        return this.item != null;
    }
}
