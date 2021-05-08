package me.rostkov.lab.task.chapter_1.unit_4.task_1;

import me.rostkov.lab.task.chapter_1.unit_1.task_1.Point;

public class StrictlyPoint {
    private int x;
    private int y;

    public StrictlyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клон Point не поддерживается");
            return new Point();
        }
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + '}';
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
