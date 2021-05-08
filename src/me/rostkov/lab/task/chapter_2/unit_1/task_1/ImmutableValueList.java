package me.rostkov.lab.task.chapter_2.unit_1.task_1;

import java.util.Arrays;
import java.util.List;

public class ImmutableValueList {
    private int[] values;

    public ImmutableValueList(int... values) {
        this.values = values;
    }

    public ImmutableValueList(List<Integer> values) {
        this.values = new int[values.size()];
        int i = 0;
        for (Integer value : values) {
            this.values[i++] = value;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= this.values.length) {
            throw new IndexOutOfBoundsException();
        }
        return this.values[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= this.values.length) {
            throw new IndexOutOfBoundsException();
        }
        this.values[index] = value;
    }

    public boolean isEmpty() {
        return this.values.length == 0;
    }

    public int getSize() {
        return this.values.length;
    }

    public int[] toArray() {
        return Arrays.copyOf(this.values, this.values.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}
