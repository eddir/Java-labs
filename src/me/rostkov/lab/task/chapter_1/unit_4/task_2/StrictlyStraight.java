package me.rostkov.lab.task.chapter_1.unit_4.task_2;

import me.rostkov.lab.task.chapter_1.unit_4.task_1.StrictlyPoint;

public class StrictlyStraight {
    StrictlyPoint point1;
    StrictlyPoint point2;

    public StrictlyStraight(StrictlyPoint point1, StrictlyPoint point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public StrictlyStraight(int x1, int y1, int x2, int y2) {
        this.point1 = new StrictlyPoint(x1, y1);
        this.point2 = new StrictlyPoint(x2, y2);
    }

    @Override
    public String toString() {
        return String.format("Линия от %s до %s", this.point1, this.point2);
    }

    public StrictlyPoint getPoint1() {
        return point1;
    }

    public void setPoint1(StrictlyPoint point1) {
        this.point1 = point1;
    }

    public StrictlyPoint getPoint2() {
        return point2;
    }

    public void setPoint2(StrictlyPoint point2) {
        this.point2 = point2;
    }

}
