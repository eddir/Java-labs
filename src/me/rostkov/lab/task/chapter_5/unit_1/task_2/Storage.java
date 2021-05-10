package me.rostkov.lab.task.chapter_5.unit_1.task_2;

public class Storage<T> {
    private T item;
    private final T alternative;

    public Storage(T alternative) {
        this.alternative = alternative;
    }

    public Storage(T item, T alternative) {
        this.item = item;
        this.alternative = alternative;
    }

    public T getItem() {
        if (item == null) {
            return alternative;
        }
        return item;
    }
}
