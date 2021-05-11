package me.rostkov.lab.task.chapter_6.unit_2.task_1;

public class NumberFloat implements Floatable{
    private Number number;

    public NumberFloat(Number number) {
        this.number = number;
    }

    @Override
    public float floatValue() {
        return number.floatValue();
    }
}
