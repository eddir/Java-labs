package me.rostkov.lab.task.chapter_2.unit_1;

import me.rostkov.lab.task.chapter_1.unit_1.Point;

public class Straight {

    Point point1;
    Point point2;

    public Straight(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }


    @Override
    public String toString() {
        return String.format("Линия от %s до %s", this.point1, this.point2);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}
