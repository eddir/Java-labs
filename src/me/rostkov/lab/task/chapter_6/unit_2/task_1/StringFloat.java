package me.rostkov.lab.task.chapter_6.unit_2.task_1;

public class StringFloat implements Floatable{
    private final String string;

    public StringFloat(String value) {
        this.string = value;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(string);
    }
}
