package me.rostkov.lab.task.chapter_5.unit_3.task_1;

import java.util.Arrays;

public class Apply {

    public Integer apply(String value) {
        return value.length();
    }

    public Integer apply(Integer value) {
        return Math.abs(value);
    }

    public Integer apply(Integer[] value) {
        return Arrays.stream(value).mapToInt(v -> v).max().orElse(0);
    }

}
