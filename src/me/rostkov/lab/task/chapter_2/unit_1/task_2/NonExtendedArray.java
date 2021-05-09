package me.rostkov.lab.task.chapter_2.unit_1.task_2;

import java.util.Arrays;
import java.util.List;

public class NonExtendedArray {
    /**
     * Значения массива.
     */
    private int[] values;
    /**
     * Максимально допустимая длина.
     */
    private int length;

    public NonExtendedArray() {
        this.length = 100;
        this.values = new int[0];
    }

    public NonExtendedArray(int length) {
        this.length = length;
        this.values = new int[0];
    }

    public NonExtendedArray(List<Integer> values) {
        this.length = values.size();
        this.values = new int[length];
        int i = 0;
        for (Integer value : values) {
            this.values[i++] = value;
        }
    }

    public void add(int value) {
        if (this.length == this.values.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.values = Arrays.copyOf(this.values, this.values.length + 1);
        this.values[this.values.length - 1] = value;
    }

    public void add(int[] values) {
        if (this.values.length + values.length > this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] newValues = new int[this.values.length + values.length];
        System.arraycopy(this.values, 0, newValues, 0, this.values.length);
        System.arraycopy(values, 0, newValues, this.values.length, values.length);
        this.values = newValues;
    }

    public void add(List<Integer> values) {
        // Какой способ лучше применить? DRY или в пользу оптимизации?

        // Тут мы используем ранее написанный код
        //this.add(values.stream().mapToInt(i->i).toArray());

        // Здесь повторяемся, но выигрываем в числе операций?
        if (this.values.length + values.size() > this.length) {
            throw new ArrayStoreException();
        }

        int[] newValues = new int[this.values.length + values.size()];
        System.arraycopy(this.values, 0, newValues, 0, this.values.length);

        for (int i = 0; i < values.size(); i++) {
            newValues[i + this.values.length] = values.get(i);
        }

        this.values = newValues;
    }

    public void set(int index, int value) {

        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (this.length == this.values.length) {
            throw new ArrayStoreException("Список переполнен.");
        }

        int[] newValues = new int[this.values.length + 1];
        System.arraycopy(this.values, 0, newValues, 0, index);
        newValues[index] = value;
        System.arraycopy(this.values, index, newValues, index + 1, this.values.length - index);
        this.values = newValues;
    }

    public void set(int index, int[] values) {

        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (this.length == this.values.length || this.values.length + values.length >= this.length) {
            throw new ArrayStoreException("Список переполнен.");
        }

        int[] newValues = new int[this.values.length + values.length];
        System.arraycopy(this.values, 0, newValues, 0, index);
        System.arraycopy(values, 0, newValues, index, index + values.length);
        System.arraycopy(this.values, index, newValues, index + 1, this.values.length - index);

        this.values = newValues;
    }

    /**
     * Добавление элементов в массив. При этом текущий размер массива увеличивается.
     * @param index позиция в которую следует вставить набор данных.
     * @param values значения набора данных.
     */
    public void set(int index, List<Integer> values) {

        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (this.length == this.values.length || this.values.length + values.size() >= this.length) {
            throw new ArrayStoreException("Список переполнен.");
        }

        int[] newValues = new int[this.values.length + values.size() + 1];
        System.arraycopy(this.values, 0, newValues, 0, Math.min(index, this.values.length));

        for (int i = 0; i < values.size(); i++) {
            newValues[i + index] = values.get(i);
        }

        if (index < this.values.length) {
            System.arraycopy(this.values, index, newValues, index + values.size() + 1, this.values.length - index);
        }
        this.values = newValues;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int[] newValues = new int[this.values.length - 1];
        System.arraycopy(this.values, 0, newValues, 0, index);
        System.arraycopy(this.values, index + 1, newValues, index, this.values.length - index - 1);
        this.values = newValues;
    }

    public void replace(int index, int value) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.values[index] = value;
    }

    public void replace(int index, int[] values) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(values, 0, this.values, index, values.length);
    }


    public void replace(int index, List<Integer> values) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = 0; i < values.size(); i++) {
            this.values[index + i] = values.get(i);
        }
    }

    public int get(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return this.values[index];
    }

    public boolean isEmpty() {
        return this.values.length == 0;
    }

    public boolean isFree() {
        return this.values.length < this.length;
    }

    public int getSize() {
        return this.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    public int[] toArray() {
        return Arrays.copyOf(this.values, this.values.length);
    }

}
