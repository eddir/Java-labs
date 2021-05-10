package me.rostkov.lab.task.chapter_1.unit_6.task_4;

import me.rostkov.lab.task.chapter_1.unit_5.task_5.Fraction;

/**
 * Класс дроби с запретом на отрицательный знаменатель
 */
public class StrictlyFraction extends Fraction {
    public StrictlyFraction(int numerator, int denominator) {
        super(numerator, denominator);
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным.");
        }
    }
}
