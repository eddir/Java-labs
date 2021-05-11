package me.rostkov.lab.task.chapter_6.unit_1.task_1;

public class StrictlyStorage<T> {
    private T item;
    private final T alternative;

    private static StrictlyStorage<Object> nullStorage;

    private StrictlyStorage(T alternative) {
        this.alternative = alternative;
    }

    private StrictlyStorage(T item, T alternative) {
        this.item = item;
        this.alternative = alternative;
    }

    public static <T> StrictlyStorage<T> valueOf(T item) {
        return valueOf(item, null, false);
    }

    public static <T> StrictlyStorage<T> valueOf(T item, T alternative) {
        return valueOf(item, alternative, true);
    }

    @SuppressWarnings("unchecked")
    public static <T> StrictlyStorage<T> valueOf(T item, T alternative, boolean nullable) {
        if (item == null && alternative == null) {
            if (nullStorage == null) {
                nullStorage = new StrictlyStorage<>(null);
            }
            return (StrictlyStorage<T>) nullStorage;
        }
        if (item == null && !nullable) {
            throw new IllegalArgumentException();
        }
        return new StrictlyStorage<>(item, alternative);
    }

    public T getItem() {
        if (item == null) {
            return alternative;
        }
        return item;
    }

}
