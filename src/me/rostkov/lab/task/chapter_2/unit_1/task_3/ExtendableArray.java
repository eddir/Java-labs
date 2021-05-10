package me.rostkov.lab.task.chapter_2.unit_1.task_3;

import java.util.Arrays;
import java.util.List;

/**
 * Массив с неограниченной длиной (в пределах возможностей языка).
 */
public class ExtendableArray {
    /**
     * Элементы массива.
     */
    private int[] values;
    /**
     * Текущая длина массива.
     */
    private int length;

    public ExtendableArray() {
        this.values = new int[0];
        this.length = 0;
    }

    public ExtendableArray(int... values) {
        this.values = values;
        this.length = values.length;
    }

    public ExtendableArray(List<Integer> values) {
        this.length = values.size();
        this.values = new int[length];
        int i = 0;
        for (Integer value : values) {
            this.values[i++] = value;
        }
    }

    /**
     * Добавить элемент в конец массива.
     *
     * @param value элемент.
     */
    public void add(int value) {
        this.length++;
        this.values = Arrays.copyOf(this.values, this.length);
        this.values[this.length - 1] = value;
    }

    /**
     * Добавить несколько элементов в конец массива.
     *
     * @param values массив новых элементов.
     */
    public void add(int[] values) {
        this.length += values.length;
        int[] newValues = new int[this.length];
        System.arraycopy(this.values, 0, newValues, 0, this.values.length);
        System.arraycopy(values, 0, newValues, this.values.length, values.length);
        this.values = newValues;
    }

    /**
     * Добавить несколько элементов в конец массива.
     *
     * @param values список новых элементов.
     */
    public void add(List<Integer> values) {
        this.add(values.stream().mapToInt(i -> i).toArray());
    }

    /**
     * Вставить новый элемент в массив.
     *
     * @param index позиция в которую вставлять.
     * @param value элемент для вставки.
     */
    public void set(int index, int value) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.length++;
        int[] newValues = new int[this.length];
        System.arraycopy(this.values, 0, newValues, 0, Math.min(index, this.values.length));
        newValues[index] = value;
        if (this.values.length > index) {
            System.arraycopy(this.values, index, newValues, index + 1, this.values.length - index);
        }
        this.values = newValues;
    }

    /**
     * Вставить новые элементы в массив.
     *
     * @param index  позиция вставки.
     * @param values элементы для вставки.
     */
    public void set(int index, int[] values) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index > this.length) {
            this.length += index - this.length;
        }
        this.length += values.length;
        int[] newValues = new int[this.length];
        System.arraycopy(this.values, 0, newValues, 0, Math.min(this.values.length, index));
        System.arraycopy(values, 0, newValues, index, values.length);
        if (this.values.length > index) {
            System.arraycopy(this.values, index, newValues, index + 1, this.values.length - index);
        }

        this.values = newValues;
    }

    /**
     * Добавление элементов в массив. При этом текущий размер массива увеличивается.
     *
     * @param index  позиция в которую следует вставить набор данных.
     * @param values значения набора данных.
     */
    public void set(int index, List<Integer> values) {
        this.set(index, values.stream().mapToInt(i -> i).toArray());
    }

    /**
     * Удаление элемента из массива.
     * @param index позиция элемента.
     */
    public void remove(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.length--;
        int[] newValues = new int[this.length];
        System.arraycopy(this.values, 0, newValues, 0, index);
        System.arraycopy(this.values, index + 1, newValues, index, this.values.length - index - 1);
        this.values = newValues;
    }

    /**
     * Замена элемента.
     * @param index позиция элемента.
     * @param value новый элемент.
     */
    public void replace(int index, int value) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        this.values[index] = value;
    }

    /**
     * Замена нескольких элементов.
     * @param index позиция начала среза.
     * @param values новые значения.
     */
    public void replace(int index, int[] values) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index + values.length > this.length) {
            this.length = index + values.length;
            this.values = Arrays.copyOf(this.values, this.length);
        }

        System.arraycopy(values, 0, this.values, index, values.length);
    }

    /**
     * Замена нескольких элементов.
     * @param index позиция начала среза.
     * @param values новые значения.
     */
    public void replace(int index, List<Integer> values) {
        this.replace(index, values.stream().mapToInt(i -> i).toArray());
    }

    /**
     * Получения значения элемента.
     * @param index позиция элемента.
     * @return значение элемента.
     */
    public int get(int index) {
        if (index < 0 || index >= this.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return this.values[index];
    }

    /**
     * Проверка массива на пустоту.
     * @return true, если в массиве нет ни одного элемента. false, если в массиве есть хотя-бы один элемент.
     */
    public boolean isEmpty() {
        return this.values.length == 0;
    }

    /**
     * Получение размера массива.
     * @return количество элементов в массиве.
     */
    public int getSize() {
        return this.length;
    }

    /**
     * Преобразование массива в строку.
     * @return строка со значениями элементов массива.
     */
    @Override
    public String toString() {
        return Arrays.toString(values);
    }

    /**
     * Преобразование в массив.
     * @return массив значений элементов.
     */
    public int[] toArray() {
        return Arrays.copyOf(this.values, this.values.length);
    }

}
